package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KpiCategoryEdge
 */

public class KpiCategoryEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KpiCategoryEdgeResponseProjection() {
    }

    public KpiCategoryEdgeResponseProjection all$() {
        return all$(3);
    }

    public KpiCategoryEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("KpiCategoryEdgeResponseProjection.KpiCategoryResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("KpiCategoryEdgeResponseProjection.KpiCategoryResponseProjection.node", projectionDepthOnFields.getOrDefault("KpiCategoryEdgeResponseProjection.KpiCategoryResponseProjection.node", 0) + 1);
            this.node(new KpiCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KpiCategoryEdgeResponseProjection.KpiCategoryResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public KpiCategoryEdgeResponseProjection node(KpiCategoryResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public KpiCategoryEdgeResponseProjection node(String alias, KpiCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public KpiCategoryEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public KpiCategoryEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public KpiCategoryEdgeResponseProjection typename() {
        return typename(null);
    }

    public KpiCategoryEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
