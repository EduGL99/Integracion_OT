package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for SubflowBlock
 */

public class SubflowBlockResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SubflowBlockResponseProjection() {
    }

    public SubflowBlockResponseProjection all$() {
        return all$(3);
    }

    public SubflowBlockResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("SubflowBlockResponseProjection.FlowResponseProjection.flow", 0) <= maxDepth) {
            projectionDepthOnFields.put("SubflowBlockResponseProjection.FlowResponseProjection.flow", projectionDepthOnFields.getOrDefault("SubflowBlockResponseProjection.FlowResponseProjection.flow", 0) + 1);
            this.flow(new FlowResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SubflowBlockResponseProjection.FlowResponseProjection.flow", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SubflowBlockResponseProjection.VariableExpressionResponseProjection.params", 0) <= maxDepth) {
            projectionDepthOnFields.put("SubflowBlockResponseProjection.VariableExpressionResponseProjection.params", projectionDepthOnFields.getOrDefault("SubflowBlockResponseProjection.VariableExpressionResponseProjection.params", 0) + 1);
            this.params(new VariableExpressionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SubflowBlockResponseProjection.VariableExpressionResponseProjection.params", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SubflowBlockResponseProjection.EntryPointResponseProjection.entryPoint", 0) <= maxDepth) {
            projectionDepthOnFields.put("SubflowBlockResponseProjection.EntryPointResponseProjection.entryPoint", projectionDepthOnFields.getOrDefault("SubflowBlockResponseProjection.EntryPointResponseProjection.entryPoint", 0) + 1);
            this.entryPoint(new EntryPointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SubflowBlockResponseProjection.EntryPointResponseProjection.entryPoint", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SubflowBlockResponseProjection.ExitPointResponseProjection.exitPoint", 0) <= maxDepth) {
            projectionDepthOnFields.put("SubflowBlockResponseProjection.ExitPointResponseProjection.exitPoint", projectionDepthOnFields.getOrDefault("SubflowBlockResponseProjection.ExitPointResponseProjection.exitPoint", 0) + 1);
            this.exitPoint(new ExitPointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SubflowBlockResponseProjection.ExitPointResponseProjection.exitPoint", 0)));
        }
        this.typename();
        return this;
    }

    public SubflowBlockResponseProjection flow(FlowResponseProjection subProjection) {
        return flow(null, subProjection);
    }

    public SubflowBlockResponseProjection flow(String alias, FlowResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("flow").alias(alias).projection(subProjection));
        return this;
    }

    public SubflowBlockResponseProjection params(VariableExpressionResponseProjection subProjection) {
        return params(null, subProjection);
    }

    public SubflowBlockResponseProjection params(String alias, VariableExpressionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("params").alias(alias).projection(subProjection));
        return this;
    }

    public SubflowBlockResponseProjection entryPoint(EntryPointResponseProjection subProjection) {
        return entryPoint(null, subProjection);
    }

    public SubflowBlockResponseProjection entryPoint(String alias, EntryPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("entryPoint").alias(alias).projection(subProjection));
        return this;
    }

    public SubflowBlockResponseProjection exitPoint(ExitPointResponseProjection subProjection) {
        return exitPoint(null, subProjection);
    }

    public SubflowBlockResponseProjection exitPoint(String alias, ExitPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("exitPoint").alias(alias).projection(subProjection));
        return this;
    }

    public SubflowBlockResponseProjection typename() {
        return typename(null);
    }

    public SubflowBlockResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
