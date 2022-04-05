package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TechEdgeTO implements java.io.Serializable {

    private TechTO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public TechEdgeTO() {
    }

    public TechEdgeTO(TechTO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The techs at the end of the edge.
     */
    public TechTO getNode() {
        return node;
    }

    /**
     * The techs at the end of the edge.
     */
    public void setNode(TechTO node) {
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

        private TechTO node;
        private String cursor;

        public Builder() {
        }

        /**
         * The techs at the end of the edge.
         */
        public Builder setNode(TechTO node) {
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


        public TechEdgeTO build() {
            return new TechEdgeTO(node, cursor);
        }

    }
}
