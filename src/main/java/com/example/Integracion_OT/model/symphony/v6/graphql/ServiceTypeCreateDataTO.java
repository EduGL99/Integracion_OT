package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceTypeCreateDataTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private boolean hasCustomer;
    private java.util.List<PropertyTypeInputTO> properties;
    private java.util.List<ServiceEndpointDefinitionInputTO> endpoints;
    private DiscoveryMethodTO discoveryMethod;

    public ServiceTypeCreateDataTO() {
    }

    public ServiceTypeCreateDataTO(String name, boolean hasCustomer, java.util.List<PropertyTypeInputTO> properties, java.util.List<ServiceEndpointDefinitionInputTO> endpoints, DiscoveryMethodTO discoveryMethod) {
        this.name = name;
        this.hasCustomer = hasCustomer;
        this.properties = properties;
        this.endpoints = endpoints;
        this.discoveryMethod = discoveryMethod;
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

    public boolean getHasCustomer() {
        return hasCustomer;
    }

    public void setHasCustomer(boolean hasCustomer) {
        this.hasCustomer = hasCustomer;
    }

    public java.util.List<PropertyTypeInputTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyTypeInputTO> properties) {
        this.properties = properties;
    }

    public java.util.List<ServiceEndpointDefinitionInputTO> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(java.util.List<ServiceEndpointDefinitionInputTO> endpoints) {
        this.endpoints = endpoints;
    }

    public DiscoveryMethodTO getDiscoveryMethod() {
        return discoveryMethod;
    }

    public void setDiscoveryMethod(DiscoveryMethodTO discoveryMethod) {
        this.discoveryMethod = discoveryMethod;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        joiner.add("hasCustomer: " + GraphQLRequestSerializer.getEntry(hasCustomer));
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (endpoints != null) {
            joiner.add("endpoints: " + GraphQLRequestSerializer.getEntry(endpoints));
        }
        if (discoveryMethod != null) {
            joiner.add("discoveryMethod: " + GraphQLRequestSerializer.getEntry(discoveryMethod));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String name;
        private boolean hasCustomer;
        private java.util.List<PropertyTypeInputTO> properties;
        private java.util.List<ServiceEndpointDefinitionInputTO> endpoints;
        private DiscoveryMethodTO discoveryMethod;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setHasCustomer(boolean hasCustomer) {
            this.hasCustomer = hasCustomer;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyTypeInputTO> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setEndpoints(java.util.List<ServiceEndpointDefinitionInputTO> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder setDiscoveryMethod(DiscoveryMethodTO discoveryMethod) {
            this.discoveryMethod = discoveryMethod;
            return this;
        }


        public ServiceTypeCreateDataTO build() {
            return new ServiceTypeCreateDataTO(name, hasCustomer, properties, endpoints, discoveryMethod);
        }

    }
}
