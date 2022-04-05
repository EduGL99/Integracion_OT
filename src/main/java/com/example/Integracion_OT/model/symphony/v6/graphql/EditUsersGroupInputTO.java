package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditUsersGroupInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private String name;
    private String description;
    private UsersGroupStatusTO status;
    @javax.validation.constraints.NotNull
    private java.util.List<String> members;
    @javax.validation.constraints.NotNull
    private java.util.List<String> policies;

    public EditUsersGroupInputTO() {
    }

    public EditUsersGroupInputTO(String id, String name, String description, UsersGroupStatusTO status, java.util.List<String> members, java.util.List<String> policies) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.members = members;
        this.policies = policies;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UsersGroupStatusTO getStatus() {
        return status;
    }

    public void setStatus(UsersGroupStatusTO status) {
        this.status = status;
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
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
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

        private String id;
        private String name;
        private String description;
        private UsersGroupStatusTO status;
        private java.util.List<String> members;
        private java.util.List<String> policies;

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

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setStatus(UsersGroupStatusTO status) {
            this.status = status;
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


        public EditUsersGroupInputTO build() {
            return new EditUsersGroupInputTO(id, name, description, status, members, policies);
        }

    }
}
