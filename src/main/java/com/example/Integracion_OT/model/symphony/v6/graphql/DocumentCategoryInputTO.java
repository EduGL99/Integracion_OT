package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocumentCategoryInputTO implements java.io.Serializable {

    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private int index;

    public DocumentCategoryInputTO() {
    }

    public DocumentCategoryInputTO(String id, String name, int index) {
        this.id = id;
        this.name = name;
        this.index = index;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        joiner.add("index: " + GraphQLRequestSerializer.getEntry(index));
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private int index;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setIndex(int index) {
            this.index = index;
            return this;
        }


        public DocumentCategoryInputTO build() {
            return new DocumentCategoryInputTO(id, name, index);
        }

    }
}
