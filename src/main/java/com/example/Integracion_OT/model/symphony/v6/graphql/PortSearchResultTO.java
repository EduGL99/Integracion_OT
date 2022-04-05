package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PortSearchResultTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentPortTO> ports;
    private int count;

    public PortSearchResultTO() {
    }

    public PortSearchResultTO(java.util.List<EquipmentPortTO> ports, int count) {
        this.ports = ports;
        this.count = count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public java.util.List<EquipmentPortTO> getPorts() {
        return ports;
    }

    public void setPorts(java.util.List<EquipmentPortTO> ports) {
        this.ports = ports;
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
        if (ports != null) {
            joiner.add("ports: " + GraphQLRequestSerializer.getEntry(ports));
        }
        joiner.add("count: " + GraphQLRequestSerializer.getEntry(count));
        return joiner.toString();
    }

    public static class Builder {

        private java.util.List<EquipmentPortTO> ports;
        private int count;

        public Builder() {
        }

        public Builder setPorts(java.util.List<EquipmentPortTO> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setCount(int count) {
            this.count = count;
            return this;
        }


        public PortSearchResultTO build() {
            return new PortSearchResultTO(ports, count);
        }

    }
}
