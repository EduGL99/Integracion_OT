package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for DecisionBlock
 */

public class DecisionBlockResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public DecisionBlockResponseProjection() {
    }

    public DecisionBlockResponseProjection all$() {
        return all$(3);
    }

    public DecisionBlockResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("DecisionBlockResponseProjection.EntryPointResponseProjection.entryPoint", 0) <= maxDepth) {
            projectionDepthOnFields.put("DecisionBlockResponseProjection.EntryPointResponseProjection.entryPoint", projectionDepthOnFields.getOrDefault("DecisionBlockResponseProjection.EntryPointResponseProjection.entryPoint", 0) + 1);
            this.entryPoint(new EntryPointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DecisionBlockResponseProjection.EntryPointResponseProjection.entryPoint", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DecisionBlockResponseProjection.ExitPointResponseProjection.defaultExitPoint", 0) <= maxDepth) {
            projectionDepthOnFields.put("DecisionBlockResponseProjection.ExitPointResponseProjection.defaultExitPoint", projectionDepthOnFields.getOrDefault("DecisionBlockResponseProjection.ExitPointResponseProjection.defaultExitPoint", 0) + 1);
            this.defaultExitPoint(new ExitPointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DecisionBlockResponseProjection.ExitPointResponseProjection.defaultExitPoint", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DecisionBlockResponseProjection.DecisionRouteResponseProjection.routes", 0) <= maxDepth) {
            projectionDepthOnFields.put("DecisionBlockResponseProjection.DecisionRouteResponseProjection.routes", projectionDepthOnFields.getOrDefault("DecisionBlockResponseProjection.DecisionRouteResponseProjection.routes", 0) + 1);
            this.routes(new DecisionRouteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DecisionBlockResponseProjection.DecisionRouteResponseProjection.routes", 0)));
        }
        this.typename();
        return this;
    }

    public DecisionBlockResponseProjection entryPoint(EntryPointResponseProjection subProjection) {
        return entryPoint(null, subProjection);
    }

    public DecisionBlockResponseProjection entryPoint(String alias, EntryPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("entryPoint").alias(alias).projection(subProjection));
        return this;
    }

    public DecisionBlockResponseProjection defaultExitPoint(ExitPointResponseProjection subProjection) {
        return defaultExitPoint(null, subProjection);
    }

    public DecisionBlockResponseProjection defaultExitPoint(String alias, ExitPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("defaultExitPoint").alias(alias).projection(subProjection));
        return this;
    }

    public DecisionBlockResponseProjection routes(DecisionRouteResponseProjection subProjection) {
        return routes(null, subProjection);
    }

    public DecisionBlockResponseProjection routes(String alias, DecisionRouteResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("routes").alias(alias).projection(subProjection));
        return this;
    }

    public DecisionBlockResponseProjection typename() {
        return typename(null);
    }

    public DecisionBlockResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
