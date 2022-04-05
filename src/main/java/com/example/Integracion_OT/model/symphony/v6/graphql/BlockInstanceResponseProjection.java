package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for BlockInstance
 */

public class BlockInstanceResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public BlockInstanceResponseProjection() {
    }

    public BlockInstanceResponseProjection all$() {
        return all$(3);
    }

    public BlockInstanceResponseProjection all$(int maxDepth) {
        this.id();
        this.status();
        if (projectionDepthOnFields.getOrDefault("BlockInstanceResponseProjection.VariableValueResponseProjection.inputs", 0) <= maxDepth) {
            projectionDepthOnFields.put("BlockInstanceResponseProjection.VariableValueResponseProjection.inputs", projectionDepthOnFields.getOrDefault("BlockInstanceResponseProjection.VariableValueResponseProjection.inputs", 0) + 1);
            this.inputs(new VariableValueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BlockInstanceResponseProjection.VariableValueResponseProjection.inputs", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("BlockInstanceResponseProjection.VariableValueResponseProjection.outputs", 0) <= maxDepth) {
            projectionDepthOnFields.put("BlockInstanceResponseProjection.VariableValueResponseProjection.outputs", projectionDepthOnFields.getOrDefault("BlockInstanceResponseProjection.VariableValueResponseProjection.outputs", 0) + 1);
            this.outputs(new VariableValueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BlockInstanceResponseProjection.VariableValueResponseProjection.outputs", 0)));
        }
        this.failure_reason();
        if (projectionDepthOnFields.getOrDefault("BlockInstanceResponseProjection.BlockResponseProjection.block", 0) <= maxDepth) {
            projectionDepthOnFields.put("BlockInstanceResponseProjection.BlockResponseProjection.block", projectionDepthOnFields.getOrDefault("BlockInstanceResponseProjection.BlockResponseProjection.block", 0) + 1);
            this.block(new BlockResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BlockInstanceResponseProjection.BlockResponseProjection.block", 0)));
        }
        this.startDate();
        this.endDate();
        this.typename();
        return this;
    }

    public BlockInstanceResponseProjection id() {
        return id(null);
    }

    public BlockInstanceResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public BlockInstanceResponseProjection status() {
        return status(null);
    }

    public BlockInstanceResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public BlockInstanceResponseProjection inputs(VariableValueResponseProjection subProjection) {
        return inputs(null, subProjection);
    }

    public BlockInstanceResponseProjection inputs(String alias, VariableValueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("inputs").alias(alias).projection(subProjection));
        return this;
    }

    public BlockInstanceResponseProjection outputs(VariableValueResponseProjection subProjection) {
        return outputs(null, subProjection);
    }

    public BlockInstanceResponseProjection outputs(String alias, VariableValueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("outputs").alias(alias).projection(subProjection));
        return this;
    }

    public BlockInstanceResponseProjection failure_reason() {
        return failure_reason(null);
    }

    public BlockInstanceResponseProjection failure_reason(String alias) {
        fields.add(new GraphQLResponseField("failure_reason").alias(alias));
        return this;
    }

    public BlockInstanceResponseProjection block(BlockResponseProjection subProjection) {
        return block(null, subProjection);
    }

    public BlockInstanceResponseProjection block(String alias, BlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("block").alias(alias).projection(subProjection));
        return this;
    }

    public BlockInstanceResponseProjection startDate() {
        return startDate(null);
    }

    public BlockInstanceResponseProjection startDate(String alias) {
        fields.add(new GraphQLResponseField("startDate").alias(alias));
        return this;
    }

    public BlockInstanceResponseProjection endDate() {
        return endDate(null);
    }

    public BlockInstanceResponseProjection endDate(String alias) {
        fields.add(new GraphQLResponseField("endDate").alias(alias));
        return this;
    }

    public BlockInstanceResponseProjection typename() {
        return typename(null);
    }

    public BlockInstanceResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
