package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CUDTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private BasicPermissionRuleTO create;
    @javax.validation.constraints.NotNull
    private BasicPermissionRuleTO update;
    @javax.validation.constraints.NotNull
    private BasicPermissionRuleTO delete;

    public CUDTO() {
    }

    public CUDTO(BasicPermissionRuleTO create, BasicPermissionRuleTO update, BasicPermissionRuleTO delete) {
        this.create = create;
        this.update = update;
        this.delete = delete;
    }

    public static Builder builder() {
        return new Builder();
    }

    public BasicPermissionRuleTO getCreate() {
        return create;
    }

    public void setCreate(BasicPermissionRuleTO create) {
        this.create = create;
    }

    public BasicPermissionRuleTO getUpdate() {
        return update;
    }

    public void setUpdate(BasicPermissionRuleTO update) {
        this.update = update;
    }

    public BasicPermissionRuleTO getDelete() {
        return delete;
    }

    public void setDelete(BasicPermissionRuleTO delete) {
        this.delete = delete;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (create != null) {
            joiner.add("create: " + GraphQLRequestSerializer.getEntry(create));
        }
        if (update != null) {
            joiner.add("update: " + GraphQLRequestSerializer.getEntry(update));
        }
        if (delete != null) {
            joiner.add("delete: " + GraphQLRequestSerializer.getEntry(delete));
        }
        return joiner.toString();
    }

    public static class Builder {

        private BasicPermissionRuleTO create;
        private BasicPermissionRuleTO update;
        private BasicPermissionRuleTO delete;

        public Builder() {
        }

        public Builder setCreate(BasicPermissionRuleTO create) {
            this.create = create;
            return this;
        }

        public Builder setUpdate(BasicPermissionRuleTO update) {
            this.update = update;
            return this;
        }

        public Builder setDelete(BasicPermissionRuleTO delete) {
            this.delete = delete;
            return this;
        }


        public CUDTO build() {
            return new CUDTO(create, update, delete);
        }

    }
}
