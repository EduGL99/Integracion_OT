package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddUsersGroupInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<String> members;
    @javax.validation.constraints.NotNull
    private java.util.List<String> policies;

    public AddUsersGroupInputTO() {
    }

    public AddUsersGroupInputTO(String name, String description, java.util.List<String> members, java.util.List<String> policies) {
        this.name = name;
        this.description = description;
        this.members = members;
        this.policies = policies;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.List<String> getMembers() {
        return members;
    }

    public void setMembers(java.util.List<String> members) {
        this.members = members;
    }

    public java.util.List<String> getPolicies() {
        return policies;
    }

    public void setPolicies(java.util.List<String> policies) {
        this.policies = policies;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (members != null) {
            joiner.add("members: " + GraphQLRequestSerializer.getEntry(members));
        }
        if (policies != null) {
            joiner.add("policies: " + GraphQLRequestSerializer.getEntry(policies));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String name;
        private String description;
        private java.util.List<String> members;
        private java.util.List<String> policies;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }

        public Builder setPolicies(java.util.List<String> policies) {
            this.policies = policies;
            return this;
        }


        public AddUsersGroupInputTO build() {
            return new AddUsersGroupInputTO(name, description, members, policies);
        }

    }
}
