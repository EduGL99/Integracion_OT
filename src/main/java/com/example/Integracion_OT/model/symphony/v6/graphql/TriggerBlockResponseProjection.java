package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for TriggerBlock
 */

public class TriggerBlockResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public TriggerBlockResponseProjection() {
    }

    public TriggerBlockResponseProjection all$() {
        return all$(3);
    }

    public TriggerBlockResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("TriggerBlockResponseProjection.TriggerTypeResponseProjection.triggerType", 0) <= maxDepth) {
            projectionDepthOnFields.put("TriggerBlockResponseProjection.TriggerTypeResponseProjection.triggerType", projectionDepthOnFields.getOrDefault("TriggerBlockResponseProjection.TriggerTypeResponseProjection.triggerType", 0) + 1);
            this.triggerType(new TriggerTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TriggerBlockResponseProjection.TriggerTypeResponseProjection.triggerType", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TriggerBlockResponseProjection.VariableExpressionResponseProjection.params", 0) <= maxDepth) {
            projectionDepthOnFields.put("TriggerBlockResponseProjection.VariableExpressionResponseProjection.params", projectionDepthOnFields.getOrDefault("TriggerBlockResponseProjection.VariableExpressionResponseProjection.params", 0) + 1);
            this.params(new VariableExpressionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TriggerBlockResponseProjection.VariableExpressionResponseProjection.params", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TriggerBlockResponseProjection.ExitPointResponseProjection.exitPoint", 0) <= maxDepth) {
            projectionDepthOnFields.put("TriggerBlockResponseProjection.ExitPointResponseProjection.exitPoint", projectionDepthOnFields.getOrDefault("TriggerBlockResponseProjection.ExitPointResponseProjection.exitPoint", 0) + 1);
            this.exitPoint(new ExitPointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TriggerBlockResponseProjection.ExitPointResponseProjection.exitPoint", 0)));
        }
        this.typename();
        return this;
    }

    public TriggerBlockResponseProjection triggerType(TriggerTypeResponseProjection subProjection) {
        return triggerType(null, subProjection);
    }

    public TriggerBlockResponseProjection triggerType(String alias, TriggerTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("triggerType").alias(alias).projection(subProjection));
        return this;
    }

    public TriggerBlockResponseProjection params(VariableExpressionResponseProjection subProjection) {
        return params(null, subProjection);
    }

    public TriggerBlockResponseProjection params(String alias, VariableExpressionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("params").alias(alias).projection(subProjection));
        return this;
    }

    public TriggerBlockResponseProjection exitPoint(ExitPointResponseProjection subProjection) {
        return exitPoint(null, subProjection);
    }

    public TriggerBlockResponseProjection exitPoint(String alias, ExitPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("exitPoint").alias(alias).projection(subProjection));
        return this;
    }

    public TriggerBlockResponseProjection typename() {
        return typename(null);
    }

    public TriggerBlockResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
