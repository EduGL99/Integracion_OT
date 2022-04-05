package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ComparatorEdge
 */

public class ComparatorEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ComparatorEdgeResponseProjection() {
    }

    public ComparatorEdgeResponseProjection all$() {
        return all$(3);
    }

    public ComparatorEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ComparatorEdgeResponseProjection.ComparatorResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ComparatorEdgeResponseProjection.ComparatorResponseProjection.node", projectionDepthOnFields.getOrDefault("ComparatorEdgeResponseProjection.ComparatorResponseProjection.node", 0) + 1);
            this.node(new ComparatorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ComparatorEdgeResponseProjection.ComparatorResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public ComparatorEdgeResponseProjection node(ComparatorResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ComparatorEdgeResponseProjection node(String alias, ComparatorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ComparatorEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ComparatorEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ComparatorEdgeResponseProjection typename() {
        return typename(null);
    }

    public ComparatorEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
