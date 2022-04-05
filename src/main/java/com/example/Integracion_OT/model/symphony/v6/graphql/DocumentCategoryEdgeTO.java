package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocumentCategoryEdgeTO implements java.io.Serializable {

    private DocumentCategoryTO node;
    @javax.validation.constraints.NotNull
    private String cursor;

    public DocumentCategoryEdgeTO() {
    }

    public DocumentCategoryEdgeTO(DocumentCategoryTO node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public DocumentCategoryTO getNode() {
        return node;
    }

    public void setNode(DocumentCategoryTO node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }

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

        private DocumentCategoryTO node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(DocumentCategoryTO node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public DocumentCategoryEdgeTO build() {
            return new DocumentCategoryEdgeTO(node, cursor);
        }

    }
}
