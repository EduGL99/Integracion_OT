package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private CommentEntityTO entityType;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String text;

    public CommentInputTO() {
    }

    public CommentInputTO(CommentEntityTO entityType, String id, String text) {
        this.entityType = entityType;
        this.id = id;
        this.text = text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public CommentEntityTO getEntityType() {
        return entityType;
    }

    public void setEntityType(CommentEntityTO entityType) {
        this.entityType = entityType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entityType != null) {
            joiner.add("entityType: " + GraphQLRequestSerializer.getEntry(entityType));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (text != null) {
            joiner.add("text: " + GraphQLRequestSerializer.getEntry(text));
        }
        return joiner.toString();
    }

    public static class Builder {

        private CommentEntityTO entityType;
        private String id;
        private String text;

        public Builder() {
        }

        public Builder setEntityType(CommentEntityTO entityType) {
            this.entityType = entityType;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setText(String text) {
            this.text = text;
            return this;
        }


        public CommentInputTO build() {
            return new CommentInputTO(entityType, id, text);
        }

    }
}
