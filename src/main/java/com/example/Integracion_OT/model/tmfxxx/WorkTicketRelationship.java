package com.example.Integracion_OT.model.tmfxxx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkTicketRelationship {
    @JsonProperty("id")
    private String id;

    @JsonProperty("href")
    private String href;

    @JsonProperty("name")
    private String name;

    @JsonProperty("relationshipType")
    private String relationshipType;

    @JsonProperty("@baseType")
    private String _atBaseType;

    @JsonProperty("@schemaLocation")
    private String _atSchemaLocation;

    @JsonProperty("@type")
    private String _atType;

    public WorkTicketRelationship(WorkTicketRelationship element) {
        id = element.getId();
        href = element.getHref();
        name = element.getName();
        relationshipType = element.getRelationshipType();
        _atBaseType = element.get_atBaseType();
        _atSchemaLocation = element.get_atSchemaLocation();
        _atType = element.get_atType();
    }

    /**
     * Method for merge an old object WorkTicketRelationship with new object WorkTicketRelationship.
     * The old data is overwritten with the new data
     *
     * @param newData new object WorkTicketRelationship type to merge
     * @return WorkTicketRelationship Object merged
     */
    public WorkTicketRelationship merge(WorkTicketRelationship newData) {
        WorkTicketRelationship workTicketRelationship = new WorkTicketRelationship(this);
        workTicketRelationship.setName((newData.getName() != null ? newData.getName() : name));
        workTicketRelationship.setRelationshipType((newData.getRelationshipType() != null ?
                newData.getRelationshipType() : relationshipType));
        workTicketRelationship.set_atBaseType((newData.get_atBaseType() != null ? newData.get_atBaseType() :
                _atBaseType));
        workTicketRelationship.set_atSchemaLocation((newData.get_atSchemaLocation() != null ?
                newData.get_atSchemaLocation() : _atSchemaLocation));
        workTicketRelationship.set_atType((newData.get_atType() != null ? newData.get_atType() : _atType));
        return workTicketRelationship;
    }
}
