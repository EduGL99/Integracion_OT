package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for VariableDefinition
 */

public class VariableDefinitionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public VariableDefinitionResponseProjection() {
    }

    public VariableDefinitionResponseProjection all$() {
        return all$(3);
    }

    public VariableDefinitionResponseProjection all$(int maxDepth) {
        this.key();
        this.name();
        this.type();
        this.mandatory();
        this.multipleValues();
        this.choices();
        this.defaultValue();
        this.usage();
        if (projectionDepthOnFields.getOrDefault("VariableDefinitionResponseProjection.VariableDefinitionResponseProjection.nestedVariables", 0) <= maxDepth) {
            projectionDepthOnFields.put("VariableDefinitionResponseProjection.VariableDefinitionResponseProjection.nestedVariables", projectionDepthOnFields.getOrDefault("VariableDefinitionResponseProjection.VariableDefinitionResponseProjection.nestedVariables", 0) + 1);
            this.nestedVariables(new VariableDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("VariableDefinitionResponseProjection.VariableDefinitionResponseProjection.nestedVariables", 0)));
        }
        this.typename();
        return this;
    }

    public VariableDefinitionResponseProjection key() {
        return key(null);
    }

    public VariableDefinitionResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public VariableDefinitionResponseProjection name() {
        return name(null);
    }

    public VariableDefinitionResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public VariableDefinitionResponseProjection type() {
        return type(null);
    }

    public VariableDefinitionResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public VariableDefinitionResponseProjection mandatory() {
        return mandatory(null);
    }

    public VariableDefinitionResponseProjection mandatory(String alias) {
        fields.add(new GraphQLResponseField("mandatory").alias(alias));
        return this;
    }

    public VariableDefinitionResponseProjection multipleValues() {
        return multipleValues(null);
    }

    public VariableDefinitionResponseProjection multipleValues(String alias) {
        fields.add(new GraphQLResponseField("multipleValues").alias(alias));
        return this;
    }

    public VariableDefinitionResponseProjection choices() {
        return choices(null);
    }

    public VariableDefinitionResponseProjection choices(String alias) {
        fields.add(new GraphQLResponseField("choices").alias(alias));
        return this;
    }

    public VariableDefinitionResponseProjection defaultValue() {
        return defaultValue(null);
    }

    public VariableDefinitionResponseProjection defaultValue(String alias) {
        fields.add(new GraphQLResponseField("defaultValue").alias(alias));
        return this;
    }

    public VariableDefinitionResponseProjection usage() {
        return usage(null);
    }

    public VariableDefinitionResponseProjection usage(String alias) {
        fields.add(new GraphQLResponseField("usage").alias(alias));
        return this;
    }

    public VariableDefinitionResponseProjection nestedVariables(VariableDefinitionResponseProjection subProjection) {
        return nestedVariables((String) null, subProjection);
    }

    public VariableDefinitionResponseProjection nestedVariables(String alias, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nestedVariables").alias(alias).projection(subProjection));
        return this;
    }

    public VariableDefinitionResponseProjection nestedVariables(VariableDefinitionNestedVariablesParametrizedInput input, VariableDefinitionResponseProjection subProjection) {
        return nestedVariables(null, input, subProjection);
    }

    public VariableDefinitionResponseProjection nestedVariables(String alias, VariableDefinitionNestedVariablesParametrizedInput input, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nestedVariables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public VariableDefinitionResponseProjection typename() {
        return typename(null);
    }

    public VariableDefinitionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
