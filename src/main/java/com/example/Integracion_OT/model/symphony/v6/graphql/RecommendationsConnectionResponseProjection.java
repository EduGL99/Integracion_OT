package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for RecommendationsConnection
 */

public class RecommendationsConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RecommendationsConnectionResponseProjection() {
    }

    public RecommendationsConnectionResponseProjection all$() {
        return all$(3);
    }

    public RecommendationsConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("RecommendationsConnectionResponseProjection.RecommendationsEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecommendationsConnectionResponseProjection.RecommendationsEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RecommendationsConnectionResponseProjection.RecommendationsEdgeResponseProjection.edges", 0) + 1);
            this.edges(new RecommendationsEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecommendationsConnectionResponseProjection.RecommendationsEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RecommendationsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecommendationsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RecommendationsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecommendationsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public RecommendationsConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public RecommendationsConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public RecommendationsConnectionResponseProjection edges(RecommendationsEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public RecommendationsConnectionResponseProjection edges(String alias, RecommendationsEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public RecommendationsConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public RecommendationsConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public RecommendationsConnectionResponseProjection typename() {
        return typename(null);
    }

    public RecommendationsConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
