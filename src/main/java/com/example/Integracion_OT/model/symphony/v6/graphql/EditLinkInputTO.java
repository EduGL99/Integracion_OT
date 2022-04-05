package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditLinkInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyInputTO> properties;
    @javax.validation.constraints.NotNull
    private java.util.List<String> serviceIds;

    public EditLinkInputTO() {
    }

    public EditLinkInputTO(String id, java.util.List<PropertyInputTO> properties, java.util.List<String> serviceIds) {
        this.id = id;
        this.properties = properties;
        this.serviceIds = serviceIds;
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

    public java.util.List<PropertyInputTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyInputTO> properties) {
        this.properties = properties;
    }

    public java.util.List<String> getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(java.util.List<String> serviceIds) {
        this.serviceIds = serviceIds;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (serviceIds != null) {
            joiner.add("serviceIds: " + GraphQLRequestSerializer.getEntry(serviceIds));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private java.util.List<PropertyInputTO> properties;
        private java.util.List<String> serviceIds;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyInputTO> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setServiceIds(java.util.List<String> serviceIds) {
            this.serviceIds = serviceIds;
            return this;
        }


        public EditLinkInputTO build() {
            return new EditLinkInputTO(id, properties, serviceIds);
        }

    }
}
