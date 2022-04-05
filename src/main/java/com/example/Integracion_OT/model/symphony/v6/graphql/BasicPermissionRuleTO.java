package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BasicPermissionRuleTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private PermissionValueTO isAllowed;

    public BasicPermissionRuleTO() {
    }

    public BasicPermissionRuleTO(PermissionValueTO isAllowed) {
        this.isAllowed = isAllowed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public PermissionValueTO getIsAllowed() {
        return isAllowed;
    }

    public void setIsAllowed(PermissionValueTO isAllowed) {
        this.isAllowed = isAllowed;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (isAllowed != null) {
            joiner.add("isAllowed: " + GraphQLRequestSerializer.getEntry(isAllowed));
        }
        return joiner.toString();
    }

    public static class Builder {

        private PermissionValueTO isAllowed;

        public Builder() {
        }

        public Builder setIsAllowed(PermissionValueTO isAllowed) {
            this.isAllowed = isAllowed;
            return this;
        }


        public BasicPermissionRuleTO build() {
            return new BasicPermissionRuleTO(isAllowed);
        }

    }
}
