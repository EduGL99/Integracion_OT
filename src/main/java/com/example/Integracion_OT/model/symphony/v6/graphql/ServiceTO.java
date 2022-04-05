package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceTO implements java.io.Serializable, NamedNodeTO, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String externalId;
    @javax.validation.constraints.NotNull
    private ServiceStatusTO status;
    private CustomerTO customer;
    @javax.validation.constraints.NotNull
    private ServiceTypeTO serviceType;
    @javax.validation.constraints.NotNull
    private java.util.List<ServiceTO> upstream;
    @javax.validation.constraints.NotNull
    private java.util.List<ServiceTO> downstream;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTO> properties;
    @javax.validation.constraints.NotNull
    private java.util.List<ServiceEndpointTO> endpoints;
    @javax.validation.constraints.NotNull
    private java.util.List<LinkTO> links;
    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentPortTO> ports;
    @javax.validation.constraints.NotNull
    private NetworkTopologyTO topology;

    public ServiceTO() {
    }

    public ServiceTO(String id, String name, String externalId, ServiceStatusTO status, CustomerTO customer, ServiceTypeTO serviceType, java.util.List<ServiceTO> upstream, java.util.List<ServiceTO> downstream, java.util.List<PropertyTO> properties, java.util.List<ServiceEndpointTO> endpoints, java.util.List<LinkTO> links, java.util.List<EquipmentPortTO> ports, NetworkTopologyTO topology) {
        this.id = id;
        this.name = name;
        this.externalId = externalId;
        this.status = status;
        this.customer = customer;
        this.serviceType = serviceType;
        this.upstream = upstream;
        this.downstream = downstream;
        this.properties = properties;
        this.endpoints = endpoints;
        this.links = links;
        this.ports = ports;
        this.topology = topology;
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

    /**
     * The name of the object.
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the object.
     */
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

    public CustomerTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerTO customer) {
        this.customer = customer;
    }

    public ServiceTypeTO getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceTypeTO serviceType) {
        this.serviceType = serviceType;
    }

    public java.util.List<ServiceTO> getUpstream() {
        return upstream;
    }

    public void setUpstream(java.util.List<ServiceTO> upstream) {
        this.upstream = upstream;
    }

    public java.util.List<ServiceTO> getDownstream() {
        return downstream;
    }

    public void setDownstream(java.util.List<ServiceTO> downstream) {
        this.downstream = downstream;
    }

    public java.util.List<PropertyTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyTO> properties) {
        this.properties = properties;
    }

    public java.util.List<ServiceEndpointTO> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(java.util.List<ServiceEndpointTO> endpoints) {
        this.endpoints = endpoints;
    }

    public java.util.List<LinkTO> getLinks() {
        return links;
    }

    public void setLinks(java.util.List<LinkTO> links) {
        this.links = links;
    }

    public java.util.List<EquipmentPortTO> getPorts() {
        return ports;
    }

    public void setPorts(java.util.List<EquipmentPortTO> ports) {
        this.ports = ports;
    }

    public NetworkTopologyTO getTopology() {
        return topology;
    }

    public void setTopology(NetworkTopologyTO topology) {
        this.topology = topology;
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
        if (customer != null) {
            joiner.add("customer: " + GraphQLRequestSerializer.getEntry(customer));
        }
        if (serviceType != null) {
            joiner.add("serviceType: " + GraphQLRequestSerializer.getEntry(serviceType));
        }
        if (upstream != null) {
            joiner.add("upstream: " + GraphQLRequestSerializer.getEntry(upstream));
        }
        if (downstream != null) {
            joiner.add("downstream: " + GraphQLRequestSerializer.getEntry(downstream));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (endpoints != null) {
            joiner.add("endpoints: " + GraphQLRequestSerializer.getEntry(endpoints));
        }
        if (links != null) {
            joiner.add("links: " + GraphQLRequestSerializer.getEntry(links));
        }
        if (ports != null) {
            joiner.add("ports: " + GraphQLRequestSerializer.getEntry(ports));
        }
        if (topology != null) {
            joiner.add("topology: " + GraphQLRequestSerializer.getEntry(topology));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String externalId;
        private ServiceStatusTO status;
        private CustomerTO customer;
        private ServiceTypeTO serviceType;
        private java.util.List<ServiceTO> upstream;
        private java.util.List<ServiceTO> downstream;
        private java.util.List<PropertyTO> properties;
        private java.util.List<ServiceEndpointTO> endpoints;
        private java.util.List<LinkTO> links;
        private java.util.List<EquipmentPortTO> ports;
        private NetworkTopologyTO topology;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The name of the object.
         */
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

        public Builder setCustomer(CustomerTO customer) {
            this.customer = customer;
            return this;
        }

        public Builder setServiceType(ServiceTypeTO serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        public Builder setUpstream(java.util.List<ServiceTO> upstream) {
            this.upstream = upstream;
            return this;
        }

        public Builder setDownstream(java.util.List<ServiceTO> downstream) {
            this.downstream = downstream;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyTO> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setEndpoints(java.util.List<ServiceEndpointTO> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder setLinks(java.util.List<LinkTO> links) {
            this.links = links;
            return this;
        }

        public Builder setPorts(java.util.List<EquipmentPortTO> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setTopology(NetworkTopologyTO topology) {
            this.topology = topology;
            return this;
        }


        public ServiceTO build() {
            return new ServiceTO(id, name, externalId, status, customer, serviceType, upstream, downstream, properties, endpoints, links, ports, topology);
        }

    }
}
