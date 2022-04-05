package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutomationPolicyInputTO implements java.io.Serializable {

    private BasicPermissionRuleInputTO read;
    private BasicCUDInputTO templates;

    public AutomationPolicyInputTO() {
    }

    public AutomationPolicyInputTO(BasicPermissionRuleInputTO read, BasicCUDInputTO templates) {
        this.read = read;
        this.templates = templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public BasicPermissionRuleInputTO getRead() {
        return read;
    }

    public void setRead(BasicPermissionRuleInputTO read) {
        this.read = read;
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
        if (templates != null) {
            joiner.add("templates: " + GraphQLRequestSerializer.getEntry(templates));
        }
        return joiner.toString();
    }

    public static class Builder {

        private BasicPermissionRuleInputTO read;
        private BasicCUDInputTO templates;

        public Builder() {
        }

        public Builder setRead(BasicPermissionRuleInputTO read) {
            this.read = read;
            return this;
        }

        public Builder setTemplates(BasicCUDInputTO templates) {
            this.templates = templates;
            return this;
        }


        public AutomationPolicyInputTO build() {
            return new AutomationPolicyInputTO(read, templates);
        }

    }
}
