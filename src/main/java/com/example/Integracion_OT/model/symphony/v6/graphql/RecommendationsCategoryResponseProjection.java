package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for RecommendationsCategory
 */

public class RecommendationsCategoryResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RecommendationsCategoryResponseProjection() {
    }

    public RecommendationsCategoryResponseProjection all$() {
        return all$(3);
    }

    public RecommendationsCategoryResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("RecommendationsCategoryResponseProjection.RecommendationsResponseProjection.recommendations", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecommendationsCategoryResponseProjection.RecommendationsResponseProjection.recommendations", projectionDepthOnFields.getOrDefault("RecommendationsCategoryResponseProjection.RecommendationsResponseProjection.recommendations", 0) + 1);
            this.recommendations(new RecommendationsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecommendationsCategoryResponseProjection.RecommendationsResponseProjection.recommendations", 0)));
        }
        this.typename();
        return this;
    }

    public RecommendationsCategoryResponseProjection id() {
        return id(null);
    }

    public RecommendationsCategoryResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RecommendationsCategoryResponseProjection name() {
        return name(null);
    }

    public RecommendationsCategoryResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public RecommendationsCategoryResponseProjection recommendations(RecommendationsResponseProjection subProjection) {
        return recommendations(null, subProjection);
    }

    public RecommendationsCategoryResponseProjection recommendations(String alias, RecommendationsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("recommendations").alias(alias).projection(subProjection));
        return this;
    }

    public RecommendationsCategoryResponseProjection typename() {
        return typename(null);
    }

    public RecommendationsCategoryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
