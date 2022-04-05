package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KpiEdgeTO implements java.io.Serializable {

    private KpiTO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public KpiEdgeTO() {
    }

    public KpiEdgeTO(KpiTO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The kpi's at the end of the edge.
     */
    public KpiTO getNode() {
        return node;
    }

    /**
     * The kpi's at the end of the edge.
     */
    public void setNode(KpiTO node) {
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

        private KpiTO node;
        private String cursor;

        public Builder() {
        }

        /**
         * The kpi's at the end of the edge.
         */
        public Builder setNode(KpiTO node) {
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


        public KpiEdgeTO build() {
            return new KpiEdgeTO(node, cursor);
        }

    }
}
