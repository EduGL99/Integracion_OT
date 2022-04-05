package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditIsListableInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private boolean isListable;

    public EditIsListableInputTO() {
    }

    public EditIsListableInputTO(String id, boolean isListable) {
        this.id = id;
        this.isListable = isListable;
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

    public boolean getIsListable() {
        return isListable;
    }

    public void setIsListable(boolean isListable) {
        this.isListable = isListable;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("isListable: " + GraphQLRequestSerializer.getEntry(isListable));
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private boolean isListable;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIsListable(boolean isListable) {
            this.isListable = isListable;
            return this;
        }


        public EditIsListableInputTO build() {
            return new EditIsListableInputTO(id, isListable);
        }

    }
}
