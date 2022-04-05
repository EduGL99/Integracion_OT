package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddHyperlinkInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private ImageEntityTO entityType;
    @javax.validation.constraints.NotNull
    private String entityId;
    @javax.validation.constraints.NotNull
    private String url;
    private String displayName;
    private String category;
    private String documentCategoryId;

    public AddHyperlinkInputTO() {
    }

    public AddHyperlinkInputTO(ImageEntityTO entityType, String entityId, String url, String displayName, String category, String documentCategoryId) {
        this.entityType = entityType;
        this.entityId = entityId;
        this.url = url;
        this.displayName = displayName;
        this.category = category;
        this.documentCategoryId = documentCategoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ImageEntityTO getEntityType() {
        return entityType;
    }

    public void setEntityType(ImageEntityTO entityType) {
        this.entityType = entityType;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDocumentCategoryId() {
        return documentCategoryId;
    }

    public void setDocumentCategoryId(String documentCategoryId) {
        this.documentCategoryId = documentCategoryId;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entityType != null) {
            joiner.add("entityType: " + GraphQLRequestSerializer.getEntry(entityType));
        }
        if (entityId != null) {
            joiner.add("entityId: " + GraphQLRequestSerializer.getEntry(entityId));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        if (displayName != null) {
            joiner.add("displayName: " + GraphQLRequestSerializer.getEntry(displayName));
        }
        if (category != null) {
            joiner.add("category: " + GraphQLRequestSerializer.getEntry(category));
        }
        if (documentCategoryId != null) {
            joiner.add("documentCategoryId: " + GraphQLRequestSerializer.getEntry(documentCategoryId));
        }
        return joiner.toString();
    }

    public static class Builder {

        private ImageEntityTO entityType;
        private String entityId;
        private String url;
        private String displayName;
        private String category;
        private String documentCategoryId;

        public Builder() {
        }

        public Builder setEntityType(ImageEntityTO entityType) {
            this.entityType = entityType;
            return this;
        }

        public Builder setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setDocumentCategoryId(String documentCategoryId) {
            this.documentCategoryId = documentCategoryId;
            return this;
        }


        public AddHyperlinkInputTO build() {
            return new AddHyperlinkInputTO(entityType, entityId, url, displayName, category, documentCategoryId);
        }

    }
}
