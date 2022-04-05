package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddEquipmentTypeInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String category;
    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentPositionInputTO> positions;
    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentPortInputTO> ports;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTypeInputTO> properties;

    public AddEquipmentTypeInputTO() {
    }

    public AddEquipmentTypeInputTO(String name, String category, java.util.List<EquipmentPositionInputTO> positions, java.util.List<EquipmentPortInputTO> ports, java.util.List<PropertyTypeInputTO> properties) {
        this.name = name;
        this.category = category;
        this.positions = positions;
        this.ports = ports;
        this.properties = properties;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public java.util.List<EquipmentPositionInputTO> getPositions() {
        return positions;
    }

    public void setPositions(java.util.List<EquipmentPositionInputTO> positions) {
        this.positions = positions;
    }

    public java.util.List<EquipmentPortInputTO> getPorts() {
        return ports;
    }

    public void setPorts(java.util.List<EquipmentPortInputTO> ports) {
        this.ports = ports;
    }

    public java.util.List<PropertyTypeInputTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyTypeInputTO> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (category != null) {
            joiner.add("category: " + GraphQLRequestSerializer.getEntry(category));
        }
        if (positions != null) {
            joiner.add("positions: " + GraphQLRequestSerializer.getEntry(positions));
        }
        if (ports != null) {
            joiner.add("ports: " + GraphQLRequestSerializer.getEntry(ports));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String name;
        private String category;
        private java.util.List<EquipmentPositionInputTO> positions;
        private java.util.List<EquipmentPortInputTO> ports;
        private java.util.List<PropertyTypeInputTO> properties;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setPositions(java.util.List<EquipmentPositionInputTO> positions) {
            this.positions = positions;
            return this;
        }

        public Builder setPorts(java.util.List<EquipmentPortInputTO> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyTypeInputTO> properties) {
            this.properties = properties;
            return this;
        }


        public AddEquipmentTypeInputTO build() {
            return new AddEquipmentTypeInputTO(name, category, positions, ports, properties);
        }

    }
}
