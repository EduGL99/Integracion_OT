package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for VariableValue
 */

public class VariableValueResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public VariableValueResponseProjection() {
    }

    public VariableValueResponseProjection all$() {
        return all$(3);
    }

    public VariableValueResponseProjection all$(int maxDepth) {
        this.variableDefinitionKey();
        this.value();
        this.typename();
        return this;
    }

    public VariableValueResponseProjection variableDefinitionKey() {
        return variableDefinitionKey(null);
    }

    public VariableValueResponseProjection variableDefinitionKey(String alias) {
        fields.add(new GraphQLResponseField("variableDefinitionKey").alias(alias));
        return this;
    }

    public VariableValueResponseProjection value() {
        return value(null);
    }

    public VariableValueResponseProjection value(String alias) {
        fields.add(new GraphQLResponseField("value").alias(alias));
        return this;
    }

    public VariableValueResponseProjection typename() {
        return typename(null);
    }

    public VariableValueResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
