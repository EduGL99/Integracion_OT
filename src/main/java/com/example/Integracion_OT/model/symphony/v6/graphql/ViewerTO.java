package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ViewerTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String tenant;
    private UserTO user;
    @javax.validation.constraints.NotNull
    private PermissionSettingsTO permissions;

    public ViewerTO() {
    }

    public ViewerTO(String tenant, UserTO user, PermissionSettingsTO permissions) {
        this.tenant = tenant;
        this.user = user;
        this.permissions = permissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public UserTO getUser() {
        return user;
    }

    public void setUser(UserTO user) {
        this.user = user;
    }

    public PermissionSettingsTO getPermissions() {
        return permissions;
    }

    public void setPermissions(PermissionSettingsTO permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (tenant != null) {
            joiner.add("tenant: " + GraphQLRequestSerializer.getEntry(tenant));
        }
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user));
        }
        if (permissions != null) {
            joiner.add("permissions: " + GraphQLRequestSerializer.getEntry(permissions));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String tenant;
        private UserTO user;
        private PermissionSettingsTO permissions;

        public Builder() {
        }

        public Builder setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }

        public Builder setUser(UserTO user) {
            this.user = user;
            return this;
        }

        public Builder setPermissions(PermissionSettingsTO permissions) {
            this.permissions = permissions;
            return this;
        }


        public ViewerTO build() {
            return new ViewerTO(tenant, user, permissions);
        }

    }
}
