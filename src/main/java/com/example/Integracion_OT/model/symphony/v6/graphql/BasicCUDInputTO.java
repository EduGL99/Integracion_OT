package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BasicCUDInputTO implements java.io.Serializable {

    private BasicPermissionRuleInputTO create;
    private BasicPermissionRuleInputTO update;
    private BasicPermissionRuleInputTO delete;

    public BasicCUDInputTO() {
    }

    public BasicCUDInputTO(BasicPermissionRuleInputTO create, BasicPermissionRuleInputTO update, BasicPermissionRuleInputTO delete) {
        this.create = create;
        this.update = update;
        this.delete = delete;
    }

    public static Builder builder() {
        return new Builder();
    }

    public BasicPermissionRuleInputTO getCreate() {
        return create;
    }

    public void setCreate(BasicPermissionRuleInputTO create) {
        this.create = create;
    }

    public BasicPermissionRuleInputTO getUpdate() {
        return update;
    }

    public void setUpdate(BasicPermissionRuleInputTO update) {
        this.update = update;
    }

    public BasicPermissionRuleInputTO getDelete() {
        return delete;
    }

    public void setDelete(BasicPermissionRuleInputTO delete) {
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

        private BasicPermissionRuleInputTO create;
        private BasicPermissionRuleInputTO update;
        private BasicPermissionRuleInputTO delete;

        public Builder() {
        }

        public Builder setCreate(BasicPermissionRuleInputTO create) {
            this.create = create;
            return this;
        }

        public Builder setUpdate(BasicPermissionRuleInputTO update) {
            this.update = update;
            return this;
        }

        public Builder setDelete(BasicPermissionRuleInputTO delete) {
            this.delete = delete;
            return this;
        }


        public BasicCUDInputTO build() {
            return new BasicCUDInputTO(create, update, delete);
        }

    }
}
