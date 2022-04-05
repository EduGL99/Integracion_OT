package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KqiCategoryEdge
 */

public class KqiCategoryEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KqiCategoryEdgeResponseProjection() {
    }

    public KqiCategoryEdgeResponseProjection all$() {
        return all$(3);
    }

    public KqiCategoryEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("KqiCategoryEdgeResponseProjection.KqiCategoryResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiCategoryEdgeResponseProjection.KqiCategoryResponseProjection.node", projectionDepthOnFields.getOrDefault("KqiCategoryEdgeResponseProjection.KqiCategoryResponseProjection.node", 0) + 1);
            this.node(new KqiCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiCategoryEdgeResponseProjection.KqiCategoryResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public KqiCategoryEdgeResponseProjection node(KqiCategoryResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public KqiCategoryEdgeResponseProjection node(String alias, KqiCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public KqiCategoryEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public KqiCategoryEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public KqiCategoryEdgeResponseProjection typename() {
        return typename(null);
    }

    public KqiCategoryEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
