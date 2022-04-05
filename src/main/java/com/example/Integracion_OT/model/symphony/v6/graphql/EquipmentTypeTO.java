package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentTypeTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String category;
    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentPositionDefinitionTO> positionDefinitions;
    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentPortDefinitionTO> portDefinitions;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTypeTO> propertyTypes;
    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentTO> equipments;
    private int numberOfEquipment;

    public EquipmentTypeTO() {
    }

    public EquipmentTypeTO(String id, String name, String category, java.util.List<EquipmentPositionDefinitionTO> positionDefinitions, java.util.List<EquipmentPortDefinitionTO> portDefinitions, java.util.List<PropertyTypeTO> propertyTypes, java.util.List<EquipmentTO> equipments, int numberOfEquipment) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.positionDefinitions = positionDefinitions;
        this.portDefinitions = portDefinitions;
        this.propertyTypes = propertyTypes;
        this.equipments = equipments;
        this.numberOfEquipment = numberOfEquipment;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public java.util.List<EquipmentPositionDefinitionTO> getPositionDefinitions() {
        return positionDefinitions;
    }

    public void setPositionDefinitions(java.util.List<EquipmentPositionDefinitionTO> positionDefinitions) {
        this.positionDefinitions = positionDefinitions;
    }

    public java.util.List<EquipmentPortDefinitionTO> getPortDefinitions() {
        return portDefinitions;
    }

    public void setPortDefinitions(java.util.List<EquipmentPortDefinitionTO> portDefinitions) {
        this.portDefinitions = portDefinitions;
    }

    public java.util.List<PropertyTypeTO> getPropertyTypes() {
        return propertyTypes;
    }

    public void setPropertyTypes(java.util.List<PropertyTypeTO> propertyTypes) {
        this.propertyTypes = propertyTypes;
    }

    public java.util.List<EquipmentTO> getEquipments() {
        return equipments;
    }

    public void setEquipments(java.util.List<EquipmentTO> equipments) {
        this.equipments = equipments;
    }

    public int getNumberOfEquipment() {
        return numberOfEquipment;
    }

    public void setNumberOfEquipment(int numberOfEquipment) {
        this.numberOfEquipment = numberOfEquipment;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (category != null) {
            joiner.add("category: " + GraphQLRequestSerializer.getEntry(category));
        }
        if (positionDefinitions != null) {
            joiner.add("positionDefinitions: " + GraphQLRequestSerializer.getEntry(positionDefinitions));
        }
        if (portDefinitions != null) {
            joiner.add("portDefinitions: " + GraphQLRequestSerializer.getEntry(portDefinitions));
        }
        if (propertyTypes != null) {
            joiner.add("propertyTypes: " + GraphQLRequestSerializer.getEntry(propertyTypes));
        }
        if (equipments != null) {
            joiner.add("equipments: " + GraphQLRequestSerializer.getEntry(equipments));
        }
        joiner.add("numberOfEquipment: " + GraphQLRequestSerializer.getEntry(numberOfEquipment));
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String category;
        private java.util.List<EquipmentPositionDefinitionTO> positionDefinitions;
        private java.util.List<EquipmentPortDefinitionTO> portDefinitions;
        private java.util.List<PropertyTypeTO> propertyTypes;
        private java.util.List<EquipmentTO> equipments;
        private int numberOfEquipment;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setPositionDefinitions(java.util.List<EquipmentPositionDefinitionTO> positionDefinitions) {
            this.positionDefinitions = positionDefinitions;
            return this;
        }

        public Builder setPortDefinitions(java.util.List<EquipmentPortDefinitionTO> portDefinitions) {
            this.portDefinitions = portDefinitions;
            return this;
        }

        public Builder setPropertyTypes(java.util.List<PropertyTypeTO> propertyTypes) {
            this.propertyTypes = propertyTypes;
            return this;
        }

        public Builder setEquipments(java.util.List<EquipmentTO> equipments) {
            this.equipments = equipments;
            return this;
        }

        public Builder setNumberOfEquipment(int numberOfEquipment) {
            this.numberOfEquipment = numberOfEquipment;
            return this;
        }


        public EquipmentTypeTO build() {
            return new EquipmentTypeTO(id, name, category, positionDefinitions, portDefinitions, propertyTypes, equipments, numberOfEquipment);
        }

    }
}
