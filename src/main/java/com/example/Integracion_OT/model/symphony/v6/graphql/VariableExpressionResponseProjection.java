package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for VariableExpression
 */

public class VariableExpressionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public VariableExpressionResponseProjection() {
    }

    public VariableExpressionResponseProjection all$() {
        return all$(3);
    }

    public VariableExpressionResponseProjection all$(int maxDepth) {
        this.type();
        if (projectionDepthOnFields.getOrDefault("VariableExpressionResponseProjection.VariableDefinitionResponseProjection.variableDefinition", 0) <= maxDepth) {
            projectionDepthOnFields.put("VariableExpressionResponseProjection.VariableDefinitionResponseProjection.variableDefinition", projectionDepthOnFields.getOrDefault("VariableExpressionResponseProjection.VariableDefinitionResponseProjection.variableDefinition", 0) + 1);
            this.variableDefinition(new VariableDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("VariableExpressionResponseProjection.VariableDefinitionResponseProjection.variableDefinition", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("VariableExpressionResponseProjection.PropertyTypeResponseProjection.propertyTypeDefinition", 0) <= maxDepth) {
            projectionDepthOnFields.put("VariableExpressionResponseProjection.PropertyTypeResponseProjection.propertyTypeDefinition", projectionDepthOnFields.getOrDefault("VariableExpressionResponseProjection.PropertyTypeResponseProjection.propertyTypeDefinition", 0) + 1);
            this.propertyTypeDefinition(new PropertyTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("VariableExpressionResponseProjection.PropertyTypeResponseProjection.propertyTypeDefinition", 0)));
        }
        this.expression();
        if (projectionDepthOnFields.getOrDefault("VariableExpressionResponseProjection.BlockVariableResponseProjection.blockVariables", 0) <= maxDepth) {
            projectionDepthOnFields.put("VariableExpressionResponseProjection.BlockVariableResponseProjection.blockVariables", projectionDepthOnFields.getOrDefault("VariableExpressionResponseProjection.BlockVariableResponseProjection.blockVariables", 0) + 1);
            this.blockVariables(new BlockVariableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("VariableExpressionResponseProjection.BlockVariableResponseProjection.blockVariables", 0)));
        }
        this.typename();
        return this;
    }

    public VariableExpressionResponseProjection type() {
        return type(null);
    }

    public VariableExpressionResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public VariableExpressionResponseProjection variableDefinition(VariableDefinitionResponseProjection subProjection) {
        return variableDefinition(null, subProjection);
    }

    public VariableExpressionResponseProjection variableDefinition(String alias, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("variableDefinition").alias(alias).projection(subProjection));
        return this;
    }

    public VariableExpressionResponseProjection propertyTypeDefinition(PropertyTypeResponseProjection subProjection) {
        return propertyTypeDefinition(null, subProjection);
    }

    public VariableExpressionResponseProjection propertyTypeDefinition(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("propertyTypeDefinition").alias(alias).projection(subProjection));
        return this;
    }

    public VariableExpressionResponseProjection expression() {
        return expression(null);
    }

    public VariableExpressionResponseProjection expression(String alias) {
        fields.add(new GraphQLResponseField("expression").alias(alias));
        return this;
    }

    public VariableExpressionResponseProjection blockVariables(BlockVariableResponseProjection subProjection) {
        return blockVariables(null, subProjection);
    }

    public VariableExpressionResponseProjection blockVariables(String alias, BlockVariableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("blockVariables").alias(alias).projection(subProjection));
        return this;
    }

    public VariableExpressionResponseProjection typename() {
        return typename(null);
    }

    public VariableExpressionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
