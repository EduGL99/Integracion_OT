package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ExportTask
 */

public class ExportTaskResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ExportTaskResponseProjection() {
    }

    public ExportTaskResponseProjection all$() {
        return all$(3);
    }

    public ExportTaskResponseProjection all$(int maxDepth) {
        this.id();
        this.type();
        this.status();
        this.progress();
        if (projectionDepthOnFields.getOrDefault("ExportTaskResponseProjection.GeneralFilterResponseProjection.filters", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExportTaskResponseProjection.GeneralFilterResponseProjection.filters", projectionDepthOnFields.getOrDefault("ExportTaskResponseProjection.GeneralFilterResponseProjection.filters", 0) + 1);
            this.filters(new GeneralFilterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExportTaskResponseProjection.GeneralFilterResponseProjection.filters", 0)));
        }
        this.storeKey();
        this.typename();
        return this;
    }

    public ExportTaskResponseProjection id() {
        return id(null);
    }

    public ExportTaskResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ExportTaskResponseProjection type() {
        return type(null);
    }

    public ExportTaskResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public ExportTaskResponseProjection status() {
        return status(null);
    }

    public ExportTaskResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public ExportTaskResponseProjection progress() {
        return progress(null);
    }

    public ExportTaskResponseProjection progress(String alias) {
        fields.add(new GraphQLResponseField("progress").alias(alias));
        return this;
    }

    public ExportTaskResponseProjection filters(GeneralFilterResponseProjection subProjection) {
        return filters(null, subProjection);
    }

    public ExportTaskResponseProjection filters(String alias, GeneralFilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("filters").alias(alias).projection(subProjection));
        return this;
    }

    public ExportTaskResponseProjection storeKey() {
        return storeKey(null);
    }

    public ExportTaskResponseProjection storeKey(String alias) {
        fields.add(new GraphQLResponseField("storeKey").alias(alias));
        return this;
    }

    public ExportTaskResponseProjection typename() {
        return typename(null);
    }

    public ExportTaskResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
