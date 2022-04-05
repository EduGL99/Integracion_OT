package com.example.Integracion_OT.symphony;

import com.example.Integracion_OT.service.impl.SymphonyProjectTypeService;
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
public class ProjectTMFxxxToGraph {

    @Autowired
    SymphonyProjectTypeService symphonyProjectTypeService;

    @Autowired
    ProjectTypeTMFxxxToGraph projectTypeTMFxxxToGraph;

    public ProjectTO transform(WorkTicket workTicket) {
        ProjectTO project = new ProjectTO();
        project.setId(workTicket.getId());
        project.setName(workTicket.getName());
        project.setDescription(workTicket.getDescription());
        ProjectTypeTO projectType = projectType(workTicket.get_atType());
        project.setType(projectType);
        project.setComments(comments(workTicket.getNote()));
        project.setProperties(properties(workTicket.getCharacteristic(), projectType));
        project.setLocation(location(workTicket.getRelatedEntity()));
        project.setCreatedBy(owner(workTicket.getRelatedParty()));
        project.setWorkOrders(workOrders(workTicket.getWorkTicketRelationship()));
        project.setPriority(priority(workTicket.getPriority()));
        return project;
    }

    private ProjectPriorityTO priority(String priority) {
        ProjectPriorityTO pp = ProjectPriorityTO.NONE;
        if (priority != null) {
            switch (priority.toLowerCase()) {
                case "urgent":
                    pp = ProjectPriorityTO.URGENT;
                    break;
                case "high":
                    pp = ProjectPriorityTO.HIGH;
                    break;
                case "medium":
                    pp = ProjectPriorityTO.MEDIUM;
                    break;
                case "low":
                    pp = ProjectPriorityTO.LOW;
                    break;
            }
        }
        return pp;
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

    private List<PropertyTO> properties(List<Characteristic> props, ProjectTypeTO projectType) {
        if (props != null && props.size() > 0) {
            List<PropertyTO> properties = new ArrayList<>();
            projectType.getProperties().forEach(p -> {
                // TODO - make logic for capture the field mandatory
                PropertyTO prop = new PropertyTO();
                prop.setPropertyType(p);
                String value = "";
                if (props.stream().anyMatch(c -> c.getName().equals(p.getName()))) {
                    Characteristic ch = props.stream()
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
                String[] options = pt.getStringValue().replace("[", "").replace("]", "")
                        .replace("\"", "").split(",");
                List<String> listOptions = Arrays.asList(options);
                prop.setStringValue((listOptions.contains(value) ? value : ""));
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

    private List<WorkOrderTO> workOrders(List<WorkTicketRelationship> worktickets) {
        if (worktickets != null && worktickets.size() > 0) {
            List<WorkOrderTO> workOrders = new ArrayList<>();
            worktickets.forEach(w -> {
                WorkOrderTO workOrder = new WorkOrderTO();
                workOrder.setId(w.getId());
                workOrder.setName(w.getName());
                // TODO - Add work order type
                workOrders.add(workOrder);
            });
            return workOrders;
        }
        return null;
    }

    private ProjectTypeTO projectType(String projectType) {
        try {
            List<WorkTicket> listProjectTypes = symphonyProjectTypeService.list(new LinkedHashMap<>());
            WorkTicket workTicket = listProjectTypes.stream().filter(t -> t.get_atType().equals(projectType))
                    .collect(Collectors.toList()).get(0);
            return projectTypeTMFxxxToGraph.transform(workTicket);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
