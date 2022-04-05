package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Block
 */

public class BlockResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public BlockResponseProjection() {
    }

    public BlockResponseProjection all$() {
        return all$(3);
    }

    public BlockResponseProjection all$(int maxDepth) {
        this.id();
        this.cid();
        if (projectionDepthOnFields.getOrDefault("BlockResponseProjection.BlockResponseProjection.nextBlocks", 0) <= maxDepth) {
            projectionDepthOnFields.put("BlockResponseProjection.BlockResponseProjection.nextBlocks", projectionDepthOnFields.getOrDefault("BlockResponseProjection.BlockResponseProjection.nextBlocks", 0) + 1);
            this.nextBlocks(new BlockResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BlockResponseProjection.BlockResponseProjection.nextBlocks", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("BlockResponseProjection.BlockResponseProjection.prevBlocks", 0) <= maxDepth) {
            projectionDepthOnFields.put("BlockResponseProjection.BlockResponseProjection.prevBlocks", projectionDepthOnFields.getOrDefault("BlockResponseProjection.BlockResponseProjection.prevBlocks", 0) + 1);
            this.prevBlocks(new BlockResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BlockResponseProjection.BlockResponseProjection.prevBlocks", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("BlockResponseProjection.BlockDetailsResponseProjection.details", 0) <= maxDepth) {
            projectionDepthOnFields.put("BlockResponseProjection.BlockDetailsResponseProjection.details", projectionDepthOnFields.getOrDefault("BlockResponseProjection.BlockDetailsResponseProjection.details", 0) + 1);
            this.details(new BlockDetailsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BlockResponseProjection.BlockDetailsResponseProjection.details", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("BlockResponseProjection.VariableDefinitionResponseProjection.inputParamDefinitions", 0) <= maxDepth) {
            projectionDepthOnFields.put("BlockResponseProjection.VariableDefinitionResponseProjection.inputParamDefinitions", projectionDepthOnFields.getOrDefault("BlockResponseProjection.VariableDefinitionResponseProjection.inputParamDefinitions", 0) + 1);
            this.inputParamDefinitions(new VariableDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BlockResponseProjection.VariableDefinitionResponseProjection.inputParamDefinitions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("BlockResponseProjection.VariableDefinitionResponseProjection.outputParamDefinitions", 0) <= maxDepth) {
            projectionDepthOnFields.put("BlockResponseProjection.VariableDefinitionResponseProjection.outputParamDefinitions", projectionDepthOnFields.getOrDefault("BlockResponseProjection.VariableDefinitionResponseProjection.outputParamDefinitions", 0) + 1);
            this.outputParamDefinitions(new VariableDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BlockResponseProjection.VariableDefinitionResponseProjection.outputParamDefinitions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("BlockResponseProjection.BlockUIRepresentationResponseProjection.uiRepresentation", 0) <= maxDepth) {
            projectionDepthOnFields.put("BlockResponseProjection.BlockUIRepresentationResponseProjection.uiRepresentation", projectionDepthOnFields.getOrDefault("BlockResponseProjection.BlockUIRepresentationResponseProjection.uiRepresentation", 0) + 1);
            this.uiRepresentation(new BlockUIRepresentationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BlockResponseProjection.BlockUIRepresentationResponseProjection.uiRepresentation", 0)));
        }
        this.typename();
        return this;
    }

    public BlockResponseProjection id() {
        return id(null);
    }

    public BlockResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public BlockResponseProjection cid() {
        return cid(null);
    }

    public BlockResponseProjection cid(String alias) {
        fields.add(new GraphQLResponseField("cid").alias(alias));
        return this;
    }

    public BlockResponseProjection nextBlocks(BlockResponseProjection subProjection) {
        return nextBlocks(null, subProjection);
    }

    public BlockResponseProjection nextBlocks(String alias, BlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nextBlocks").alias(alias).projection(subProjection));
        return this;
    }

    public BlockResponseProjection prevBlocks(BlockResponseProjection subProjection) {
        return prevBlocks(null, subProjection);
    }

    public BlockResponseProjection prevBlocks(String alias, BlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("prevBlocks").alias(alias).projection(subProjection));
        return this;
    }

    public BlockResponseProjection details(BlockDetailsResponseProjection subProjection) {
        return details(null, subProjection);
    }

    public BlockResponseProjection details(String alias, BlockDetailsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("details").alias(alias).projection(subProjection));
        return this;
    }

    public BlockResponseProjection inputParamDefinitions(VariableDefinitionResponseProjection subProjection) {
        return inputParamDefinitions(null, subProjection);
    }

    public BlockResponseProjection inputParamDefinitions(String alias, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("inputParamDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public BlockResponseProjection outputParamDefinitions(VariableDefinitionResponseProjection subProjection) {
        return outputParamDefinitions(null, subProjection);
    }

    public BlockResponseProjection outputParamDefinitions(String alias, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("outputParamDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public BlockResponseProjection uiRepresentation(BlockUIRepresentationResponseProjection subProjection) {
        return uiRepresentation(null, subProjection);
    }

    public BlockResponseProjection uiRepresentation(String alias, BlockUIRepresentationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("uiRepresentation").alias(alias).projection(subProjection));
        return this;
    }

    public BlockResponseProjection typename() {
        return typename(null);
    }

    public BlockResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
