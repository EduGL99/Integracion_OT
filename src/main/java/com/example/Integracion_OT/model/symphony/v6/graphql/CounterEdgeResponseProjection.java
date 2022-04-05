package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for CounterEdge
 */

public class CounterEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CounterEdgeResponseProjection() {
    }

    public CounterEdgeResponseProjection all$() {
        return all$(3);
    }

    public CounterEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CounterEdgeResponseProjection.CounterResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CounterEdgeResponseProjection.CounterResponseProjection.node", projectionDepthOnFields.getOrDefault("CounterEdgeResponseProjection.CounterResponseProjection.node", 0) + 1);
            this.node(new CounterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CounterEdgeResponseProjection.CounterResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public CounterEdgeResponseProjection node(CounterResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public CounterEdgeResponseProjection node(String alias, CounterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public CounterEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public CounterEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public CounterEdgeResponseProjection typename() {
        return typename(null);
    }

    public CounterEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
