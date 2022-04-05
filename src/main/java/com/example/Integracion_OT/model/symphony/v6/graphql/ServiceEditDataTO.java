package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceEditDataTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private String name;
    private String externalId;
    private ServiceStatusTO status;
    private String customerId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> upstreamServiceIds;
    private java.util.List<PropertyInputTO> properties;

    public ServiceEditDataTO() {
    }

    public ServiceEditDataTO(String id, String name, String externalId, ServiceStatusTO status, String customerId, java.util.List<String> upstreamServiceIds, java.util.List<PropertyInputTO> properties) {
        this.id = id;
        this.name = name;
        this.externalId = externalId;
        this.status = status;
        this.customerId = customerId;
        this.upstreamServiceIds = upstreamServiceIds;
        this.properties = properties;
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

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public ServiceStatusTO getStatus() {
        return status;
    }

    public void setStatus(ServiceStatusTO status) {
        this.status = status;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public java.util.List<String> getUpstreamServiceIds() {
        return upstreamServiceIds;
    }

    public void setUpstreamServiceIds(java.util.List<String> upstreamServiceIds) {
        this.upstreamServiceIds = upstreamServiceIds;
    }

    public java.util.List<PropertyInputTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyInputTO> properties) {
        this.properties = properties;
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
        if (externalId != null) {
            joiner.add("externalId: " + GraphQLRequestSerializer.getEntry(externalId));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (customerId != null) {
            joiner.add("customerId: " + GraphQLRequestSerializer.getEntry(customerId));
        }
        if (upstreamServiceIds != null) {
            joiner.add("upstreamServiceIds: " + GraphQLRequestSerializer.getEntry(upstreamServiceIds));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String externalId;
        private ServiceStatusTO status;
        private String customerId;
        private java.util.List<String> upstreamServiceIds;
        private java.util.List<PropertyInputTO> properties;

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

        public Builder setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public Builder setStatus(ServiceStatusTO status) {
            this.status = status;
            return this;
        }

        public Builder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setUpstreamServiceIds(java.util.List<String> upstreamServiceIds) {
            this.upstreamServiceIds = upstreamServiceIds;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyInputTO> properties) {
            this.properties = properties;
            return this;
        }


        public ServiceEditDataTO build() {
            return new ServiceEditDataTO(id, name, externalId, status, customerId, upstreamServiceIds, properties);
        }

    }
}
