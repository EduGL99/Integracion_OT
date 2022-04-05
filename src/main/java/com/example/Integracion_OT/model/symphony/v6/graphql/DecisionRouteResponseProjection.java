package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for DecisionRoute
 */

public class DecisionRouteResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public DecisionRouteResponseProjection() {
    }

    public DecisionRouteResponseProjection all$() {
        return all$(3);
    }

    public DecisionRouteResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("DecisionRouteResponseProjection.ExitPointResponseProjection.exitPoint", 0) <= maxDepth) {
            projectionDepthOnFields.put("DecisionRouteResponseProjection.ExitPointResponseProjection.exitPoint", projectionDepthOnFields.getOrDefault("DecisionRouteResponseProjection.ExitPointResponseProjection.exitPoint", 0) + 1);
            this.exitPoint(new ExitPointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DecisionRouteResponseProjection.ExitPointResponseProjection.exitPoint", 0)));
        }
        this.typename();
        return this;
    }

    public DecisionRouteResponseProjection exitPoint(ExitPointResponseProjection subProjection) {
        return exitPoint(null, subProjection);
    }

    public DecisionRouteResponseProjection exitPoint(String alias, ExitPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("exitPoint").alias(alias).projection(subProjection));
        return this;
    }

    public DecisionRouteResponseProjection typename() {
        return typename(null);
    }

    public DecisionRouteResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
