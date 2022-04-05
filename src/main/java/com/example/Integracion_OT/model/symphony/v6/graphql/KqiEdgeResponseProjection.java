package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KqiEdge
 */

public class KqiEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KqiEdgeResponseProjection() {
    }

    public KqiEdgeResponseProjection all$() {
        return all$(3);
    }

    public KqiEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("KqiEdgeResponseProjection.KqiResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiEdgeResponseProjection.KqiResponseProjection.node", projectionDepthOnFields.getOrDefault("KqiEdgeResponseProjection.KqiResponseProjection.node", 0) + 1);
            this.node(new KqiResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiEdgeResponseProjection.KqiResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public KqiEdgeResponseProjection node(KqiResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public KqiEdgeResponseProjection node(String alias, KqiResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public KqiEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public KqiEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public KqiEdgeResponseProjection typename() {
        return typename(null);
    }

    public KqiEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
