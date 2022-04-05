package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutomationPolicyTO implements java.io.Serializable, SystemPolicyTO {

    @javax.validation.constraints.NotNull
    private BasicPermissionRuleTO read;
    @javax.validation.constraints.NotNull
    private CUDTO templates;

    public AutomationPolicyTO() {
    }

    public AutomationPolicyTO(BasicPermissionRuleTO read, CUDTO templates) {
        this.read = read;
        this.templates = templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public BasicPermissionRuleTO getRead() {
        return read;
    }

    public void setRead(BasicPermissionRuleTO read) {
        this.read = read;
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
        if (templates != null) {
            joiner.add("templates: " + GraphQLRequestSerializer.getEntry(templates));
        }
        return joiner.toString();
    }

    public static class Builder {

        private BasicPermissionRuleTO read;
        private CUDTO templates;

        public Builder() {
        }

        public Builder setRead(BasicPermissionRuleTO read) {
            this.read = read;
            return this;
        }

        public Builder setTemplates(CUDTO templates) {
            this.templates = templates;
            return this;
        }


        public AutomationPolicyTO build() {
            return new AutomationPolicyTO(read, templates);
        }

    }
}
