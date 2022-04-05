package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPortTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private EquipmentPortDefinitionTO definition;
    @javax.validation.constraints.NotNull
    private EquipmentTO parentEquipment;
    private LinkTO link;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTO> properties;
    @javax.validation.constraints.NotNull
    private java.util.List<ServiceEndpointTO> serviceEndpoints;
    @javax.validation.constraints.NotNull
    private java.util.List<ServiceTO> services;

    public EquipmentPortTO() {
    }

    public EquipmentPortTO(String id, EquipmentPortDefinitionTO definition, EquipmentTO parentEquipment, LinkTO link, java.util.List<PropertyTO> properties, java.util.List<ServiceEndpointTO> serviceEndpoints, java.util.List<ServiceTO> services) {
        this.id = id;
        this.definition = definition;
        this.parentEquipment = parentEquipment;
        this.link = link;
        this.properties = properties;
        this.serviceEndpoints = serviceEndpoints;
        this.services = services;
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

    public EquipmentPortDefinitionTO getDefinition() {
        return definition;
    }

    public void setDefinition(EquipmentPortDefinitionTO definition) {
        this.definition = definition;
    }

    public EquipmentTO getParentEquipment() {
        return parentEquipment;
    }

    public void setParentEquipment(EquipmentTO parentEquipment) {
        this.parentEquipment = parentEquipment;
    }

    public LinkTO getLink() {
        return link;
    }

    public void setLink(LinkTO link) {
        this.link = link;
    }

    public java.util.List<PropertyTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyTO> properties) {
        this.properties = properties;
    }

    public java.util.List<ServiceEndpointTO> getServiceEndpoints() {
        return serviceEndpoints;
    }

    public void setServiceEndpoints(java.util.List<ServiceEndpointTO> serviceEndpoints) {
        this.serviceEndpoints = serviceEndpoints;
    }

    public java.util.List<ServiceTO> getServices() {
        return services;
    }

    public void setServices(java.util.List<ServiceTO> services) {
        this.services = services;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (definition != null) {
            joiner.add("definition: " + GraphQLRequestSerializer.getEntry(definition));
        }
        if (parentEquipment != null) {
            joiner.add("parentEquipment: " + GraphQLRequestSerializer.getEntry(parentEquipment));
        }
        if (link != null) {
            joiner.add("link: " + GraphQLRequestSerializer.getEntry(link));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (serviceEndpoints != null) {
            joiner.add("serviceEndpoints: " + GraphQLRequestSerializer.getEntry(serviceEndpoints));
        }
        if (services != null) {
            joiner.add("services: " + GraphQLRequestSerializer.getEntry(services));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private EquipmentPortDefinitionTO definition;
        private EquipmentTO parentEquipment;
        private LinkTO link;
        private java.util.List<PropertyTO> properties;
        private java.util.List<ServiceEndpointTO> serviceEndpoints;
        private java.util.List<ServiceTO> services;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setDefinition(EquipmentPortDefinitionTO definition) {
            this.definition = definition;
            return this;
        }

        public Builder setParentEquipment(EquipmentTO parentEquipment) {
            this.parentEquipment = parentEquipment;
            return this;
        }

        public Builder setLink(LinkTO link) {
            this.link = link;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyTO> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setServiceEndpoints(java.util.List<ServiceEndpointTO> serviceEndpoints) {
            this.serviceEndpoints = serviceEndpoints;
            return this;
        }

        public Builder setServices(java.util.List<ServiceTO> services) {
            this.services = services;
            return this;
        }


        public EquipmentPortTO build() {
            return new EquipmentPortTO(id, definition, parentEquipment, link, properties, serviceEndpoints, services);
        }

    }
}
