package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPositionTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private EquipmentPositionDefinitionTO definition;
    @javax.validation.constraints.NotNull
    private EquipmentTO parentEquipment;
    private EquipmentTO attachedEquipment;

    public EquipmentPositionTO() {
    }

    public EquipmentPositionTO(String id, EquipmentPositionDefinitionTO definition, EquipmentTO parentEquipment, EquipmentTO attachedEquipment) {
        this.id = id;
        this.definition = definition;
        this.parentEquipment = parentEquipment;
        this.attachedEquipment = attachedEquipment;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The id of the object.
     */
    public String getId() {
        return id;
    }

    /**
     * The id of the object.
     */
    public void setId(String id) {
        this.id = id;
    }

    public EquipmentPositionDefinitionTO getDefinition() {
        return definition;
    }

    public void setDefinition(EquipmentPositionDefinitionTO definition) {
        this.definition = definition;
    }

    public EquipmentTO getParentEquipment() {
        return parentEquipment;
    }

    public void setParentEquipment(EquipmentTO parentEquipment) {
        this.parentEquipment = parentEquipment;
    }

    public EquipmentTO getAttachedEquipment() {
        return attachedEquipment;
    }

    public void setAttachedEquipment(EquipmentTO attachedEquipment) {
        this.attachedEquipment = attachedEquipment;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (definition != null) {
            joiner.add("definition: " + GraphQLRequestSerializer.getEntry(definition));
        }
        if (parentEquipment != null) {
            joiner.add("parentEquipment: " + GraphQLRequestSerializer.getEntry(parentEquipment));
        }
        if (attachedEquipment != null) {
            joiner.add("attachedEquipment: " + GraphQLRequestSerializer.getEntry(attachedEquipment));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private EquipmentPositionDefinitionTO definition;
        private EquipmentTO parentEquipment;
        private EquipmentTO attachedEquipment;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setDefinition(EquipmentPositionDefinitionTO definition) {
            this.definition = definition;
            return this;
        }

        public Builder setParentEquipment(EquipmentTO parentEquipment) {
            this.parentEquipment = parentEquipment;
            return this;
        }

        public Builder setAttachedEquipment(EquipmentTO attachedEquipment) {
            this.attachedEquipment = attachedEquipment;
            return this;
        }


        public EquipmentPositionTO build() {
            return new EquipmentPositionTO(id, definition, parentEquipment, attachedEquipment);
        }

    }
}
