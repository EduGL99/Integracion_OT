package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for RecommendationsSources
 */

public class RecommendationsSourcesResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RecommendationsSourcesResponseProjection() {
    }

    public RecommendationsSourcesResponseProjection all$() {
        return all$(3);
    }

    public RecommendationsSourcesResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("RecommendationsSourcesResponseProjection.RecommendationsResponseProjection.recommendations", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecommendationsSourcesResponseProjection.RecommendationsResponseProjection.recommendations", projectionDepthOnFields.getOrDefault("RecommendationsSourcesResponseProjection.RecommendationsResponseProjection.recommendations", 0) + 1);
            this.recommendations(new RecommendationsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecommendationsSourcesResponseProjection.RecommendationsResponseProjection.recommendations", 0)));
        }
        this.typename();
        return this;
    }

    public RecommendationsSourcesResponseProjection id() {
        return id(null);
    }

    public RecommendationsSourcesResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RecommendationsSourcesResponseProjection name() {
        return name(null);
    }

    public RecommendationsSourcesResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public RecommendationsSourcesResponseProjection recommendations(RecommendationsResponseProjection subProjection) {
        return recommendations(null, subProjection);
    }

    public RecommendationsSourcesResponseProjection recommendations(String alias, RecommendationsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("recommendations").alias(alias).projection(subProjection));
        return this;
    }

    public RecommendationsSourcesResponseProjection typename() {
        return typename(null);
    }

    public RecommendationsSourcesResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
