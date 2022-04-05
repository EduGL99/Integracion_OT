package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExitPointInputTO implements java.io.Serializable {

    private ExitPointRoleTO role;
    private String cid;

    public ExitPointInputTO() {
    }

    public ExitPointInputTO(ExitPointRoleTO role, String cid) {
        this.role = role;
        this.cid = cid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ExitPointRoleTO getRole() {
        return role;
    }

    public void setRole(ExitPointRoleTO role) {
        this.role = role;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        if (cid != null) {
            joiner.add("cid: " + GraphQLRequestSerializer.getEntry(cid));
        }
        return joiner.toString();
    }

    public static class Builder {

        private ExitPointRoleTO role;
        private String cid;

        public Builder() {
        }

        public Builder setRole(ExitPointRoleTO role) {
            this.role = role;
            return this;
        }

        public Builder setCid(String cid) {
            this.cid = cid;
            return this;
        }


        public ExitPointInputTO build() {
            return new ExitPointInputTO(role, cid);
        }

    }
}
