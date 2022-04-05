package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddServiceEndpointInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private String portId;
    @javax.validation.constraints.NotNull
    private String equipmentID;
    @javax.validation.constraints.NotNull
    private String definition;

    public AddServiceEndpointInputTO() {
    }

    public AddServiceEndpointInputTO(String id, String portId, String equipmentID, String definition) {
        this.id = id;
        this.portId = portId;
        this.equipmentID = equipmentID;
        this.definition = definition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public String getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(String equipmentID) {
        this.equipmentID = equipmentID;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (portId != null) {
            joiner.add("portId: " + GraphQLRequestSerializer.getEntry(portId));
        }
        if (equipmentID != null) {
            joiner.add("equipmentID: " + GraphQLRequestSerializer.getEntry(equipmentID));
        }
        if (definition != null) {
            joiner.add("definition: " + GraphQLRequestSerializer.getEntry(definition));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String portId;
        private String equipmentID;
        private String definition;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setPortId(String portId) {
            this.portId = portId;
            return this;
        }

        public Builder setEquipmentID(String equipmentID) {
            this.equipmentID = equipmentID;
            return this;
        }

        public Builder setDefinition(String definition) {
            this.definition = definition;
            return this;
        }


        public AddServiceEndpointInputTO build() {
            return new AddServiceEndpointInputTO(id, portId, equipmentID, definition);
        }

    }
}
