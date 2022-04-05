package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddNetworkTypeInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;

    public AddNetworkTypeInputTO() {
    }

    public AddNetworkTypeInputTO(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String name;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public AddNetworkTypeInputTO build() {
            return new AddNetworkTypeInputTO(name);
        }

    }
}
