package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddEquipmentInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String type;
    private String location;
    private String parent;
    private String positionDefinition;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyInputTO> properties;
    private String workOrder;
    private String externalId;

    public AddEquipmentInputTO() {
    }

    public AddEquipmentInputTO(String name, String type, String location, String parent, String positionDefinition, java.util.List<PropertyInputTO> properties, String workOrder, String externalId) {
        this.name = name;
        this.type = type;
        this.location = location;
        this.parent = parent;
        this.positionDefinition = positionDefinition;
        this.properties = properties;
        this.workOrder = workOrder;
        this.externalId = externalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getPositionDefinition() {
        return positionDefinition;
    }

    public void setPositionDefinition(String positionDefinition) {
        this.positionDefinition = positionDefinition;
    }

    public java.util.List<PropertyInputTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyInputTO> properties) {
        this.properties = properties;
    }

    public String getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(String workOrder) {
        this.workOrder = workOrder;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (location != null) {
            joiner.add("location: " + GraphQLRequestSerializer.getEntry(location));
        }
        if (parent != null) {
            joiner.add("parent: " + GraphQLRequestSerializer.getEntry(parent));
        }
        if (positionDefinition != null) {
            joiner.add("positionDefinition: " + GraphQLRequestSerializer.getEntry(positionDefinition));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (workOrder != null) {
            joiner.add("workOrder: " + GraphQLRequestSerializer.getEntry(workOrder));
        }
        if (externalId != null) {
            joiner.add("externalId: " + GraphQLRequestSerializer.getEntry(externalId));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String name;
        private String type;
        private String location;
        private String parent;
        private String positionDefinition;
        private java.util.List<PropertyInputTO> properties;
        private String workOrder;
        private String externalId;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = parent;
            return this;
        }

        public Builder setPositionDefinition(String positionDefinition) {
            this.positionDefinition = positionDefinition;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyInputTO> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setWorkOrder(String workOrder) {
            this.workOrder = workOrder;
            return this;
        }

        public Builder setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }


        public AddEquipmentInputTO build() {
            return new AddEquipmentInputTO(name, type, location, parent, positionDefinition, properties, workOrder, externalId);
        }

    }
}
