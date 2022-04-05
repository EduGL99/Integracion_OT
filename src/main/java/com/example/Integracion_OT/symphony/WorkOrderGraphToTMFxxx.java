package com.example.Integracion_OT.symphony;

import com.example.Integracion_OT.model.symphony.v6.graphql.*;
import com.example.Integracion_OT.model.tmfxxx.*;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
@Slf4j
public class WorkOrderGraphToTMFxxx {

    public WorkTicket transform(WorkOrderTO workOrder) {
        WorkTicket workTicket = new WorkTicket();
        workTicket.setId(workOrder.getId());
        workTicket.setHref("/tmf-api/workTicketManagement/v1/workTicket/" + workOrder.getId() + "?@baseType=workOrder");
        workTicket.setCreationDate(changeTimeZone(workOrder.getCreationDate()));
        workTicket.setDescription(workOrder.getDescription());
        workTicket.setName(workOrder.getName());
        workTicket.setPriority(priority(workOrder.getPriority()));
        workTicket.setResolutionDate(changeTimeZone(workOrder.getCloseDate()));
        workTicket.setTicketType(workOrder.getWorkOrderType().getName());
        workTicket.setStatus(status(workOrder.getStatus()));
        workTicket.setAttachment(attachments(workOrder.getFiles()));
        workTicket.setChecklist(checkList(workOrder.getCheckListCategories()));
        workTicket.setCharacteristic(characteristics(workOrder.getProperties(), workOrder.getHyperlinks()));
        workTicket.setNote(notes(workOrder.getComments()));
        workTicket.setRelatedEntity(relatedEntities(workOrder.getProject(), workOrder.getLocation(),
                workOrder.getOrganizationFk()));
        workTicket.setRelatedParty(relatedParties(workOrder.getOwner(), workOrder.getAssignedTo()));
        workTicket.set_atBaseType("workOrder");
        workTicket.set_atType(workOrder.getWorkOrderType().getName());
        return workTicket;
    }

    private String priority(WorkOrderPriorityTO priority) {
        String p = null;
        if (priority != null) {
            p = priority.toString().toLowerCase();
        }
        return p;
    }

    private WorkTicketStatusType status(WorkOrderStatusTO state) {
        WorkTicketStatusType status = WorkTicketStatusType.ACKNOWLEDGED;
        switch (state.toString()) {
            case "DONE":
            case "CLOSED":
                status = WorkTicketStatusType.CLOSED;
                break;
            case "PENDING":
                status = WorkTicketStatusType.PENDING;
                break;
            case "IN_PROGRESS":
                status = WorkTicketStatusType.INPROGRESS;
                break;
            case "SUBMITTED":
                status = WorkTicketStatusType.RESOLVED;
                break;
            case "BLOCKED":
                status = WorkTicketStatusType.HELD;
                break;
        }
        return status;
    }

    private List<AttachmentRefOrValue> attachments(List<FileTO> files) {
        if (files != null && files.size() > 0) {
            List<AttachmentRefOrValue> attachments = new ArrayList<>();
            files.forEach(f -> {
                AttachmentRefOrValue attachment = new AttachmentRefOrValue();
                attachment.setId(f.getId());
                attachment.setAttachmentType(f.getFileType().toString());
                attachment.setMimeType(f.getMimeType());
                attachment.setName(f.getFileName());
                Quantity q = new Quantity();
                q.setAmount(f.getSizeInBytes().floatValue());
                q.setUnits("bytes");
                attachment.setSize(q);
                attachments.add(attachment);
            });
            return attachments;
        }
        return null;
    }

    private List<Characteristic> characteristics(List<PropertyTO> props, List<HyperlinkTO> hyperlinks) {
        if ((props != null && props.size() > 0) || (hyperlinks != null && hyperlinks.size() > 0)) {
            List<Characteristic> characteristics = new ArrayList<>();
            if (props != null) {
                props.forEach(p -> {
                    Characteristic characteristic = new Characteristic();
                    characteristic.setId(p.getId());
                    characteristic.setName(p.getPropertyType().getName());
                    characteristic.setValueType(p.getPropertyType().getType().toString().toLowerCase());
                    characteristic.setValue(propertyDefineValue(p));
                    characteristic.set_atBaseType("propertyType");
                    if (p.getPropertyType().getType().getValue().equals("node")) {
                        characteristic.set_atType("node" + p.getPropertyType().getNodeType());
                    }
                    characteristics.add(characteristic);
                });
            }
            if (hyperlinks != null) {
                hyperlinks.forEach(h -> {
                    Characteristic characteristic = new Characteristic();
                    characteristic.setId(h.getId());
                    characteristic.setName(h.getDisplayName());
                    characteristic.setValueType("string");
                    characteristic.setValue(h.getUrl());
                    characteristic.set_atBaseType("hyperlink");
                    characteristics.add(characteristic);
                });
            }
            return characteristics;
        }
        return null;
    }

    private String propertyDefineValue(PropertyTO prop) {
        String value;
        // TODO - make support for other types (gps, range, etc)
        switch (prop.getPropertyType().getType().toString().toLowerCase()) {
            case "int":
                value = (prop.getIntValue() != null ? String.valueOf(prop.getIntValue()) : "");
                break;
            case "bool":
                value = (prop.getBooleanValue() != null ? String.valueOf(prop.getBooleanValue()) : "");
                break;
            case "float":
                value = (prop.getFloatValue() != null ? String.valueOf(prop.getFloatValue()) : "");
                break;
            case "node":
                value = (prop.getNodeValue() != null && prop.getNodeValue().getId() != null
                        ? prop.getNodeValue().getId() : "");
                break;
            default:
                value = (prop.getStringValue() != null ? prop.getStringValue() : "");
        }
        return value;
    }

