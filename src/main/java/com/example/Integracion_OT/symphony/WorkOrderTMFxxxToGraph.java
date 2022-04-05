package com.example.Integracion_OT.symphony;

import com.example.Integracion_OT.service.impl.SymphonyWorkOrderTypeService;
import com.example.Integracion_OT.model.symphony.v6.graphql.*;
import com.example.Integracion_OT.model.tmfxxx.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class WorkOrderTMFxxxToGraph {

    @Autowired
    SymphonyWorkOrderTypeService simphonyWorkOrderTypeService;

    @Autowired
    WorkOrderTypeTMFxxxToGraph workOrderTypeTMFxxxToGraph;

    public WorkOrderTO transform(WorkTicket workTicket) {
        WorkOrderTO workOrderTO = new WorkOrderTO();
        workOrderTO.setId(workTicket.getId());
        workOrderTO.setCreationDate(workTicket.getCreationDate());
        workOrderTO.setDescription(workTicket.getDescription());
        workOrderTO.setName(workTicket.getName());
        workOrderTO.setPriority(priority(workTicket.getPriority()));
        workOrderTO.setCloseDate(workTicket.getResolutionDate());
        workOrderTO.setStatus(statusWorkOrderTO(workTicket.getStatus()));
        WorkOrderTypeTO workOrderType = workOrderType(workTicket.get_atType());
        workOrderTO.setWorkOrderType(workOrderType);
        workOrderTO.setFiles(files(workTicket.getAttachment()));
        workOrderTO.setProperties(properties(workTicket.getCharacteristic(), workOrderType));
        workOrderTO.setCheckListCategories(checkListCategories(workTicket.getChecklist(), workOrderType));
        workOrderTO.setHyperlinks(hyperlinks(workTicket.getCharacteristic()));
        workOrderTO.setComments(comments(workTicket.getNote()));
        workOrderTO.setProject(project(workTicket.getRelatedEntity()));
        workOrderTO.setLocation(location(workTicket.getRelatedEntity()));
        workOrderTO.setOwner(owner(workTicket.getRelatedParty()));
        workOrderTO.setAssignedTo(assigned(workTicket.getRelatedParty()));
        return workOrderTO;
    }

    private WorkOrderPriorityTO priority(String priority) {
        WorkOrderPriorityTO wop = WorkOrderPriorityTO.NONE;
        if (priority != null) {
            switch (priority.toLowerCase()) {
                case "urgent":
                    wop = WorkOrderPriorityTO.URGENT;
                    break;
                case "high":
                    wop = WorkOrderPriorityTO.HIGH;
                    break;
                case "medium":
                    wop = WorkOrderPriorityTO.MEDIUM;
                    break;
                case "low":
                    wop = WorkOrderPriorityTO.LOW;
                    break;
            }
        }
        return wop;
    }

    private WorkOrderStatusTO statusWorkOrderTO(WorkTicketStatusType status) {
        WorkOrderStatusTO statusWO = WorkOrderStatusTO.PLANNED;
        if (status != null) {
            switch (status.getValue()) {
                case "closed":
                    statusWO = WorkOrderStatusTO.CLOSED;
                    break;
                case "inProgress":
                    statusWO = WorkOrderStatusTO.IN_PROGRESS;
                    break;
                case "resolved":
                    statusWO = WorkOrderStatusTO.SUBMITTED;
                    break;
                case "held":
                    statusWO = WorkOrderStatusTO.BLOCKED;
                    break;
            }
        }
        return statusWO;
    }

    private List<FileTO> files(List<AttachmentRefOrValue> attachments) {
        if (attachments != null && attachments.size() > 0) {
            List<FileTO> files = new ArrayList<>();
            attachments.forEach(a -> {
                FileTO file = new FileTO();
                file.setId(a.getId());
                file.setFileType(FileTypeTO.FILE);
                file.setMimeType(a.getMimeType());
                file.setFileName(a.getName());
                file.setSizeInBytes(a.getSize().getAmount().intValue());
                files.add(file);
            });
            return files;
        }
        return null;
    }

    private List<PropertyTO> properties(List<Characteristic> props, WorkOrderTypeTO workOrderType) {
        if (props != null && props.size() > 0) {
            List<PropertyTO> properties = new ArrayList<>();
            workOrderType.getPropertyTypes().forEach(p -> {
                // TODO - make logic for capture the field mandatory
                PropertyTO prop = new PropertyTO();
                prop.setPropertyType(p);
                String value = "";
                if (props.stream().filter(cr -> !cr.get_atBaseType().equals("hyperlink"))
                        .anyMatch(c -> c.getName().equals(p.getName()))) {
                    Characteristic ch = props.stream()
                            .filter(cr -> !cr.get_atBaseType().equals("hyperlink"))
                            .filter(c -> c.getName().equals(p.getName())).collect(Collectors.toList()).get(0);
                    prop.setId(ch.getId());
                    value = String.valueOf((ch.getValue() != null ? ch.getValue() : ""));
                }
                PropertyTO property = propertyDefineValue(prop, value);
                properties.add(property);
            });
            return properties;
        }
        return null;
    }

    private PropertyTO propertyDefineValue(PropertyTO prop, String value) {
        PropertyTypeTO pt = prop.getPropertyType();
        // TODO - make support for other types (gps, range, etc)
        switch (pt.getType().toString().toLowerCase()) {
            case "enum":
                List<String> listOptions;
                boolean exist = false;
                if (pt.getStringValue() != null && value != null) {
                    String[] options = pt.getStringValue().replace("[", "")
                            .replace("]", "").replace("\"", "").split(",");
                    listOptions = Arrays.asList(options);
                    exist = listOptions.contains(value);
                }
                prop.setStringValue((exist ? value : ""));
                break;
            case "int":
                prop.setIntValue((!value.equals("") ? Integer.parseInt(value) :
                        (pt.getIntValue() != null ? pt.getIntValue() : 0)));
                break;
            case "bool":
                prop.setBooleanValue((!value.equals("") && Boolean.parseBoolean(value)));
                break;
            case "float":
                prop.setFloatValue((!value.equals("") ? Double.parseDouble(value) :
                        (pt.getFloatValue() != null ? pt.getFloatValue() : 0.0)));
                break;
            case "node":
                if (value != null && !value.equals("")) {
                    NameNodeTOImpl nameNode = new NameNodeTOImpl();
                    nameNode.setId(value);
                    prop.setNodeValue(nameNode);
                }
                break;
            default:
                prop.setStringValue((!value.equals("") ? value :
                        (pt.getStringValue() != null ? pt.getStringValue() : "")));
        }
        return prop;
    }

    private List<CheckListCategoryTO> checkListCategories(List<CheckList> checks, WorkOrderTypeTO workOrderType) {
        List<CheckListCategoryTO> checkListCategories = new ArrayList<>();
        if (workOrderType.getCheckListCategoryDefinitions() != null && workOrderType
                .getCheckListCategoryDefinitions().size() > 0) {
            workOrderType.getCheckListCategoryDefinitions().forEach(c -> {
                CheckList checkList;
                CheckListCategoryTO check = new CheckListCategoryTO();
                check.setTitle(c.getTitle());
                check.setDescription(c.getDescription());
                List<Item> listItems = null;
                if (checks != null && checks.size() > 0 && checks.stream()
                        .anyMatch(cl -> cl.getName().equals(c.getTitle()))) {
                    checkList = checks.stream().filter(cl -> cl.getName().equals(c.getTitle()))
                            .collect(Collectors.toList()).get(0);
                    check.setId(checkList.getId());
                    check.setTitle(checkList.getName());
                    check.setDescription((checkList.getDescription() != null ? checkList.getDescription() :
                            c.getDescription()));
                    listItems = checkList.getItem();
                }
                if (c.getChecklistItemDefinitions() != null && c.getChecklistItemDefinitions().size() > 0) {
                    List<CheckListItemTO> items = new ArrayList<>();
                    List<Item> finalListItems = listItems;
                    c.getChecklistItemDefinitions().forEach(i -> {
                        CheckListItemTO item = new CheckListItemTO();
                        item.setTitle(i.getTitle());
                        item.setType(i.getType());
                        item.setEnumSelectionMode(i.getEnumSelectionMode());
                        item.setEnumValues(i.getEnumValues());
                        item.setHelpText(i.getHelpText());
                        Item checkListItem = null;
                        if (finalListItems != null && finalListItems.stream()
                                .anyMatch(it -> it.getName().equals(i.getTitle()))) {
                            checkListItem = finalListItems.stream().filter(it -> it.getName().equals(i.getTitle()))
                                    .collect(Collectors.toList()).get(0);
                            item.setId(checkListItem.getId());
                            item.setHelpText(checkListItem.getDescription());
                        }
                        items.add(itemDefineValue(item, checkListItem));
                    });
                    check.setCheckList(items);
                }

                checkListCategories.add(check);
            });
        }
        if (checks != null && checks.size() > 0) {
            checks.forEach(c -> {
                if (checkListCategories.stream().noneMatch(cl -> cl.getTitle().equals(c.getName()))) {
                    CheckListCategoryTO checkListCategoryTO = new CheckListCategoryTO();
                    checkListCategoryTO.setId(c.getId());
                    checkListCategoryTO.setTitle(c.getName());
                    checkListCategoryTO.setDescription(c.getDescription());
                    if (c.getItem() != null) {
                        List<CheckListItemTO> checkListItemTOList = new ArrayList<>();
                        c.getItem().forEach(i -> {
                            CheckListItemTO checkListItemTO = new CheckListItemTO();
                            checkListItemTO.setTitle(i.getName());
                            checkListItemTO.setType(CheckListItemTypeTO.fromValue(i.getValueType().toLowerCase()));
                            checkListItemTO.setHelpText(i.getDescription());
                            checkListItemTO.setEnumValues(i.getOptions());
                            checkListItemTO = itemDefineValue(checkListItemTO, i);
                            checkListItemTOList.add(checkListItemTO);
                        });
                        checkListCategoryTO.setCheckList(checkListItemTOList);
                    }
                    checkListCategories.add(checkListCategoryTO);
                }
            });
        }
        return checkListCategories;
    }

    private CheckListItemTO itemDefineValue(CheckListItemTO checkListItem, Item item) {
        if (item != null && item.getValue() != null) {
            switch (checkListItem.getType().toString().toLowerCase()) {
                case "simple":
                    checkListItem.setChecked((Boolean) item.getValue());
                    break;
                case "string":
                    checkListItem.setStringValue((String) item.getValue());
                    break;
                case "enum":
                    checkListItem.setSelectedEnumValues((String) item.getValue());
                    break;
                case "yes_no":
                    checkListItem.setYesNoResponse(YesNoResponseTO.fromValue(item.getValue().toString().toUpperCase()));
                    break;
                case "files":
                case "cell_scan":
                case "wifiscan":
                    // TODO - make support for this field types
                    log.debug("*** Type " + checkListItem.getType().toString() + " for checklistItem unsupported.");
                    break;
            }
        }
        return checkListItem;
    }

    private List<HyperlinkTO> hyperlinks(List<Characteristic> props) {
        if (props != null && props.size() > 0) {
            if (props.stream().anyMatch(p -> p.get_atBaseType().equals("hyperlink"))) {
                List<HyperlinkTO> hyperlinks = new ArrayList<>();
                props.stream().filter(p -> p.get_atBaseType().equals("hyperlink")).forEach(h -> {
                    HyperlinkTO hyperlink = new HyperlinkTO();
                    hyperlink.setId(h.getId());
                    hyperlink.setDisplayName(h.getName());
                    hyperlink.setUrl(String.valueOf(h.getValue()));
                    hyperlinks.add(hyperlink);
                });
                return hyperlinks;
            }
        }
        return null;
    }

    private List<CommentTO> comments(List<Note> notes) {
        if (notes != null && notes.size() > 0) {
            List<CommentTO> comments = new ArrayList<>();
            notes.forEach(n -> {
                CommentTO comment = new CommentTO();
                comment.setId(n.getId());
                comment.setText(n.getText());
                comment.setCreateTime(n.getDate());
                UserTO author = new UserTO();
                author.setName(n.getAuthor());
                comment.setAuthor(author);
                comments.add(comment);
            });
            return comments;
        }
        return null;
    }

    private ProjectTO project(List<RelatedEntity> related) {
        if (related != null) {
            List<RelatedEntity> proj = related.stream().filter(r -> r.get_atBaseType().equals("project"))
                    .collect(Collectors.toList());
            if (proj.size() > 0) {
                RelatedEntity pr = proj.get(0);
                ProjectTO project = new ProjectTO();
                project.setId(pr.getId());
                project.setName(pr.getName());
                ProjectTypeTO projectType = new ProjectTypeTO();
                projectType.setName(pr.get_atType());
                project.setType(projectType);
                return project;
            }
        }
        return null;
    }

    private LocationTO location(List<RelatedEntity> related) {
        if (related != null) {
            List<RelatedEntity> loc = related.stream().filter(r -> r.get_atBaseType().equals("location"))
                    .collect(Collectors.toList());
            if (loc.size() > 0) {
                RelatedEntity l = loc.get(0);
                LocationTO location = new LocationTO();
                location.setId(l.getId());
                location.setName(l.getName());
                LocationTypeTO locationType = new LocationTypeTO();
                locationType.setName(l.get_atType());
                location.setLocationType(locationType);
                return location;
            }
        }
        return null;
    }

    private UserTO owner(List<RelatedParty> party) {
        if (party != null) {
            List<RelatedParty> own = party.stream().filter(r -> r.get_atType().equals("OWNER"))
                    .collect(Collectors.toList());
            if (own.size() > 0) {
                RelatedParty o = own.get(0);
                UserTO owner = new UserTO();
                owner.setId(o.getId());
                owner.setName(o.getName());
                owner.setRole(UserRoleTO.OWNER);
                return owner;
            }
        }
        return null;
    }

    private UserTO assigned(List<RelatedParty> party) {
        if (party != null) {
            List<RelatedParty> ass = party.stream().filter(r -> r.get_atType().equals("ASSIGNED"))
                    .collect(Collectors.toList());
            if (ass.size() > 0) {
                RelatedParty a = ass.get(0);
                UserTO assigned = new UserTO();
                assigned.setId(a.getId());
                assigned.setName(a.getName());
                assigned.setRole(UserRoleTO.OWNER);
                return assigned;
            }
        }
        return null;
    }

    private WorkOrderTypeTO workOrderType(String workTicketType) {
        try {
            List<WorkTicket> listWorkOrderTypes = simphonyWorkOrderTypeService.list(new LinkedHashMap<>());
            WorkTicket workticket = listWorkOrderTypes.stream().filter(t -> t.get_atType().equals(workTicketType))
                    .collect(Collectors.toList()).get(0);
            return workOrderTypeTMFxxxToGraph.transform(workticket);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
