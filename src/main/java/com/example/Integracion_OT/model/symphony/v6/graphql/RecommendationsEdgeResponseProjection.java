package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for RecommendationsEdge
 */

public class RecommendationsEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RecommendationsEdgeResponseProjection() {
    }

    public RecommendationsEdgeResponseProjection all$() {
        return all$(3);
    }

    public RecommendationsEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RecommendationsEdgeResponseProjection.RecommendationsResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecommendationsEdgeResponseProjection.RecommendationsResponseProjection.node", projectionDepthOnFields.getOrDefault("RecommendationsEdgeResponseProjection.RecommendationsResponseProjection.node", 0) + 1);
            this.node(new RecommendationsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecommendationsEdgeResponseProjection.RecommendationsResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public RecommendationsEdgeResponseProjection node(RecommendationsResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public RecommendationsEdgeResponseProjection node(String alias, RecommendationsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public RecommendationsEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public RecommendationsEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public RecommendationsEdgeResponseProjection typename() {
        return typename(null);
    }

    public RecommendationsEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
