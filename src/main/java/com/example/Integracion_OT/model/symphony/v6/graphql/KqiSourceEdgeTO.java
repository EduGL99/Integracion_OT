package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KqiSourceEdgeTO implements java.io.Serializable {

    private KqiSourceTO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public KqiSourceEdgeTO() {
    }

    public KqiSourceEdgeTO(KqiSourceTO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The kqi source at the end of the edge.
     */
    public KqiSourceTO getNode() {
        return node;
    }

    /**
     * The kqi source at the end of the edge.
     */
    public void setNode(KqiSourceTO node) {
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

        private KqiSourceTO node;
        private String cursor;

        public Builder() {
        }

        /**
         * The kqi source at the end of the edge.
         */
        public Builder setNode(KqiSourceTO node) {
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


        public KqiSourceEdgeTO build() {
            return new KqiSourceEdgeTO(node, cursor);
        }

    }
}
