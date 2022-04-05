package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for RecommendationsCategoryEdge
 */

public class RecommendationsCategoryEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RecommendationsCategoryEdgeResponseProjection() {
    }

    public RecommendationsCategoryEdgeResponseProjection all$() {
        return all$(3);
    }

    public RecommendationsCategoryEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RecommendationsCategoryEdgeResponseProjection.RecommendationsCategoryResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecommendationsCategoryEdgeResponseProjection.RecommendationsCategoryResponseProjection.node", projectionDepthOnFields.getOrDefault("RecommendationsCategoryEdgeResponseProjection.RecommendationsCategoryResponseProjection.node", 0) + 1);
            this.node(new RecommendationsCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecommendationsCategoryEdgeResponseProjection.RecommendationsCategoryResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public RecommendationsCategoryEdgeResponseProjection node(RecommendationsCategoryResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public RecommendationsCategoryEdgeResponseProjection node(String alias, RecommendationsCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public RecommendationsCategoryEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public RecommendationsCategoryEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public RecommendationsCategoryEdgeResponseProjection typename() {
        return typename(null);
    }

    public RecommendationsCategoryEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
