package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdministrativePolicyTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private BasicPermissionRuleTO access;

    public AdministrativePolicyTO() {
    }

    public AdministrativePolicyTO(BasicPermissionRuleTO access) {
        this.access = access;
    }

    public static Builder builder() {
        return new Builder();
    }

    public BasicPermissionRuleTO getAccess() {
        return access;
    }

    public void setAccess(BasicPermissionRuleTO access) {
        this.access = access;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (access != null) {
            joiner.add("access: " + GraphQLRequestSerializer.getEntry(access));
        }
        return joiner.toString();
    }

    public static class Builder {

        private BasicPermissionRuleTO access;

        public Builder() {
        }

        public Builder setAccess(BasicPermissionRuleTO access) {
            this.access = access;
            return this;
        }


        public AdministrativePolicyTO build() {
            return new AdministrativePolicyTO(access);
        }

    }
}
