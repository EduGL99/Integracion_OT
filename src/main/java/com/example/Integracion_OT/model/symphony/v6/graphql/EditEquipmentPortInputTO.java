package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditEquipmentPortInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private LinkSideTO side;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyInputTO> properties;

    public EditEquipmentPortInputTO() {
    }

    public EditEquipmentPortInputTO(LinkSideTO side, java.util.List<PropertyInputTO> properties) {
        this.side = side;
        this.properties = properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public LinkSideTO getSide() {
        return side;
    }

    public void setSide(LinkSideTO side) {
        this.side = side;
    }

    public java.util.List<PropertyInputTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyInputTO> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (side != null) {
            joiner.add("side: " + GraphQLRequestSerializer.getEntry(side));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        return joiner.toString();
    }

    public static class Builder {

        private LinkSideTO side;
        private java.util.List<PropertyInputTO> properties;

        public Builder() {
        }

        public Builder setSide(LinkSideTO side) {
            this.side = side;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyInputTO> properties) {
            this.properties = properties;
            return this;
        }


        public EditEquipmentPortInputTO build() {
            return new EditEquipmentPortInputTO(side, properties);
        }

    }
}
