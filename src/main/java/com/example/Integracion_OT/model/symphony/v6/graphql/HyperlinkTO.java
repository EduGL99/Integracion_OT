package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HyperlinkTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String url;
    private String displayName;
    private String category;
    @javax.validation.constraints.NotNull
    private String createTime;
    private DocumentCategoryTO documentCategory;

    public HyperlinkTO() {
    }

    public HyperlinkTO(String id, String url, String displayName, String category, String createTime, DocumentCategoryTO documentCategory) {
        this.id = id;
        this.url = url;
        this.displayName = displayName;
        this.category = category;
        this.createTime = createTime;
        this.documentCategory = documentCategory;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The id of the object.
     */
    public String getId() {
        return id;
    }

    /**
     * The id of the object.
     */
    public void setId(String id) {
        this.id = id;
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public DocumentCategoryTO getDocumentCategory() {
        return documentCategory;
    }

    public void setDocumentCategory(DocumentCategoryTO documentCategory) {
        this.documentCategory = documentCategory;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
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
        if (createTime != null) {
            joiner.add("createTime: " + GraphQLRequestSerializer.getEntry(createTime));
        }
        if (documentCategory != null) {
            joiner.add("documentCategory: " + GraphQLRequestSerializer.getEntry(documentCategory));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String url;
        private String displayName;
        private String category;
        private String createTime;
        private DocumentCategoryTO documentCategory;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
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

        public Builder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setDocumentCategory(DocumentCategoryTO documentCategory) {
            this.documentCategory = documentCategory;
            return this;
        }


        public HyperlinkTO build() {
            return new HyperlinkTO(id, url, displayName, category, createTime, documentCategory);
        }

    }
}
