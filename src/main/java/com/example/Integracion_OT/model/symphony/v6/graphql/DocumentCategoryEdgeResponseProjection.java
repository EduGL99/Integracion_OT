package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for DocumentCategoryEdge
 */

public class DocumentCategoryEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public DocumentCategoryEdgeResponseProjection() {
    }

    public DocumentCategoryEdgeResponseProjection all$() {
        return all$(3);
    }

    public DocumentCategoryEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("DocumentCategoryEdgeResponseProjection.DocumentCategoryResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("DocumentCategoryEdgeResponseProjection.DocumentCategoryResponseProjection.node", projectionDepthOnFields.getOrDefault("DocumentCategoryEdgeResponseProjection.DocumentCategoryResponseProjection.node", 0) + 1);
            this.node(new DocumentCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DocumentCategoryEdgeResponseProjection.DocumentCategoryResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public DocumentCategoryEdgeResponseProjection node(DocumentCategoryResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public DocumentCategoryEdgeResponseProjection node(String alias, DocumentCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public DocumentCategoryEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public DocumentCategoryEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public DocumentCategoryEdgeResponseProjection typename() {
        return typename(null);
    }

    public DocumentCategoryEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
