package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ThresholdEdge
 */

public class ThresholdEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ThresholdEdgeResponseProjection() {
    }

    public ThresholdEdgeResponseProjection all$() {
        return all$(3);
    }

    public ThresholdEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ThresholdEdgeResponseProjection.ThresholdResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ThresholdEdgeResponseProjection.ThresholdResponseProjection.node", projectionDepthOnFields.getOrDefault("ThresholdEdgeResponseProjection.ThresholdResponseProjection.node", 0) + 1);
            this.node(new ThresholdResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ThresholdEdgeResponseProjection.ThresholdResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public ThresholdEdgeResponseProjection node(ThresholdResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ThresholdEdgeResponseProjection node(String alias, ThresholdResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ThresholdEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ThresholdEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ThresholdEdgeResponseProjection typename() {
        return typename(null);
    }

    public ThresholdEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
