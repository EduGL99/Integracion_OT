package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkforceCUDInputTO implements java.io.Serializable {

    private BasicPermissionRuleInputTO create;
    private BasicPermissionRuleInputTO update;
    private BasicPermissionRuleInputTO delete;
    private BasicPermissionRuleInputTO assign;
    private BasicPermissionRuleInputTO transferOwnership;

    public WorkforceCUDInputTO() {
    }

    public WorkforceCUDInputTO(BasicPermissionRuleInputTO create, BasicPermissionRuleInputTO update, BasicPermissionRuleInputTO delete, BasicPermissionRuleInputTO assign, BasicPermissionRuleInputTO transferOwnership) {
        this.create = create;
        this.update = update;
        this.delete = delete;
        this.assign = assign;
        this.transferOwnership = transferOwnership;
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

    public BasicPermissionRuleInputTO getAssign() {
        return assign;
    }

    public void setAssign(BasicPermissionRuleInputTO assign) {
        this.assign = assign;
    }

    public BasicPermissionRuleInputTO getTransferOwnership() {
        return transferOwnership;
    }

    public void setTransferOwnership(BasicPermissionRuleInputTO transferOwnership) {
        this.transferOwnership = transferOwnership;
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
        if (assign != null) {
            joiner.add("assign: " + GraphQLRequestSerializer.getEntry(assign));
        }
        if (transferOwnership != null) {
            joiner.add("transferOwnership: " + GraphQLRequestSerializer.getEntry(transferOwnership));
        }
        return joiner.toString();
    }

    public static class Builder {

        private BasicPermissionRuleInputTO create;
        private BasicPermissionRuleInputTO update;
        private BasicPermissionRuleInputTO delete;
        private BasicPermissionRuleInputTO assign;
        private BasicPermissionRuleInputTO transferOwnership;

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

        public Builder setAssign(BasicPermissionRuleInputTO assign) {
            this.assign = assign;
            return this;
        }

        public Builder setTransferOwnership(BasicPermissionRuleInputTO transferOwnership) {
            this.transferOwnership = transferOwnership;
            return this;
        }


        public WorkforceCUDInputTO build() {
            return new WorkforceCUDInputTO(create, update, delete, assign, transferOwnership);
        }

    }
}
