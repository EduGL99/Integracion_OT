package com.example.Integracion_OT.symphony;

import com.example.Integracion_OT.model.symphony.v6.graphql.*;
import com.example.Integracion_OT.model.tmfxxx.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class ProjectGraphToTMFxxx {

    public WorkTicket transform(ProjectTO project) {
        WorkTicket workTicket = new WorkTicket();
        workTicket.setId(project.getId());
        workTicket.setHref("/tmf-api/workTicketManagement/v1/workTicket/" + project.getId() + "?@baseType=project");
        workTicket.setDescription(project.getDescription());
        workTicket.setName(project.getName());
        workTicket.setTicketType(project.getType().getName());
        workTicket.setCharacteristic(characteristics(project.getProperties()));
        workTicket.setNote(notes(project.getComments()));
        workTicket.setRelatedEntity(relatedEntities(project.getLocation()));
        workTicket.setRelatedParty(relatedParties(project.getCreatedBy()));
        workTicket.setWorkTicketRelationship(workTicketRelationships(project.getWorkOrders()));
        workTicket.set_atBaseType("project");
        workTicket.set_atType(project.getType().getName());
        workTicket.setPriority(priority(project.getPriority()));
        return workTicket;
    }

    private String priority(ProjectPriorityTO priority) {
        String p = null;
        if (priority != null) {
            p = priority.toString().toLowerCase();
        }
        return p;
    }

    private List<Characteristic> characteristics(List<PropertyTO> props) {
        if (props != null && props.size() > 0) {
            List<Characteristic> characteristics = new ArrayList<>();
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
            return characteristics;
        }
        return null;
    }

    private String propertyDefineValue(PropertyTO prop) {
        String value;
        // TODO - make support for other types (gps, node, etc)
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

    private List<RelatedEntity> relatedEntities(LocationTO location) {
        if (location != null) {
            List<RelatedEntity> relatedEntities = new ArrayList<>();
            RelatedEntity relatedEntity = new RelatedEntity();
            relatedEntity.setId(location.getId());
            relatedEntity.setHref("/tmf-api/resourceInventoryManagement/v1/resource/"
                    + location.getId() + "?@baseType=location");
            relatedEntity.setName(location.getName());
            relatedEntity.setRole("location");
            relatedEntity.set_atBaseType("location");
            relatedEntity.set_atType(location.getLocationType().getName());
            relatedEntities.add(relatedEntity);
            return relatedEntities;
        }
        return null;
    }

    private List<RelatedParty> relatedParties(UserTO owner) {
        if (owner != null) {
            List<RelatedParty> relatedParties = new ArrayList<>();
            RelatedParty relatedParty = new RelatedParty();
            relatedParty.setId(owner.getId());
            relatedParty.setHref("/tmf-api/userManagement/v1/user/" + owner.getId());
            relatedParty.setName(owner.getName());
            relatedParty.setRole("OWNER");
            relatedParty.set_atBaseType("user");
            relatedParty.set_atType("OWNER");
            relatedParties.add(relatedParty);
            return relatedParties;
        }
        return null;
    }

    private List<WorkTicketRelationship> workTicketRelationships(List<WorkOrderTO> workOrders) {
        if (workOrders != null && workOrders.size() > 0) {
            List<WorkTicketRelationship> workTicketRelationships = new ArrayList<>();
            workOrders.forEach(w -> {
                WorkTicketRelationship workTicketRelationship = new WorkTicketRelationship();
                workTicketRelationship.setId(w.getId());
                workTicketRelationship.setHref("/tmf-api/workTicketManagement/v1/workTicket/" + w.getId()
                        + "?@baseType=workOrder");
                workTicketRelationship.setName(w.getName());
                workTicketRelationship.setRelationshipType("workOrder");
                workTicketRelationship.set_atBaseType("workOrder");
                workTicketRelationship.set_atType(w.getWorkOrderType().getName());
                workTicketRelationships.add(workTicketRelationship);
            });
            return workTicketRelationships;
        }
        return null;
    }
}