    private List<CheckList> checkList(List<CheckListCategoryTO> checkListCategories) {
        if (checkListCategories != null && checkListCategories.size() > 0) {
            List<CheckList> cls = new ArrayList<>();
            checkListCategories.forEach(c -> {
                CheckList cl = new CheckList();
                cl.setId(c.getId());
                cl.setDescription(c.getDescription());
                cl.setName(c.getTitle());
                if (c.getCheckList() != null && c.getCheckList().size() > 0) {
                    List<Item> items = new ArrayList<>();
                    c.getCheckList().forEach(i -> {
                        Item item = new Item();
                        item.setId(i.getId());
                        item.setName(i.getTitle());
                        item.setDescription(i.getHelpText());
                        item.setValueType(i.getType().toString());
                        item.setOptions(i.getEnumValues());
                        item.setValue(itemDefineValue(i));
                        items.add(item);
                    });
                    cl.setItem(items);
                }
                cls.add(cl);
            });
            return cls;
        }
        return null;
    }

    private Object itemDefineValue(CheckListItemTO item) {
        Object value = null;
        switch (item.getType().toString().toLowerCase()) {
            case "simple":
                value = item.getChecked();
                break;
            case "string":
                value = item.getStringValue();
                break;
            case "enum":
                value = item.getSelectedEnumValues();
                break;
            case "files":
                value = item.getFiles();
                break;
            case "yes_no":
                value = (item.getYesNoResponse() != null ? item.getYesNoResponse().toString().toLowerCase() : null);
                break;
            case "cell_scan":
            case "wifiscan":
                value = "Unsupported type";
                break;
        }
        return value;
    }

    private List<Note> notes(List<CommentTO> comments) {
        if (comments != null && comments.size() > 0) {
            List<Note> notes = new ArrayList<>();
            comments.forEach(c -> {
                Note note = new Note();
                note.setId(c.getId());
                note.setText(c.getText());
                note.setDate(c.getCreateTime());
                note.setAuthor(c.getAuthor().getName());
                notes.add(note);
            });
            return notes;
        }
        return null;
    }

    private List<RelatedEntity> relatedEntities(ProjectTO project, LocationTO location, OrganizationTO organization) {
        if (project != null || location != null || organization != null) {
            List<RelatedEntity> relatedEntities = new ArrayList<>();
            if (project != null) {
                RelatedEntity relatedEntity = new RelatedEntity();
                relatedEntity.setId(project.getId());
                relatedEntity.setHref("/tmf-api/workTicketManagement/v1/workTicket/"
                        + project.getId() + "?@baseType=project");
                relatedEntity.setName(project.getName());
                relatedEntity.setRole("project");
                relatedEntity.set_atBaseType("project");
                relatedEntity.set_atType(project.getType().getName());
                relatedEntities.add(relatedEntity);
            }
            if (location != null) {
                RelatedEntity relatedEntity = new RelatedEntity();
                relatedEntity.setId(location.getId());
                relatedEntity.setHref("/tmf-api/resourceInventoryManagement/v1/resource/"
                        + location.getId() + "?@baseType=location");
                relatedEntity.setName(location.getName());
                relatedEntity.setRole("location");
                relatedEntity.set_atBaseType("location");
                relatedEntity.set_atType(location.getLocationType().getName());
                relatedEntities.add(relatedEntity);
            }
            if (organization != null) {
                RelatedEntity relatedEntity = new RelatedEntity();
                relatedEntity.setId(organization.getId());
                relatedEntity.setName(organization.getName());
                relatedEntity.setRole("organization");
                relatedEntity.set_atBaseType("organization");
                relatedEntities.add(relatedEntity);
            }
            return relatedEntities;
        }
        return null;
    }

    private List<RelatedParty> relatedParties(UserTO owner, UserTO assigned) {
        if (owner != null || assigned != null) {
            List<RelatedParty> relatedParties = new ArrayList<>();
            if (owner != null) {
                RelatedParty relatedParty = new RelatedParty();
                relatedParty.setId(owner.getId());
                relatedParty.setHref("/tmf-api/userManagement/v1/user/" + owner.getId());
                relatedParty.setName(owner.getName());
                relatedParty.setRole("OWNER");
                relatedParty.set_atBaseType("user");
                relatedParty.set_atType("OWNER");
                relatedParties.add(relatedParty);
            }
            if (assigned != null) {
                RelatedParty relatedParty = new RelatedParty();
                relatedParty.setId(assigned.getId());
                relatedParty.setHref("/tmf-api/userManagement/v1/user/" + assigned.getId());
                relatedParty.setName(assigned.getName());
                relatedParty.setRole("ASSIGNED");
                relatedParty.set_atBaseType("user");
                relatedParty.set_atType("ASSIGNED");
                relatedParties.add(relatedParty);
            }
            return relatedParties;
        }
        return null;
    }

    private String changeTimeZone(String dateTime) {
        if (dateTime != null) {
            DateTimeFormatter df = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZ");
            DateTime dateToChange = df.withOffsetParsed().parseDateTime(dateTime);
            DateTimeFormatter regionZone = df.withZone(DateTimeZone.forID("America/Bogota"));
            Date date = dateToChange.toDate();
            DateTime dateTimeToShow = new DateTime(date);
            return dateTimeToShow.toString(regionZone);
        }
        return null;
    }
}
