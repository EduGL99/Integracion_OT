package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for AlarmStatusEdge
 */

public class AlarmStatusEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public AlarmStatusEdgeResponseProjection() {
    }

    public AlarmStatusEdgeResponseProjection all$() {
        return all$(3);
    }

    public AlarmStatusEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("AlarmStatusEdgeResponseProjection.AlarmStatusResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("AlarmStatusEdgeResponseProjection.AlarmStatusResponseProjection.node", projectionDepthOnFields.getOrDefault("AlarmStatusEdgeResponseProjection.AlarmStatusResponseProjection.node", 0) + 1);
            this.node(new AlarmStatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AlarmStatusEdgeResponseProjection.AlarmStatusResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public AlarmStatusEdgeResponseProjection node(AlarmStatusResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public AlarmStatusEdgeResponseProjection node(String alias, AlarmStatusResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public AlarmStatusEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public AlarmStatusEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public AlarmStatusEdgeResponseProjection typename() {
        return typename(null);
    }

    public AlarmStatusEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
