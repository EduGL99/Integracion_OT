package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ActionType
 */

public class ActionTypeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ActionTypeResponseProjection() {
    }

    public ActionTypeResponseProjection all$() {
        return all$(3);
    }

    public ActionTypeResponseProjection all$(int maxDepth) {
        this.id();
        this.description();
        if (projectionDepthOnFields.getOrDefault("ActionTypeResponseProjection.VariableDefinitionResponseProjection.variables", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActionTypeResponseProjection.VariableDefinitionResponseProjection.variables", projectionDepthOnFields.getOrDefault("ActionTypeResponseProjection.VariableDefinitionResponseProjection.variables", 0) + 1);
            this.variables(new VariableDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActionTypeResponseProjection.VariableDefinitionResponseProjection.variables", 0)));
        }
        this.typename();
        return this;
    }

    public ActionTypeResponseProjection id() {
        return id(null);
    }

    public ActionTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ActionTypeResponseProjection description() {
        return description(null);
    }

    public ActionTypeResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ActionTypeResponseProjection variables(VariableDefinitionResponseProjection subProjection) {
        return variables(null, subProjection);
    }

    public ActionTypeResponseProjection variables(String alias, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("variables").alias(alias).projection(subProjection));
        return this;
    }

    public ActionTypeResponseProjection typename() {
        return typename(null);
    }

    public ActionTypeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
