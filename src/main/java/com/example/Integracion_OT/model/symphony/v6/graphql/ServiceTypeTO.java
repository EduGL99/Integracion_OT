package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceTypeTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private boolean isDeleted;
    private boolean hasCustomer;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTypeTO> propertyTypes;
    @javax.validation.constraints.NotNull
    private java.util.List<ServiceTO> services;
    private int numberOfServices;
    @javax.validation.constraints.NotNull
    private java.util.List<ServiceEndpointDefinitionTO> endpointDefinitions;
    @javax.validation.constraints.NotNull
    private DiscoveryMethodTO discoveryMethod;

    public ServiceTypeTO() {
    }

    public ServiceTypeTO(String id, String name, boolean isDeleted, boolean hasCustomer, java.util.List<PropertyTypeTO> propertyTypes, java.util.List<ServiceTO> services, int numberOfServices, java.util.List<ServiceEndpointDefinitionTO> endpointDefinitions, DiscoveryMethodTO discoveryMethod) {
        this.id = id;
        this.name = name;
        this.isDeleted = isDeleted;
        this.hasCustomer = hasCustomer;
        this.propertyTypes = propertyTypes;
        this.services = services;
        this.numberOfServices = numberOfServices;
        this.endpointDefinitions = endpointDefinitions;
        this.discoveryMethod = discoveryMethod;
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

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public boolean getHasCustomer() {
        return hasCustomer;
    }

    public void setHasCustomer(boolean hasCustomer) {
        this.hasCustomer = hasCustomer;
    }

    public java.util.List<PropertyTypeTO> getPropertyTypes() {
        return propertyTypes;
    }

    public void setPropertyTypes(java.util.List<PropertyTypeTO> propertyTypes) {
        this.propertyTypes = propertyTypes;
    }

    public java.util.List<ServiceTO> getServices() {
        return services;
    }

    public void setServices(java.util.List<ServiceTO> services) {
        this.services = services;
    }

    public int getNumberOfServices() {
        return numberOfServices;
    }

    public void setNumberOfServices(int numberOfServices) {
        this.numberOfServices = numberOfServices;
    }

    public java.util.List<ServiceEndpointDefinitionTO> getEndpointDefinitions() {
        return endpointDefinitions;
    }

    public void setEndpointDefinitions(java.util.List<ServiceEndpointDefinitionTO> endpointDefinitions) {
        this.endpointDefinitions = endpointDefinitions;
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
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        joiner.add("isDeleted: " + GraphQLRequestSerializer.getEntry(isDeleted));
        joiner.add("hasCustomer: " + GraphQLRequestSerializer.getEntry(hasCustomer));
        if (propertyTypes != null) {
            joiner.add("propertyTypes: " + GraphQLRequestSerializer.getEntry(propertyTypes));
        }
        if (services != null) {
            joiner.add("services: " + GraphQLRequestSerializer.getEntry(services));
        }
        joiner.add("numberOfServices: " + GraphQLRequestSerializer.getEntry(numberOfServices));
        if (endpointDefinitions != null) {
            joiner.add("endpointDefinitions: " + GraphQLRequestSerializer.getEntry(endpointDefinitions));
        }
        if (discoveryMethod != null) {
            joiner.add("discoveryMethod: " + GraphQLRequestSerializer.getEntry(discoveryMethod));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private boolean isDeleted;
        private boolean hasCustomer;
        private java.util.List<PropertyTypeTO> propertyTypes;
        private java.util.List<ServiceTO> services;
        private int numberOfServices;
        private java.util.List<ServiceEndpointDefinitionTO> endpointDefinitions;
        private DiscoveryMethodTO discoveryMethod;

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

        public Builder setIsDeleted(boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        public Builder setHasCustomer(boolean hasCustomer) {
            this.hasCustomer = hasCustomer;
            return this;
        }

        public Builder setPropertyTypes(java.util.List<PropertyTypeTO> propertyTypes) {
            this.propertyTypes = propertyTypes;
            return this;
        }

        public Builder setServices(java.util.List<ServiceTO> services) {
            this.services = services;
            return this;
        }

        public Builder setNumberOfServices(int numberOfServices) {
            this.numberOfServices = numberOfServices;
            return this;
        }

        public Builder setEndpointDefinitions(java.util.List<ServiceEndpointDefinitionTO> endpointDefinitions) {
            this.endpointDefinitions = endpointDefinitions;
            return this;
        }

        public Builder setDiscoveryMethod(DiscoveryMethodTO discoveryMethod) {
            this.discoveryMethod = discoveryMethod;
            return this;
        }


        public ServiceTypeTO build() {
            return new ServiceTypeTO(id, name, isDeleted, hasCustomer, propertyTypes, services, numberOfServices, endpointDefinitions, discoveryMethod);
        }

    }
}
