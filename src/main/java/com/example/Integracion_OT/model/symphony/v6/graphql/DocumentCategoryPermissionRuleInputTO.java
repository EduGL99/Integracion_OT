package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocumentCategoryPermissionRuleInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private PermissionValueTO isAllowed;
    @javax.validation.constraints.NotNull
    private java.util.List<String> documentCategoryIds;

    public DocumentCategoryPermissionRuleInputTO() {
    }

    public DocumentCategoryPermissionRuleInputTO(PermissionValueTO isAllowed, java.util.List<String> documentCategoryIds) {
        this.isAllowed = isAllowed;
        this.documentCategoryIds = documentCategoryIds;
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

    public java.util.List<String> getDocumentCategoryIds() {
        return documentCategoryIds;
    }

    public void setDocumentCategoryIds(java.util.List<String> documentCategoryIds) {
        this.documentCategoryIds = documentCategoryIds;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (isAllowed != null) {
            joiner.add("isAllowed: " + GraphQLRequestSerializer.getEntry(isAllowed));
        }
        if (documentCategoryIds != null) {
            joiner.add("documentCategoryIds: " + GraphQLRequestSerializer.getEntry(documentCategoryIds));
        }
        return joiner.toString();
    }

    public static class Builder {

        private PermissionValueTO isAllowed;
        private java.util.List<String> documentCategoryIds;

        public Builder() {
        }

        public Builder setIsAllowed(PermissionValueTO isAllowed) {
            this.isAllowed = isAllowed;
            return this;
        }

        public Builder setDocumentCategoryIds(java.util.List<String> documentCategoryIds) {
            this.documentCategoryIds = documentCategoryIds;
            return this;
        }


        public DocumentCategoryPermissionRuleInputTO build() {
            return new DocumentCategoryPermissionRuleInputTO(isAllowed, documentCategoryIds);
        }

    }
}
