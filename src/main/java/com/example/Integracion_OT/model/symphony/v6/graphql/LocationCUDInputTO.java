package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationCUDInputTO implements java.io.Serializable {

    private BasicPermissionRuleInputTO create;
    private LocationPermissionRuleInputTO update;
    private BasicPermissionRuleInputTO delete;

    public LocationCUDInputTO() {
    }

    public LocationCUDInputTO(BasicPermissionRuleInputTO create, LocationPermissionRuleInputTO update, BasicPermissionRuleInputTO delete) {
        this.create = create;
        this.update = update;
        this.delete = delete;
    }

    public static Builder builder() {
        return new Builder();
    }

    public BasicPermissionRuleInputTO getCreate() {
        return create;
    }

    public void setCreate(BasicPermissionRuleInputTO create) {
        this.create = create;
    }

    public LocationPermissionRuleInputTO getUpdate() {
        return update;
    }

    public void setUpdate(LocationPermissionRuleInputTO update) {
        this.update = update;
    }

    public BasicPermissionRuleInputTO getDelete() {
        return delete;
    }

    public void setDelete(BasicPermissionRuleInputTO delete) {
        this.delete = delete;
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
        return joiner.toString();
    }

    public static class Builder {

        private BasicPermissionRuleInputTO create;
        private LocationPermissionRuleInputTO update;
        private BasicPermissionRuleInputTO delete;

        public Builder() {
        }

        public Builder setCreate(BasicPermissionRuleInputTO create) {
            this.create = create;
            return this;
        }

        public Builder setUpdate(LocationPermissionRuleInputTO update) {
            this.update = update;
            return this;
        }

        public Builder setDelete(BasicPermissionRuleInputTO delete) {
            this.delete = delete;
            return this;
        }


        public LocationCUDInputTO build() {
            return new LocationCUDInputTO(create, update, delete);
        }

    }
}
