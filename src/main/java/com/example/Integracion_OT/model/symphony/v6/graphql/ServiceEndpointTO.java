package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceEndpointTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    private EquipmentPortTO port;
    @javax.validation.constraints.NotNull
    private EquipmentTO equipment;
    @javax.validation.constraints.NotNull
    private ServiceTO service;
    @javax.validation.constraints.NotNull
    private ServiceEndpointDefinitionTO definition;

    public ServiceEndpointTO() {
    }

    public ServiceEndpointTO(String id, EquipmentPortTO port, EquipmentTO equipment, ServiceTO service, ServiceEndpointDefinitionTO definition) {
        this.id = id;
        this.port = port;
        this.equipment = equipment;
        this.service = service;
        this.definition = definition;
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

    public EquipmentPortTO getPort() {
        return port;
    }

    public void setPort(EquipmentPortTO port) {
        this.port = port;
    }

    public EquipmentTO getEquipment() {
        return equipment;
    }

    public void setEquipment(EquipmentTO equipment) {
        this.equipment = equipment;
    }

    public ServiceTO getService() {
        return service;
    }

    public void setService(ServiceTO service) {
        this.service = service;
    }

    public ServiceEndpointDefinitionTO getDefinition() {
        return definition;
    }

    public void setDefinition(ServiceEndpointDefinitionTO definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (port != null) {
            joiner.add("port: " + GraphQLRequestSerializer.getEntry(port));
        }
        if (equipment != null) {
            joiner.add("equipment: " + GraphQLRequestSerializer.getEntry(equipment));
        }
        if (service != null) {
            joiner.add("service: " + GraphQLRequestSerializer.getEntry(service));
        }
        if (definition != null) {
            joiner.add("definition: " + GraphQLRequestSerializer.getEntry(definition));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private EquipmentPortTO port;
        private EquipmentTO equipment;
        private ServiceTO service;
        private ServiceEndpointDefinitionTO definition;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setPort(EquipmentPortTO port) {
            this.port = port;
            return this;
        }

        public Builder setEquipment(EquipmentTO equipment) {
            this.equipment = equipment;
            return this;
        }

        public Builder setService(ServiceTO service) {
            this.service = service;
            return this;
        }

        public Builder setDefinition(ServiceEndpointDefinitionTO definition) {
            this.definition = definition;
            return this;
        }


        public ServiceEndpointTO build() {
            return new ServiceEndpointTO(id, port, equipment, service, definition);
        }

    }
}
