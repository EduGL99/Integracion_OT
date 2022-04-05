package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Vertex
 */

public class VertexResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public VertexResponseProjection() {
    }

    public VertexResponseProjection all$() {
        return all$(3);
    }

    public VertexResponseProjection all$(int maxDepth) {
        this.id();
        this.type();
        if (projectionDepthOnFields.getOrDefault("VertexResponseProjection.FieldResponseProjection.fields", 0) <= maxDepth) {
            projectionDepthOnFields.put("VertexResponseProjection.FieldResponseProjection.fields", projectionDepthOnFields.getOrDefault("VertexResponseProjection.FieldResponseProjection.fields", 0) + 1);
            this.fields(new FieldResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("VertexResponseProjection.FieldResponseProjection.fields", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("VertexResponseProjection.EdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("VertexResponseProjection.EdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("VertexResponseProjection.EdgeResponseProjection.edges", 0) + 1);
            this.edges(new EdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("VertexResponseProjection.EdgeResponseProjection.edges", 0)));
        }
        this.typename();
        return this;
    }

    public VertexResponseProjection id() {
        return id(null);
    }

    public VertexResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public VertexResponseProjection type() {
        return type(null);
    }

    public VertexResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public VertexResponseProjection fields(FieldResponseProjection subProjection) {
        return fields(null, subProjection);
    }

    public VertexResponseProjection fields(String alias, FieldResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("fields").alias(alias).projection(subProjection));
        return this;
    }

    public VertexResponseProjection edges(EdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public VertexResponseProjection edges(String alias, EdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public VertexResponseProjection typename() {
        return typename(null);
    }

    public VertexResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
