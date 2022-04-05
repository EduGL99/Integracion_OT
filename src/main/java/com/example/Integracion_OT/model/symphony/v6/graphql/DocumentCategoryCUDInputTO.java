package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocumentCategoryCUDInputTO implements java.io.Serializable {

    private Integer locationTypeID;
    private DocumentCategoryPermissionRuleInputTO read;
    private DocumentCategoryPermissionRuleInputTO create;
    private DocumentCategoryPermissionRuleInputTO update;
    private DocumentCategoryPermissionRuleInputTO delete;

    public DocumentCategoryCUDInputTO() {
    }

    public DocumentCategoryCUDInputTO(Integer locationTypeID, DocumentCategoryPermissionRuleInputTO read, DocumentCategoryPermissionRuleInputTO create, DocumentCategoryPermissionRuleInputTO update, DocumentCategoryPermissionRuleInputTO delete) {
        this.locationTypeID = locationTypeID;
        this.read = read;
        this.create = create;
        this.update = update;
        this.delete = delete;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getLocationTypeID() {
        return locationTypeID;
    }

    public void setLocationTypeID(Integer locationTypeID) {
        this.locationTypeID = locationTypeID;
    }

    public DocumentCategoryPermissionRuleInputTO getRead() {
        return read;
    }

    public void setRead(DocumentCategoryPermissionRuleInputTO read) {
        this.read = read;
    }

    public DocumentCategoryPermissionRuleInputTO getCreate() {
        return create;
    }

    public void setCreate(DocumentCategoryPermissionRuleInputTO create) {
        this.create = create;
    }

    public DocumentCategoryPermissionRuleInputTO getUpdate() {
        return update;
    }

    public void setUpdate(DocumentCategoryPermissionRuleInputTO update) {
        this.update = update;
    }

    public DocumentCategoryPermissionRuleInputTO getDelete() {
        return delete;
    }

    public void setDelete(DocumentCategoryPermissionRuleInputTO delete) {
        this.delete = delete;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (locationTypeID != null) {
            joiner.add("locationTypeID: " + GraphQLRequestSerializer.getEntry(locationTypeID));
        }
        if (read != null) {
            joiner.add("read: " + GraphQLRequestSerializer.getEntry(read));
        }
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

        private Integer locationTypeID;
        private DocumentCategoryPermissionRuleInputTO read;
        private DocumentCategoryPermissionRuleInputTO create;
        private DocumentCategoryPermissionRuleInputTO update;
        private DocumentCategoryPermissionRuleInputTO delete;

        public Builder() {
        }

        public Builder setLocationTypeID(Integer locationTypeID) {
            this.locationTypeID = locationTypeID;
            return this;
        }

        public Builder setRead(DocumentCategoryPermissionRuleInputTO read) {
            this.read = read;
            return this;
        }

        public Builder setCreate(DocumentCategoryPermissionRuleInputTO create) {
            this.create = create;
            return this;
        }

        public Builder setUpdate(DocumentCategoryPermissionRuleInputTO update) {
            this.update = update;
            return this;
        }

        public Builder setDelete(DocumentCategoryPermissionRuleInputTO delete) {
            this.delete = delete;
            return this;
        }


        public DocumentCategoryCUDInputTO build() {
            return new DocumentCategoryCUDInputTO(locationTypeID, read, create, update, delete);
        }

    }
}
