package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String type;
    @javax.validation.constraints.NotNull
    private java.util.List<String> ids;

    public EdgeTO() {
    }

    public EdgeTO(String name, String type, java.util.List<String> ids) {
        this.name = name;
        this.type = type;
        this.ids = ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public java.util.List<String> getIds() {
        return ids;
    }

    public void setIds(java.util.List<String> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (ids != null) {
            joiner.add("ids: " + GraphQLRequestSerializer.getEntry(ids));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String name;
        private String type;
        private java.util.List<String> ids;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setIds(java.util.List<String> ids) {
            this.ids = ids;
            return this;
        }


        public EdgeTO build() {
            return new EdgeTO(name, type, ids);
        }

    }
}
