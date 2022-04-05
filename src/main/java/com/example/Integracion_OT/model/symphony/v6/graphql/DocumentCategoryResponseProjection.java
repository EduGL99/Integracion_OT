package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for DocumentCategory
 */

public class DocumentCategoryResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public DocumentCategoryResponseProjection() {
    }

    public DocumentCategoryResponseProjection all$() {
        return all$(3);
    }

    public DocumentCategoryResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.index();
        if (projectionDepthOnFields.getOrDefault("DocumentCategoryResponseProjection.FileResponseProjection.files", 0) <= maxDepth) {
            projectionDepthOnFields.put("DocumentCategoryResponseProjection.FileResponseProjection.files", projectionDepthOnFields.getOrDefault("DocumentCategoryResponseProjection.FileResponseProjection.files", 0) + 1);
            this.files(new FileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DocumentCategoryResponseProjection.FileResponseProjection.files", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DocumentCategoryResponseProjection.HyperlinkResponseProjection.hyperlinks", 0) <= maxDepth) {
            projectionDepthOnFields.put("DocumentCategoryResponseProjection.HyperlinkResponseProjection.hyperlinks", projectionDepthOnFields.getOrDefault("DocumentCategoryResponseProjection.HyperlinkResponseProjection.hyperlinks", 0) + 1);
            this.hyperlinks(new HyperlinkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DocumentCategoryResponseProjection.HyperlinkResponseProjection.hyperlinks", 0)));
        }
        this.numberOfDocuments();
        if (projectionDepthOnFields.getOrDefault("DocumentCategoryResponseProjection.FileResponseProjection.filesByEntity", 0) <= maxDepth) {
            projectionDepthOnFields.put("DocumentCategoryResponseProjection.FileResponseProjection.filesByEntity", projectionDepthOnFields.getOrDefault("DocumentCategoryResponseProjection.FileResponseProjection.filesByEntity", 0) + 1);
            this.filesByEntity(new FileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DocumentCategoryResponseProjection.FileResponseProjection.filesByEntity", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DocumentCategoryResponseProjection.HyperlinkResponseProjection.hyperlinksByEntity", 0) <= maxDepth) {
            projectionDepthOnFields.put("DocumentCategoryResponseProjection.HyperlinkResponseProjection.hyperlinksByEntity", projectionDepthOnFields.getOrDefault("DocumentCategoryResponseProjection.HyperlinkResponseProjection.hyperlinksByEntity", 0) + 1);
            this.hyperlinksByEntity(new HyperlinkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DocumentCategoryResponseProjection.HyperlinkResponseProjection.hyperlinksByEntity", 0)));
        }
        this.typename();
        return this;
    }

    public DocumentCategoryResponseProjection id() {
        return id(null);
    }

    public DocumentCategoryResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public DocumentCategoryResponseProjection name() {
        return name(null);
    }

    public DocumentCategoryResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public DocumentCategoryResponseProjection index() {
        return index(null);
    }

    public DocumentCategoryResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public DocumentCategoryResponseProjection files(FileResponseProjection subProjection) {
        return files(null, subProjection);
    }

    public DocumentCategoryResponseProjection files(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("files").alias(alias).projection(subProjection));
        return this;
    }

    public DocumentCategoryResponseProjection hyperlinks(HyperlinkResponseProjection subProjection) {
        return hyperlinks(null, subProjection);
    }

    public DocumentCategoryResponseProjection hyperlinks(String alias, HyperlinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("hyperlinks").alias(alias).projection(subProjection));
        return this;
    }

    public DocumentCategoryResponseProjection numberOfDocuments() {
        return numberOfDocuments(null);
    }

    public DocumentCategoryResponseProjection numberOfDocuments(String alias) {
        fields.add(new GraphQLResponseField("numberOfDocuments").alias(alias));
        return this;
    }

    public DocumentCategoryResponseProjection filesByEntity(FileResponseProjection subProjection) {
        return filesByEntity((String) null, subProjection);
    }

    public DocumentCategoryResponseProjection filesByEntity(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("filesByEntity").alias(alias).projection(subProjection));
        return this;
    }

    public DocumentCategoryResponseProjection filesByEntity(DocumentCategoryFilesByEntityParametrizedInput input, FileResponseProjection subProjection) {
        return filesByEntity(null, input, subProjection);
    }

    public DocumentCategoryResponseProjection filesByEntity(String alias, DocumentCategoryFilesByEntityParametrizedInput input, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("filesByEntity").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public DocumentCategoryResponseProjection hyperlinksByEntity(HyperlinkResponseProjection subProjection) {
        return hyperlinksByEntity((String) null, subProjection);
    }

    public DocumentCategoryResponseProjection hyperlinksByEntity(String alias, HyperlinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("hyperlinksByEntity").alias(alias).projection(subProjection));
        return this;
    }

    public DocumentCategoryResponseProjection hyperlinksByEntity(DocumentCategoryHyperlinksByEntityParametrizedInput input, HyperlinkResponseProjection subProjection) {
        return hyperlinksByEntity(null, input, subProjection);
    }

    public DocumentCategoryResponseProjection hyperlinksByEntity(String alias, DocumentCategoryHyperlinksByEntityParametrizedInput input, HyperlinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("hyperlinksByEntity").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public DocumentCategoryResponseProjection typename() {
        return typename(null);
    }

    public DocumentCategoryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
