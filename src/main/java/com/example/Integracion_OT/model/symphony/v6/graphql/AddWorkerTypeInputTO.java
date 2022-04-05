package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddWorkerTypeInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTypeInputTO> propertyTypes;

    public AddWorkerTypeInputTO() {
    }

    public AddWorkerTypeInputTO(String name, String description, java.util.List<PropertyTypeInputTO> propertyTypes) {
        this.name = name;
        this.description = description;
        this.propertyTypes = propertyTypes;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.List<PropertyTypeInputTO> getPropertyTypes() {
        return propertyTypes;
    }

    public void setPropertyTypes(java.util.List<PropertyTypeInputTO> propertyTypes) {
        this.propertyTypes = propertyTypes;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (propertyTypes != null) {
            joiner.add("propertyTypes: " + GraphQLRequestSerializer.getEntry(propertyTypes));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String name;
        private String description;
        private java.util.List<PropertyTypeInputTO> propertyTypes;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setPropertyTypes(java.util.List<PropertyTypeInputTO> propertyTypes) {
            this.propertyTypes = propertyTypes;
            return this;
        }


        public AddWorkerTypeInputTO build() {
            return new AddWorkerTypeInputTO(name, description, propertyTypes);
        }

    }
}
