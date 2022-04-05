package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KqiPerspectiveEdgeTO implements java.io.Serializable {

    private KqiPerspectiveTO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public KqiPerspectiveEdgeTO() {
    }

    public KqiPerspectiveEdgeTO(KqiPerspectiveTO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The kqi perspective at the end of the edge.
     */
    public KqiPerspectiveTO getNode() {
        return node;
    }

    /**
     * The kqi perspective at the end of the edge.
     */
    public void setNode(KqiPerspectiveTO node) {
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

        private KqiPerspectiveTO node;
        private String cursor;

        public Builder() {
        }

        /**
         * The kqi perspective at the end of the edge.
         */
        public Builder setNode(KqiPerspectiveTO node) {
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


        public KqiPerspectiveEdgeTO build() {
            return new KqiPerspectiveEdgeTO(node, cursor);
        }

    }
}
