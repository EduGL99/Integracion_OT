package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ExitPoint
 */

public class ExitPointResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ExitPointResponseProjection() {
    }

    public ExitPointResponseProjection all$() {
        return all$(3);
    }

    public ExitPointResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("ExitPointResponseProjection.BlockResponseProjection.parentBlock", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExitPointResponseProjection.BlockResponseProjection.parentBlock", projectionDepthOnFields.getOrDefault("ExitPointResponseProjection.BlockResponseProjection.parentBlock", 0) + 1);
            this.parentBlock(new BlockResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExitPointResponseProjection.BlockResponseProjection.parentBlock", 0)));
        }
        this.cid();
        if (projectionDepthOnFields.getOrDefault("ExitPointResponseProjection.EntryPointResponseProjection.nextEntryPoints", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExitPointResponseProjection.EntryPointResponseProjection.nextEntryPoints", projectionDepthOnFields.getOrDefault("ExitPointResponseProjection.EntryPointResponseProjection.nextEntryPoints", 0) + 1);
            this.nextEntryPoints(new EntryPointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExitPointResponseProjection.EntryPointResponseProjection.nextEntryPoints", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ExitPointResponseProjection.VariableExpressionResponseProjection.condition", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExitPointResponseProjection.VariableExpressionResponseProjection.condition", projectionDepthOnFields.getOrDefault("ExitPointResponseProjection.VariableExpressionResponseProjection.condition", 0) + 1);
            this.condition(new VariableExpressionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExitPointResponseProjection.VariableExpressionResponseProjection.condition", 0)));
        }
        this.typename();
        return this;
    }

    public ExitPointResponseProjection id() {
        return id(null);
    }

    public ExitPointResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ExitPointResponseProjection parentBlock(BlockResponseProjection subProjection) {
        return parentBlock(null, subProjection);
    }

    public ExitPointResponseProjection parentBlock(String alias, BlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parentBlock").alias(alias).projection(subProjection));
        return this;
    }

    public ExitPointResponseProjection cid() {
        return cid(null);
    }

    public ExitPointResponseProjection cid(String alias) {
        fields.add(new GraphQLResponseField("cid").alias(alias));
        return this;
    }

    public ExitPointResponseProjection nextEntryPoints(EntryPointResponseProjection subProjection) {
        return nextEntryPoints(null, subProjection);
    }

    public ExitPointResponseProjection nextEntryPoints(String alias, EntryPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nextEntryPoints").alias(alias).projection(subProjection));
        return this;
    }

    public ExitPointResponseProjection condition(VariableExpressionResponseProjection subProjection) {
        return condition(null, subProjection);
    }

    public ExitPointResponseProjection condition(String alias, VariableExpressionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("condition").alias(alias).projection(subProjection));
        return this;
    }

    public ExitPointResponseProjection typename() {
        return typename(null);
    }

    public ExitPointResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
