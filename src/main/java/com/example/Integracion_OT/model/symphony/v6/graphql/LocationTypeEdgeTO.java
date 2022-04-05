package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationTypeEdgeTO implements java.io.Serializable {

    private LocationTypeTO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public LocationTypeEdgeTO() {
    }

    public LocationTypeEdgeTO(LocationTypeTO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The location type at the end of the edge.
     */
    public LocationTypeTO getNode() {
        return node;
    }

    /**
     * The location type at the end of the edge.
     */
    public void setNode(LocationTypeTO node) {
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

        private LocationTypeTO node;
        private String cursor;

        public Builder() {
        }

        /**
         * The location type at the end of the edge.
         */
        public Builder setNode(LocationTypeTO node) {
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


        public LocationTypeEdgeTO build() {
            return new LocationTypeEdgeTO(node, cursor);
        }

    }
}
