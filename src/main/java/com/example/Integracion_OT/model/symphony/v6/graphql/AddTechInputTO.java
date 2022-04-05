package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddTechInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String domainFk;

    public AddTechInputTO() {
    }

    public AddTechInputTO(String name, String domainFk) {
        this.name = name;
        this.domainFk = domainFk;
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

    public String getDomainFk() {
        return domainFk;
    }

    public void setDomainFk(String domainFk) {
        this.domainFk = domainFk;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (domainFk != null) {
            joiner.add("domainFk: " + GraphQLRequestSerializer.getEntry(domainFk));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String name;
        private String domainFk;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDomainFk(String domainFk) {
            this.domainFk = domainFk;
            return this;
        }


        public AddTechInputTO build() {
            return new AddTechInputTO(name, domainFk);
        }

    }
}
