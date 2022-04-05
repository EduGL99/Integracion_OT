package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for StartBlock
 */

public class StartBlockResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public StartBlockResponseProjection() {
    }

    public StartBlockResponseProjection all$() {
        return all$(3);
    }

    public StartBlockResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("StartBlockResponseProjection.VariableDefinitionResponseProjection.paramDefinitions", 0) <= maxDepth) {
            projectionDepthOnFields.put("StartBlockResponseProjection.VariableDefinitionResponseProjection.paramDefinitions", projectionDepthOnFields.getOrDefault("StartBlockResponseProjection.VariableDefinitionResponseProjection.paramDefinitions", 0) + 1);
            this.paramDefinitions(new VariableDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StartBlockResponseProjection.VariableDefinitionResponseProjection.paramDefinitions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("StartBlockResponseProjection.ExitPointResponseProjection.exitPoint", 0) <= maxDepth) {
            projectionDepthOnFields.put("StartBlockResponseProjection.ExitPointResponseProjection.exitPoint", projectionDepthOnFields.getOrDefault("StartBlockResponseProjection.ExitPointResponseProjection.exitPoint", 0) + 1);
            this.exitPoint(new ExitPointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StartBlockResponseProjection.ExitPointResponseProjection.exitPoint", 0)));
        }
        this.typename();
        return this;
    }

    public StartBlockResponseProjection paramDefinitions(VariableDefinitionResponseProjection subProjection) {
        return paramDefinitions(null, subProjection);
    }

    public StartBlockResponseProjection paramDefinitions(String alias, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("paramDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public StartBlockResponseProjection exitPoint(ExitPointResponseProjection subProjection) {
        return exitPoint(null, subProjection);
    }

    public StartBlockResponseProjection exitPoint(String alias, ExitPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("exitPoint").alias(alias).projection(subProjection));
        return this;
    }

    public StartBlockResponseProjection typename() {
        return typename(null);
    }

    public StartBlockResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
