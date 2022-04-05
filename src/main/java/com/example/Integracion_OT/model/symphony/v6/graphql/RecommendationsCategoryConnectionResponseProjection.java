package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for RecommendationsCategoryConnection
 */

public class RecommendationsCategoryConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RecommendationsCategoryConnectionResponseProjection() {
    }

    public RecommendationsCategoryConnectionResponseProjection all$() {
        return all$(3);
    }

    public RecommendationsCategoryConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("RecommendationsCategoryConnectionResponseProjection.RecommendationsCategoryEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecommendationsCategoryConnectionResponseProjection.RecommendationsCategoryEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RecommendationsCategoryConnectionResponseProjection.RecommendationsCategoryEdgeResponseProjection.edges", 0) + 1);
            this.edges(new RecommendationsCategoryEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecommendationsCategoryConnectionResponseProjection.RecommendationsCategoryEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RecommendationsCategoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecommendationsCategoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RecommendationsCategoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecommendationsCategoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public RecommendationsCategoryConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public RecommendationsCategoryConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public RecommendationsCategoryConnectionResponseProjection edges(RecommendationsCategoryEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public RecommendationsCategoryConnectionResponseProjection edges(String alias, RecommendationsCategoryEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public RecommendationsCategoryConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public RecommendationsCategoryConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public RecommendationsCategoryConnectionResponseProjection typename() {
        return typename(null);
    }

    public RecommendationsCategoryConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
