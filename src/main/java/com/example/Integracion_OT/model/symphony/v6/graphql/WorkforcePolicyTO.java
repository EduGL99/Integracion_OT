package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkforcePolicyTO implements java.io.Serializable, SystemPolicyTO {

    @javax.validation.constraints.NotNull
    private WorkforcePermissionRuleTO read;
    @javax.validation.constraints.NotNull
    private WorkforceCUDTO data;
    @javax.validation.constraints.NotNull
    private CUDTO templates;

    public WorkforcePolicyTO() {
    }

    public WorkforcePolicyTO(WorkforcePermissionRuleTO read, WorkforceCUDTO data, CUDTO templates) {
        this.read = read;
        this.data = data;
        this.templates = templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public WorkforcePermissionRuleTO getRead() {
        return read;
    }

    public void setRead(WorkforcePermissionRuleTO read) {
        this.read = read;
    }

    public WorkforceCUDTO getData() {
        return data;
    }

    public void setData(WorkforceCUDTO data) {
        this.data = data;
    }

    public CUDTO getTemplates() {
        return templates;
    }

    public void setTemplates(CUDTO templates) {
        this.templates = templates;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (read != null) {
            joiner.add("read: " + GraphQLRequestSerializer.getEntry(read));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (templates != null) {
            joiner.add("templates: " + GraphQLRequestSerializer.getEntry(templates));
        }
        return joiner.toString();
    }

    public static class Builder {

        private WorkforcePermissionRuleTO read;
        private WorkforceCUDTO data;
        private CUDTO templates;

        public Builder() {
        }

        public Builder setRead(WorkforcePermissionRuleTO read) {
            this.read = read;
            return this;
        }

        public Builder setData(WorkforceCUDTO data) {
            this.data = data;
            return this;
        }

        public Builder setTemplates(CUDTO templates) {
            this.templates = templates;
            return this;
        }


        public WorkforcePolicyTO build() {
            return new WorkforcePolicyTO(read, data, templates);
        }

    }
}
