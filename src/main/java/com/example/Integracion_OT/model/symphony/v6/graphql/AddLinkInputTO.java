package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddLinkInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<LinkSideTO> sides;
    private String workOrder;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyInputTO> properties;
    @javax.validation.constraints.NotNull
    private java.util.List<String> serviceIds;

    public AddLinkInputTO() {
    }

    public AddLinkInputTO(java.util.List<LinkSideTO> sides, String workOrder, java.util.List<PropertyInputTO> properties, java.util.List<String> serviceIds) {
        this.sides = sides;
        this.workOrder = workOrder;
        this.properties = properties;
        this.serviceIds = serviceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public java.util.List<LinkSideTO> getSides() {
        return sides;
    }

    public void setSides(java.util.List<LinkSideTO> sides) {
        this.sides = sides;
    }

    public String getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(String workOrder) {
        this.workOrder = workOrder;
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
        if (sides != null) {
            joiner.add("sides: " + GraphQLRequestSerializer.getEntry(sides));
        }
        if (workOrder != null) {
            joiner.add("workOrder: " + GraphQLRequestSerializer.getEntry(workOrder));
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

        private java.util.List<LinkSideTO> sides;
        private String workOrder;
        private java.util.List<PropertyInputTO> properties;
        private java.util.List<String> serviceIds;

        public Builder() {
        }

        public Builder setSides(java.util.List<LinkSideTO> sides) {
            this.sides = sides;
            return this;
        }

        public Builder setWorkOrder(String workOrder) {
            this.workOrder = workOrder;
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


        public AddLinkInputTO build() {
            return new AddLinkInputTO(sides, workOrder, properties, serviceIds);
        }

    }
}
