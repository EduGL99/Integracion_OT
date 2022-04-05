package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceEndpointDefinitionTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    private int index;
    private String role;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private java.util.List<ServiceEndpointTO> endpoints;
    @javax.validation.constraints.NotNull
    private EquipmentTypeTO equipmentType;
    @javax.validation.constraints.NotNull
    private ServiceTypeTO serviceType;

    public ServiceEndpointDefinitionTO() {
    }

    public ServiceEndpointDefinitionTO(String id, int index, String role, String name, java.util.List<ServiceEndpointTO> endpoints, EquipmentTypeTO equipmentType, ServiceTypeTO serviceType) {
        this.id = id;
        this.index = index;
        this.role = role;
        this.name = name;
        this.endpoints = endpoints;
        this.equipmentType = equipmentType;
        this.serviceType = serviceType;
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

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<ServiceEndpointTO> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(java.util.List<ServiceEndpointTO> endpoints) {
        this.endpoints = endpoints;
    }

    public EquipmentTypeTO getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(EquipmentTypeTO equipmentType) {
        this.equipmentType = equipmentType;
    }

    public ServiceTypeTO getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceTypeTO serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("index: " + GraphQLRequestSerializer.getEntry(index));
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (endpoints != null) {
            joiner.add("endpoints: " + GraphQLRequestSerializer.getEntry(endpoints));
        }
        if (equipmentType != null) {
            joiner.add("equipmentType: " + GraphQLRequestSerializer.getEntry(equipmentType));
        }
        if (serviceType != null) {
            joiner.add("serviceType: " + GraphQLRequestSerializer.getEntry(serviceType));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private int index;
        private String role;
        private String name;
        private java.util.List<ServiceEndpointTO> endpoints;
        private EquipmentTypeTO equipmentType;
        private ServiceTypeTO serviceType;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIndex(int index) {
            this.index = index;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEndpoints(java.util.List<ServiceEndpointTO> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder setEquipmentType(EquipmentTypeTO equipmentType) {
            this.equipmentType = equipmentType;
            return this;
        }

        public Builder setServiceType(ServiceTypeTO serviceType) {
            this.serviceType = serviceType;
            return this;
        }


        public ServiceEndpointDefinitionTO build() {
            return new ServiceEndpointDefinitionTO(id, index, role, name, endpoints, equipmentType, serviceType);
        }

    }
}
