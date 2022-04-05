package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceSearchResultTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<ServiceTO> services;
    private int count;

    public ServiceSearchResultTO() {
    }

    public ServiceSearchResultTO(java.util.List<ServiceTO> services, int count) {
        this.services = services;
        this.count = count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public java.util.List<ServiceTO> getServices() {
        return services;
    }

    public void setServices(java.util.List<ServiceTO> services) {
        this.services = services;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (services != null) {
            joiner.add("services: " + GraphQLRequestSerializer.getEntry(services));
        }
        joiner.add("count: " + GraphQLRequestSerializer.getEntry(count));
        return joiner.toString();
    }

    public static class Builder {

        private java.util.List<ServiceTO> services;
        private int count;

        public Builder() {
        }

        public Builder setServices(java.util.List<ServiceTO> services) {
            this.services = services;
            return this;
        }

        public Builder setCount(int count) {
            this.count = count;
            return this;
        }


        public ServiceSearchResultTO build() {
            return new ServiceSearchResultTO(services, count);
        }

    }
}
