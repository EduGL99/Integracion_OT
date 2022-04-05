package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EndBlock
 */

public class EndBlockResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EndBlockResponseProjection() {
    }

    public EndBlockResponseProjection all$() {
        return all$(3);
    }

    public EndBlockResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("EndBlockResponseProjection.VariableExpressionResponseProjection.params", 0) <= maxDepth) {
            projectionDepthOnFields.put("EndBlockResponseProjection.VariableExpressionResponseProjection.params", projectionDepthOnFields.getOrDefault("EndBlockResponseProjection.VariableExpressionResponseProjection.params", 0) + 1);
            this.params(new VariableExpressionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EndBlockResponseProjection.VariableExpressionResponseProjection.params", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EndBlockResponseProjection.EntryPointResponseProjection.entryPoint", 0) <= maxDepth) {
            projectionDepthOnFields.put("EndBlockResponseProjection.EntryPointResponseProjection.entryPoint", projectionDepthOnFields.getOrDefault("EndBlockResponseProjection.EntryPointResponseProjection.entryPoint", 0) + 1);
            this.entryPoint(new EntryPointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EndBlockResponseProjection.EntryPointResponseProjection.entryPoint", 0)));
        }
        this.typename();
        return this;
    }

    public EndBlockResponseProjection params(VariableExpressionResponseProjection subProjection) {
        return params(null, subProjection);
    }

    public EndBlockResponseProjection params(String alias, VariableExpressionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("params").alias(alias).projection(subProjection));
        return this;
    }

    public EndBlockResponseProjection entryPoint(EntryPointResponseProjection subProjection) {
        return entryPoint(null, subProjection);
    }

    public EndBlockResponseProjection entryPoint(String alias, EntryPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("entryPoint").alias(alias).projection(subProjection));
        return this;
    }

    public EndBlockResponseProjection typename() {
        return typename(null);
    }

    public EndBlockResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
