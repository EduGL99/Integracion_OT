package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for RecommendationsSourcesConnection
 */

public class RecommendationsSourcesConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RecommendationsSourcesConnectionResponseProjection() {
    }

    public RecommendationsSourcesConnectionResponseProjection all$() {
        return all$(3);
    }

    public RecommendationsSourcesConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("RecommendationsSourcesConnectionResponseProjection.RecommendationsSourcesEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecommendationsSourcesConnectionResponseProjection.RecommendationsSourcesEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RecommendationsSourcesConnectionResponseProjection.RecommendationsSourcesEdgeResponseProjection.edges", 0) + 1);
            this.edges(new RecommendationsSourcesEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecommendationsSourcesConnectionResponseProjection.RecommendationsSourcesEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RecommendationsSourcesConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecommendationsSourcesConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RecommendationsSourcesConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecommendationsSourcesConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public RecommendationsSourcesConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public RecommendationsSourcesConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public RecommendationsSourcesConnectionResponseProjection edges(RecommendationsSourcesEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public RecommendationsSourcesConnectionResponseProjection edges(String alias, RecommendationsSourcesEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public RecommendationsSourcesConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public RecommendationsSourcesConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public RecommendationsSourcesConnectionResponseProjection typename() {
        return typename(null);
    }

    public RecommendationsSourcesConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
