package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KpiEdge
 */

public class KpiEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KpiEdgeResponseProjection() {
    }

    public KpiEdgeResponseProjection all$() {
        return all$(3);
    }

    public KpiEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("KpiEdgeResponseProjection.KpiResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("KpiEdgeResponseProjection.KpiResponseProjection.node", projectionDepthOnFields.getOrDefault("KpiEdgeResponseProjection.KpiResponseProjection.node", 0) + 1);
            this.node(new KpiResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KpiEdgeResponseProjection.KpiResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public KpiEdgeResponseProjection node(KpiResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public KpiEdgeResponseProjection node(String alias, KpiResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public KpiEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public KpiEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public KpiEdgeResponseProjection typename() {
        return typename(null);
    }

    public KpiEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
