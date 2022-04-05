package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for AlarmFilterEdge
 */

public class AlarmFilterEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public AlarmFilterEdgeResponseProjection() {
    }

    public AlarmFilterEdgeResponseProjection all$() {
        return all$(3);
    }

    public AlarmFilterEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("AlarmFilterEdgeResponseProjection.AlarmFilterResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("AlarmFilterEdgeResponseProjection.AlarmFilterResponseProjection.node", projectionDepthOnFields.getOrDefault("AlarmFilterEdgeResponseProjection.AlarmFilterResponseProjection.node", 0) + 1);
            this.node(new AlarmFilterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AlarmFilterEdgeResponseProjection.AlarmFilterResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public AlarmFilterEdgeResponseProjection node(AlarmFilterResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public AlarmFilterEdgeResponseProjection node(String alias, AlarmFilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public AlarmFilterEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public AlarmFilterEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public AlarmFilterEdgeResponseProjection typename() {
        return typename(null);
    }

    public AlarmFilterEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
