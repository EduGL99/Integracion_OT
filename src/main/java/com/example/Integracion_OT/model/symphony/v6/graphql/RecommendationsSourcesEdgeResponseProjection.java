package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for RecommendationsSourcesEdge
 */

public class RecommendationsSourcesEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RecommendationsSourcesEdgeResponseProjection() {
    }

    public RecommendationsSourcesEdgeResponseProjection all$() {
        return all$(3);
    }

    public RecommendationsSourcesEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RecommendationsSourcesEdgeResponseProjection.RecommendationsSourcesResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecommendationsSourcesEdgeResponseProjection.RecommendationsSourcesResponseProjection.node", projectionDepthOnFields.getOrDefault("RecommendationsSourcesEdgeResponseProjection.RecommendationsSourcesResponseProjection.node", 0) + 1);
            this.node(new RecommendationsSourcesResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecommendationsSourcesEdgeResponseProjection.RecommendationsSourcesResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public RecommendationsSourcesEdgeResponseProjection node(RecommendationsSourcesResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public RecommendationsSourcesEdgeResponseProjection node(String alias, RecommendationsSourcesResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public RecommendationsSourcesEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public RecommendationsSourcesEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public RecommendationsSourcesEdgeResponseProjection typename() {
        return typename(null);
    }

    public RecommendationsSourcesEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
