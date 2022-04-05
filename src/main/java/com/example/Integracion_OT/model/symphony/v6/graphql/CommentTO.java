package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private UserTO author;
    @javax.validation.constraints.NotNull
    private String text;
    @javax.validation.constraints.NotNull
    private String createTime;

    public CommentTO() {
    }

    public CommentTO(String id, UserTO author, String text, String createTime) {
        this.id = id;
        this.author = author;
        this.text = text;
        this.createTime = createTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The id of the object.
     */
    public String getId() {
        return id;
    }

    /**
     * The id of the object.
     */
    public void setId(String id) {
        this.id = id;
    }

    public UserTO getAuthor() {
        return author;
    }

    public void setAuthor(UserTO author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (author != null) {
            joiner.add("author: " + GraphQLRequestSerializer.getEntry(author));
        }
        if (text != null) {
            joiner.add("text: " + GraphQLRequestSerializer.getEntry(text));
        }
        if (createTime != null) {
            joiner.add("createTime: " + GraphQLRequestSerializer.getEntry(createTime));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private UserTO author;
        private String text;
        private String createTime;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setAuthor(UserTO author) {
            this.author = author;
            return this;
        }

        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        public CommentTO build() {
            return new CommentTO(id, author, text, createTime);
        }

    }
}
