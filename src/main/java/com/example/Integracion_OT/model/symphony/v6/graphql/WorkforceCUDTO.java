package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkforceCUDTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private WorkforcePermissionRuleTO create;
    @javax.validation.constraints.NotNull
    private WorkforcePermissionRuleTO update;
    @javax.validation.constraints.NotNull
    private WorkforcePermissionRuleTO delete;
    @javax.validation.constraints.NotNull
    private WorkforcePermissionRuleTO assign;
    @javax.validation.constraints.NotNull
    private WorkforcePermissionRuleTO transferOwnership;

    public WorkforceCUDTO() {
    }

    public WorkforceCUDTO(WorkforcePermissionRuleTO create, WorkforcePermissionRuleTO update, WorkforcePermissionRuleTO delete, WorkforcePermissionRuleTO assign, WorkforcePermissionRuleTO transferOwnership) {
        this.create = create;
        this.update = update;
        this.delete = delete;
        this.assign = assign;
        this.transferOwnership = transferOwnership;
    }

    public static Builder builder() {
        return new Builder();
    }

    public WorkforcePermissionRuleTO getCreate() {
        return create;
    }

    public void setCreate(WorkforcePermissionRuleTO create) {
        this.create = create;
    }

    public WorkforcePermissionRuleTO getUpdate() {
        return update;
    }

    public void setUpdate(WorkforcePermissionRuleTO update) {
        this.update = update;
    }

    public WorkforcePermissionRuleTO getDelete() {
        return delete;
    }

    public void setDelete(WorkforcePermissionRuleTO delete) {
        this.delete = delete;
    }

    public WorkforcePermissionRuleTO getAssign() {
        return assign;
    }

    public void setAssign(WorkforcePermissionRuleTO assign) {
        this.assign = assign;
    }

    public WorkforcePermissionRuleTO getTransferOwnership() {
        return transferOwnership;
    }

    public void setTransferOwnership(WorkforcePermissionRuleTO transferOwnership) {
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

        private WorkforcePermissionRuleTO create;
        private WorkforcePermissionRuleTO update;
        private WorkforcePermissionRuleTO delete;
        private WorkforcePermissionRuleTO assign;
        private WorkforcePermissionRuleTO transferOwnership;

        public Builder() {
        }

        public Builder setCreate(WorkforcePermissionRuleTO create) {
            this.create = create;
            return this;
        }

        public Builder setUpdate(WorkforcePermissionRuleTO update) {
            this.update = update;
            return this;
        }

        public Builder setDelete(WorkforcePermissionRuleTO delete) {
            this.delete = delete;
            return this;
        }

        public Builder setAssign(WorkforcePermissionRuleTO assign) {
            this.assign = assign;
            return this;
        }

        public Builder setTransferOwnership(WorkforcePermissionRuleTO transferOwnership) {
            this.transferOwnership = transferOwnership;
            return this;
        }


        public WorkforceCUDTO build() {
            return new WorkforceCUDTO(create, update, delete, assign, transferOwnership);
        }

    }
}
