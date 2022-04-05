package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for TriggerType
 */

public class TriggerTypeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public TriggerTypeResponseProjection() {
    }

    public TriggerTypeResponseProjection all$() {
        return all$(3);
    }

    public TriggerTypeResponseProjection all$(int maxDepth) {
        this.id();
        this.description();
        if (projectionDepthOnFields.getOrDefault("TriggerTypeResponseProjection.VariableDefinitionResponseProjection.variables", 0) <= maxDepth) {
            projectionDepthOnFields.put("TriggerTypeResponseProjection.VariableDefinitionResponseProjection.variables", projectionDepthOnFields.getOrDefault("TriggerTypeResponseProjection.VariableDefinitionResponseProjection.variables", 0) + 1);
            this.variables(new VariableDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TriggerTypeResponseProjection.VariableDefinitionResponseProjection.variables", 0)));
        }
        this.typename();
        return this;
    }

    public TriggerTypeResponseProjection id() {
        return id(null);
    }

    public TriggerTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public TriggerTypeResponseProjection description() {
        return description(null);
    }

    public TriggerTypeResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public TriggerTypeResponseProjection variables(VariableDefinitionResponseProjection subProjection) {
        return variables(null, subProjection);
    }

    public TriggerTypeResponseProjection variables(String alias, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("variables").alias(alias).projection(subProjection));
        return this;
    }

    public TriggerTypeResponseProjection typename() {
        return typename(null);
    }

    public TriggerTypeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
