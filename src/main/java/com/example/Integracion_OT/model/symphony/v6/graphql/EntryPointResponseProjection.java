package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EntryPoint
 */

public class EntryPointResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EntryPointResponseProjection() {
    }

    public EntryPointResponseProjection all$() {
        return all$(3);
    }

    public EntryPointResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("EntryPointResponseProjection.BlockResponseProjection.parentBlock", 0) <= maxDepth) {
            projectionDepthOnFields.put("EntryPointResponseProjection.BlockResponseProjection.parentBlock", projectionDepthOnFields.getOrDefault("EntryPointResponseProjection.BlockResponseProjection.parentBlock", 0) + 1);
            this.parentBlock(new BlockResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EntryPointResponseProjection.BlockResponseProjection.parentBlock", 0)));
        }
        this.cid();
        if (projectionDepthOnFields.getOrDefault("EntryPointResponseProjection.ExitPointResponseProjection.prevExitPoints", 0) <= maxDepth) {
            projectionDepthOnFields.put("EntryPointResponseProjection.ExitPointResponseProjection.prevExitPoints", projectionDepthOnFields.getOrDefault("EntryPointResponseProjection.ExitPointResponseProjection.prevExitPoints", 0) + 1);
            this.prevExitPoints(new ExitPointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EntryPointResponseProjection.ExitPointResponseProjection.prevExitPoints", 0)));
        }
        this.typename();
        return this;
    }

    public EntryPointResponseProjection id() {
        return id(null);
    }

    public EntryPointResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EntryPointResponseProjection parentBlock(BlockResponseProjection subProjection) {
        return parentBlock(null, subProjection);
    }

    public EntryPointResponseProjection parentBlock(String alias, BlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parentBlock").alias(alias).projection(subProjection));
        return this;
    }

    public EntryPointResponseProjection cid() {
        return cid(null);
    }

    public EntryPointResponseProjection cid(String alias) {
        fields.add(new GraphQLResponseField("cid").alias(alias));
        return this;
    }

    public EntryPointResponseProjection prevExitPoints(ExitPointResponseProjection subProjection) {
        return prevExitPoints(null, subProjection);
    }

    public EntryPointResponseProjection prevExitPoints(String alias, ExitPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("prevExitPoints").alias(alias).projection(subProjection));
        return this;
    }

    public EntryPointResponseProjection typename() {
        return typename(null);
    }

    public EntryPointResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
