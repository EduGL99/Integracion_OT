package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PermissionsPolicySearchResultTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<PermissionsPolicyTO> permissionsPolicies;
    private int count;

    public PermissionsPolicySearchResultTO() {
    }

    public PermissionsPolicySearchResultTO(java.util.List<PermissionsPolicyTO> permissionsPolicies, int count) {
        this.permissionsPolicies = permissionsPolicies;
        this.count = count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public java.util.List<PermissionsPolicyTO> getPermissionsPolicies() {
        return permissionsPolicies;
    }

    public void setPermissionsPolicies(java.util.List<PermissionsPolicyTO> permissionsPolicies) {
        this.permissionsPolicies = permissionsPolicies;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (permissionsPolicies != null) {
            joiner.add("permissionsPolicies: " + GraphQLRequestSerializer.getEntry(permissionsPolicies));
        }
        joiner.add("count: " + GraphQLRequestSerializer.getEntry(count));
        return joiner.toString();
    }

    public static class Builder {

        private java.util.List<PermissionsPolicyTO> permissionsPolicies;
        private int count;

        public Builder() {
        }

        public Builder setPermissionsPolicies(java.util.List<PermissionsPolicyTO> permissionsPolicies) {
            this.permissionsPolicies = permissionsPolicies;
            return this;
        }

        public Builder setCount(int count) {
            this.count = count;
            return this;
        }


        public PermissionsPolicySearchResultTO build() {
            return new PermissionsPolicySearchResultTO(permissionsPolicies, count);
        }

    }
}
