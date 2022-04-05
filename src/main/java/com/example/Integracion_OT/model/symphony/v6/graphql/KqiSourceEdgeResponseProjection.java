package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KqiSourceEdge
 */

public class KqiSourceEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KqiSourceEdgeResponseProjection() {
    }

    public KqiSourceEdgeResponseProjection all$() {
        return all$(3);
    }

    public KqiSourceEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("KqiSourceEdgeResponseProjection.KqiSourceResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiSourceEdgeResponseProjection.KqiSourceResponseProjection.node", projectionDepthOnFields.getOrDefault("KqiSourceEdgeResponseProjection.KqiSourceResponseProjection.node", 0) + 1);
            this.node(new KqiSourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiSourceEdgeResponseProjection.KqiSourceResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public KqiSourceEdgeResponseProjection node(KqiSourceResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public KqiSourceEdgeResponseProjection node(String alias, KqiSourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public KqiSourceEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public KqiSourceEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public KqiSourceEdgeResponseProjection typename() {
        return typename(null);
    }

    public KqiSourceEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
