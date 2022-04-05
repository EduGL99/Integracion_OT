package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for CounterFamilyEdge
 */

public class CounterFamilyEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CounterFamilyEdgeResponseProjection() {
    }

    public CounterFamilyEdgeResponseProjection all$() {
        return all$(3);
    }

    public CounterFamilyEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CounterFamilyEdgeResponseProjection.CounterFamilyResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CounterFamilyEdgeResponseProjection.CounterFamilyResponseProjection.node", projectionDepthOnFields.getOrDefault("CounterFamilyEdgeResponseProjection.CounterFamilyResponseProjection.node", 0) + 1);
            this.node(new CounterFamilyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CounterFamilyEdgeResponseProjection.CounterFamilyResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public CounterFamilyEdgeResponseProjection node(CounterFamilyResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public CounterFamilyEdgeResponseProjection node(String alias, CounterFamilyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public CounterFamilyEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public CounterFamilyEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public CounterFamilyEdgeResponseProjection typename() {
        return typename(null);
    }

    public CounterFamilyEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
