package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentPortDefinitionEdgeTO implements java.io.Serializable {

    private EquipmentPortDefinitionTO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public EquipmentPortDefinitionEdgeTO() {
    }

    public EquipmentPortDefinitionEdgeTO(EquipmentPortDefinitionTO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The equipment port definition at the end of the edge.
     */
    public EquipmentPortDefinitionTO getNode() {
        return node;
    }

    /**
     * The equipment port definition at the end of the edge.
     */
    public void setNode(EquipmentPortDefinitionTO node) {
        this.node = node;
    }

    /**
     * A cursor for use in pagination.
     */
    public String getCursor() {
        return cursor;
    }

    /**
     * A cursor for use in pagination.
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (node != null) {
            joiner.add("node: " + GraphQLRequestSerializer.getEntry(node));
        }
        if (cursor != null) {
            joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor));
        }
        return joiner.toString();
    }

    public static class Builder {

        private EquipmentPortDefinitionTO node;
        private String cursor;

        public Builder() {
        }

        /**
         * The equipment port definition at the end of the edge.
         */
        public Builder setNode(EquipmentPortDefinitionTO node) {
            this.node = node;
            return this;
        }

        /**
         * A cursor for use in pagination.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public EquipmentPortDefinitionEdgeTO build() {
            return new EquipmentPortDefinitionEdgeTO(node, cursor);
        }

    }
}
