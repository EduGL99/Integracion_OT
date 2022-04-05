package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for TechEdge
 */

public class TechEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public TechEdgeResponseProjection() {
    }

    public TechEdgeResponseProjection all$() {
        return all$(3);
    }

    public TechEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("TechEdgeResponseProjection.TechResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("TechEdgeResponseProjection.TechResponseProjection.node", projectionDepthOnFields.getOrDefault("TechEdgeResponseProjection.TechResponseProjection.node", 0) + 1);
            this.node(new TechResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TechEdgeResponseProjection.TechResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public TechEdgeResponseProjection node(TechResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public TechEdgeResponseProjection node(String alias, TechResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public TechEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public TechEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public TechEdgeResponseProjection typename() {
        return typename(null);
    }

    public TechEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
