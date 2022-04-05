package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocumentCategoryCUDTO implements java.io.Serializable {

    private Integer locationTypeID;
    private DocumentCategoryPermissionRuleTO read;
    private DocumentCategoryPermissionRuleTO create;
    private DocumentCategoryPermissionRuleTO update;
    private DocumentCategoryPermissionRuleTO delete;

    public DocumentCategoryCUDTO() {
    }

    public DocumentCategoryCUDTO(Integer locationTypeID, DocumentCategoryPermissionRuleTO read, DocumentCategoryPermissionRuleTO create, DocumentCategoryPermissionRuleTO update, DocumentCategoryPermissionRuleTO delete) {
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

    public DocumentCategoryPermissionRuleTO getRead() {
        return read;
    }

    public void setRead(DocumentCategoryPermissionRuleTO read) {
        this.read = read;
    }

    public DocumentCategoryPermissionRuleTO getCreate() {
        return create;
    }

    public void setCreate(DocumentCategoryPermissionRuleTO create) {
        this.create = create;
    }

    public DocumentCategoryPermissionRuleTO getUpdate() {
        return update;
    }

    public void setUpdate(DocumentCategoryPermissionRuleTO update) {
        this.update = update;
    }

    public DocumentCategoryPermissionRuleTO getDelete() {
        return delete;
    }

    public void setDelete(DocumentCategoryPermissionRuleTO delete) {
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
        private DocumentCategoryPermissionRuleTO read;
        private DocumentCategoryPermissionRuleTO create;
        private DocumentCategoryPermissionRuleTO update;
        private DocumentCategoryPermissionRuleTO delete;

        public Builder() {
        }

        public Builder setLocationTypeID(Integer locationTypeID) {
            this.locationTypeID = locationTypeID;
            return this;
        }

        public Builder setRead(DocumentCategoryPermissionRuleTO read) {
            this.read = read;
            return this;
        }

        public Builder setCreate(DocumentCategoryPermissionRuleTO create) {
            this.create = create;
            return this;
        }

        public Builder setUpdate(DocumentCategoryPermissionRuleTO update) {
            this.update = update;
            return this;
        }

        public Builder setDelete(DocumentCategoryPermissionRuleTO delete) {
            this.delete = delete;
            return this;
        }


        public DocumentCategoryCUDTO build() {
            return new DocumentCategoryCUDTO(locationTypeID, read, create, update, delete);
        }

    }
}
