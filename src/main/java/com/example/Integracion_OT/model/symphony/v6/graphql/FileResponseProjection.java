package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for File
 */

public class FileResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FileResponseProjection() {
    }

    public FileResponseProjection all$() {
        return all$(3);
    }

    public FileResponseProjection all$(int maxDepth) {
        this.id();
        this.fileName();
        this.sizeInBytes();
        this.modified();
        this.uploaded();
        this.fileType();
        this.mimeType();
        this.storeKey();
        this.category();
        this.annotation();
        if (projectionDepthOnFields.getOrDefault("FileResponseProjection.WorkOrderResponseProjection.workorder", 0) <= maxDepth) {
            projectionDepthOnFields.put("FileResponseProjection.WorkOrderResponseProjection.workorder", projectionDepthOnFields.getOrDefault("FileResponseProjection.WorkOrderResponseProjection.workorder", 0) + 1);
            this.workorder(new WorkOrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FileResponseProjection.WorkOrderResponseProjection.workorder", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FileResponseProjection.DocumentCategoryResponseProjection.documentCategory", 0) <= maxDepth) {
            projectionDepthOnFields.put("FileResponseProjection.DocumentCategoryResponseProjection.documentCategory", projectionDepthOnFields.getOrDefault("FileResponseProjection.DocumentCategoryResponseProjection.documentCategory", 0) + 1);
            this.documentCategory(new DocumentCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FileResponseProjection.DocumentCategoryResponseProjection.documentCategory", 0)));
        }
        this.typename();
        return this;
    }

    public FileResponseProjection id() {
        return id(null);
    }

    public FileResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public FileResponseProjection fileName() {
        return fileName(null);
    }

    public FileResponseProjection fileName(String alias) {
        fields.add(new GraphQLResponseField("fileName").alias(alias));
        return this;
    }

    public FileResponseProjection sizeInBytes() {
        return sizeInBytes(null);
    }

    public FileResponseProjection sizeInBytes(String alias) {
        fields.add(new GraphQLResponseField("sizeInBytes").alias(alias));
        return this;
    }

    public FileResponseProjection modified() {
        return modified(null);
    }

    public FileResponseProjection modified(String alias) {
        fields.add(new GraphQLResponseField("modified").alias(alias));
        return this;
    }

    public FileResponseProjection uploaded() {
        return uploaded(null);
    }

    public FileResponseProjection uploaded(String alias) {
        fields.add(new GraphQLResponseField("uploaded").alias(alias));
        return this;
    }

    public FileResponseProjection fileType() {
        return fileType(null);
    }

    public FileResponseProjection fileType(String alias) {
        fields.add(new GraphQLResponseField("fileType").alias(alias));
        return this;
    }

    public FileResponseProjection mimeType() {
        return mimeType(null);
    }

    public FileResponseProjection mimeType(String alias) {
        fields.add(new GraphQLResponseField("mimeType").alias(alias));
        return this;
    }

    public FileResponseProjection storeKey() {
        return storeKey(null);
    }

    public FileResponseProjection storeKey(String alias) {
        fields.add(new GraphQLResponseField("storeKey").alias(alias));
        return this;
    }

    public FileResponseProjection category() {
        return category(null);
    }

    public FileResponseProjection category(String alias) {
        fields.add(new GraphQLResponseField("category").alias(alias));
        return this;
    }

    public FileResponseProjection annotation() {
        return annotation(null);
    }

    public FileResponseProjection annotation(String alias) {
        fields.add(new GraphQLResponseField("annotation").alias(alias));
        return this;
    }

    public FileResponseProjection workorder(WorkOrderResponseProjection subProjection) {
        return workorder(null, subProjection);
    }

    public FileResponseProjection workorder(String alias, WorkOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workorder").alias(alias).projection(subProjection));
        return this;
    }

    public FileResponseProjection documentCategory(DocumentCategoryResponseProjection subProjection) {
        return documentCategory(null, subProjection);
    }

    public FileResponseProjection documentCategory(String alias, DocumentCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("documentCategory").alias(alias).projection(subProjection));
        return this;
    }

    public FileResponseProjection typename() {
        return typename(null);
    }

    public FileResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
