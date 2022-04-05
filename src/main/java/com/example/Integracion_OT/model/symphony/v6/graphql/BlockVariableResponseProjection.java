package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for BlockVariable
 */

public class BlockVariableResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public BlockVariableResponseProjection() {
    }

    public BlockVariableResponseProjection all$() {
        return all$(3);
    }

    public BlockVariableResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("BlockVariableResponseProjection.BlockResponseProjection.block", 0) <= maxDepth) {
            projectionDepthOnFields.put("BlockVariableResponseProjection.BlockResponseProjection.block", projectionDepthOnFields.getOrDefault("BlockVariableResponseProjection.BlockResponseProjection.block", 0) + 1);
            this.block(new BlockResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BlockVariableResponseProjection.BlockResponseProjection.block", 0)));
        }
        this.type();
        if (projectionDepthOnFields.getOrDefault("BlockVariableResponseProjection.VariableDefinitionResponseProjection.inputVariableDefinition", 0) <= maxDepth) {
            projectionDepthOnFields.put("BlockVariableResponseProjection.VariableDefinitionResponseProjection.inputVariableDefinition", projectionDepthOnFields.getOrDefault("BlockVariableResponseProjection.VariableDefinitionResponseProjection.inputVariableDefinition", 0) + 1);
            this.inputVariableDefinition(new VariableDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BlockVariableResponseProjection.VariableDefinitionResponseProjection.inputVariableDefinition", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("BlockVariableResponseProjection.PropertyTypeResponseProjection.inputPropertyTypeDefinition", 0) <= maxDepth) {
            projectionDepthOnFields.put("BlockVariableResponseProjection.PropertyTypeResponseProjection.inputPropertyTypeDefinition", projectionDepthOnFields.getOrDefault("BlockVariableResponseProjection.PropertyTypeResponseProjection.inputPropertyTypeDefinition", 0) + 1);
            this.inputPropertyTypeDefinition(new PropertyTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BlockVariableResponseProjection.PropertyTypeResponseProjection.inputPropertyTypeDefinition", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("BlockVariableResponseProjection.CheckListItemDefinitionResponseProjection.checkListItemDefinition", 0) <= maxDepth) {
            projectionDepthOnFields.put("BlockVariableResponseProjection.CheckListItemDefinitionResponseProjection.checkListItemDefinition", projectionDepthOnFields.getOrDefault("BlockVariableResponseProjection.CheckListItemDefinitionResponseProjection.checkListItemDefinition", 0) + 1);
            this.checkListItemDefinition(new CheckListItemDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BlockVariableResponseProjection.CheckListItemDefinitionResponseProjection.checkListItemDefinition", 0)));
        }
        this.typename();
        return this;
    }

    public BlockVariableResponseProjection block(BlockResponseProjection subProjection) {
        return block(null, subProjection);
    }

    public BlockVariableResponseProjection block(String alias, BlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("block").alias(alias).projection(subProjection));
        return this;
    }

    public BlockVariableResponseProjection type() {
        return type(null);
    }

    public BlockVariableResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public BlockVariableResponseProjection inputVariableDefinition(VariableDefinitionResponseProjection subProjection) {
        return inputVariableDefinition(null, subProjection);
    }

    public BlockVariableResponseProjection inputVariableDefinition(String alias, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("inputVariableDefinition").alias(alias).projection(subProjection));
        return this;
    }

    public BlockVariableResponseProjection inputPropertyTypeDefinition(PropertyTypeResponseProjection subProjection) {
        return inputPropertyTypeDefinition(null, subProjection);
    }

    public BlockVariableResponseProjection inputPropertyTypeDefinition(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("inputPropertyTypeDefinition").alias(alias).projection(subProjection));
        return this;
    }

    public BlockVariableResponseProjection checkListItemDefinition(CheckListItemDefinitionResponseProjection subProjection) {
        return checkListItemDefinition(null, subProjection);
    }

    public BlockVariableResponseProjection checkListItemDefinition(String alias, CheckListItemDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("checkListItemDefinition").alias(alias).projection(subProjection));
        return this;
    }

    public BlockVariableResponseProjection typename() {
        return typename(null);
    }

    public BlockVariableResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
