package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LinkTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentPortTO> ports;
    private FutureStateTO futureState;
    private WorkOrderTO workOrder;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTO> properties;
    @javax.validation.constraints.NotNull
    private java.util.List<ServiceTO> services;

    public LinkTO() {
    }

    public LinkTO(String id, java.util.List<EquipmentPortTO> ports, FutureStateTO futureState, WorkOrderTO workOrder, java.util.List<PropertyTO> properties, java.util.List<ServiceTO> services) {
        this.id = id;
        this.ports = ports;
        this.futureState = futureState;
        this.workOrder = workOrder;
        this.properties = properties;
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

    public java.util.List<EquipmentPortTO> getPorts() {
        return ports;
    }

    public void setPorts(java.util.List<EquipmentPortTO> ports) {
        this.ports = ports;
    }

    public FutureStateTO getFutureState() {
        return futureState;
    }

    public void setFutureState(FutureStateTO futureState) {
        this.futureState = futureState;
    }

    public WorkOrderTO getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(WorkOrderTO workOrder) {
        this.workOrder = workOrder;
    }

    public java.util.List<PropertyTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyTO> properties) {
        this.properties = properties;
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
        if (ports != null) {
            joiner.add("ports: " + GraphQLRequestSerializer.getEntry(ports));
        }
        if (futureState != null) {
            joiner.add("futureState: " + GraphQLRequestSerializer.getEntry(futureState));
        }
        if (workOrder != null) {
            joiner.add("workOrder: " + GraphQLRequestSerializer.getEntry(workOrder));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (services != null) {
            joiner.add("services: " + GraphQLRequestSerializer.getEntry(services));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private java.util.List<EquipmentPortTO> ports;
        private FutureStateTO futureState;
        private WorkOrderTO workOrder;
        private java.util.List<PropertyTO> properties;
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

        public Builder setPorts(java.util.List<EquipmentPortTO> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setFutureState(FutureStateTO futureState) {
            this.futureState = futureState;
            return this;
        }

        public Builder setWorkOrder(WorkOrderTO workOrder) {
            this.workOrder = workOrder;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyTO> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setServices(java.util.List<ServiceTO> services) {
            this.services = services;
            return this;
        }


        public LinkTO build() {
            return new LinkTO(id, ports, futureState, workOrder, properties, services);
        }

    }
}
