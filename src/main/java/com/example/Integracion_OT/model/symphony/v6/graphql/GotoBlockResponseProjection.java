package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for GotoBlock
 */

public class GotoBlockResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public GotoBlockResponseProjection() {
    }

    public GotoBlockResponseProjection all$() {
        return all$(3);
    }

    public GotoBlockResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("GotoBlockResponseProjection.BlockResponseProjection.target", 0) <= maxDepth) {
            projectionDepthOnFields.put("GotoBlockResponseProjection.BlockResponseProjection.target", projectionDepthOnFields.getOrDefault("GotoBlockResponseProjection.BlockResponseProjection.target", 0) + 1);
            this.target(new BlockResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GotoBlockResponseProjection.BlockResponseProjection.target", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GotoBlockResponseProjection.EntryPointResponseProjection.entryPoint", 0) <= maxDepth) {
            projectionDepthOnFields.put("GotoBlockResponseProjection.EntryPointResponseProjection.entryPoint", projectionDepthOnFields.getOrDefault("GotoBlockResponseProjection.EntryPointResponseProjection.entryPoint", 0) + 1);
            this.entryPoint(new EntryPointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GotoBlockResponseProjection.EntryPointResponseProjection.entryPoint", 0)));
        }
        this.typename();
        return this;
    }

    public GotoBlockResponseProjection target(BlockResponseProjection subProjection) {
        return target(null, subProjection);
    }

    public GotoBlockResponseProjection target(String alias, BlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("target").alias(alias).projection(subProjection));
        return this;
    }

    public GotoBlockResponseProjection entryPoint(EntryPointResponseProjection subProjection) {
        return entryPoint(null, subProjection);
    }

    public GotoBlockResponseProjection entryPoint(String alias, EntryPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("entryPoint").alias(alias).projection(subProjection));
        return this;
    }

    public GotoBlockResponseProjection typename() {
        return typename(null);
    }

    public GotoBlockResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
