package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkforcePolicyInputTO implements java.io.Serializable {

    private WorkforcePermissionRuleInputTO read;
    private WorkforceCUDInputTO data;
    private BasicCUDInputTO templates;

    public WorkforcePolicyInputTO() {
    }

    public WorkforcePolicyInputTO(WorkforcePermissionRuleInputTO read, WorkforceCUDInputTO data, BasicCUDInputTO templates) {
        this.read = read;
        this.data = data;
        this.templates = templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public WorkforcePermissionRuleInputTO getRead() {
        return read;
    }

    public void setRead(WorkforcePermissionRuleInputTO read) {
        this.read = read;
    }

    public WorkforceCUDInputTO getData() {
        return data;
    }

    public void setData(WorkforceCUDInputTO data) {
        this.data = data;
    }

    public BasicCUDInputTO getTemplates() {
        return templates;
    }

    public void setTemplates(BasicCUDInputTO templates) {
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

        private WorkforcePermissionRuleInputTO read;
        private WorkforceCUDInputTO data;
        private BasicCUDInputTO templates;

        public Builder() {
        }

        public Builder setRead(WorkforcePermissionRuleInputTO read) {
            this.read = read;
            return this;
        }

        public Builder setData(WorkforceCUDInputTO data) {
            this.data = data;
            return this;
        }

        public Builder setTemplates(BasicCUDInputTO templates) {
            this.templates = templates;
            return this;
        }


        public WorkforcePolicyInputTO build() {
            return new WorkforcePolicyInputTO(read, data, templates);
        }

    }
}
