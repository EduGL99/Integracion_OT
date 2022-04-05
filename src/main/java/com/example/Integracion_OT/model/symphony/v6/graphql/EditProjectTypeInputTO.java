package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditProjectTypeInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTypeInputTO> properties;
    @javax.validation.constraints.NotNull
    private java.util.List<WorkOrderDefinitionInputTO> workOrders;

    public EditProjectTypeInputTO() {
    }

    public EditProjectTypeInputTO(String id, String name, String description, java.util.List<PropertyTypeInputTO> properties, java.util.List<WorkOrderDefinitionInputTO> workOrders) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.properties = properties;
        this.workOrders = workOrders;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.List<PropertyTypeInputTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyTypeInputTO> properties) {
        this.properties = properties;
    }

    public java.util.List<WorkOrderDefinitionInputTO> getWorkOrders() {
        return workOrders;
    }

    public void setWorkOrders(java.util.List<WorkOrderDefinitionInputTO> workOrders) {
        this.workOrders = workOrders;
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
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (workOrders != null) {
            joiner.add("workOrders: " + GraphQLRequestSerializer.getEntry(workOrders));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private java.util.List<PropertyTypeInputTO> properties;
        private java.util.List<WorkOrderDefinitionInputTO> workOrders;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyTypeInputTO> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setWorkOrders(java.util.List<WorkOrderDefinitionInputTO> workOrders) {
            this.workOrders = workOrders;
            return this;
        }


        public EditProjectTypeInputTO build() {
            return new EditProjectTypeInputTO(id, name, description, properties, workOrders);
        }

    }
}
