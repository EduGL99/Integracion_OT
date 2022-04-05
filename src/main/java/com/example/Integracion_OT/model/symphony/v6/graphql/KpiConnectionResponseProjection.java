package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KpiConnection
 */

public class KpiConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KpiConnectionResponseProjection() {
    }

    public KpiConnectionResponseProjection all$() {
        return all$(3);
    }

    public KpiConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("KpiConnectionResponseProjection.KpiEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("KpiConnectionResponseProjection.KpiEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("KpiConnectionResponseProjection.KpiEdgeResponseProjection.edges", 0) + 1);
            this.edges(new KpiEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KpiConnectionResponseProjection.KpiEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("KpiConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("KpiConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("KpiConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KpiConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public KpiConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public KpiConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public KpiConnectionResponseProjection edges(KpiEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public KpiConnectionResponseProjection edges(String alias, KpiEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public KpiConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public KpiConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public KpiConnectionResponseProjection typename() {
        return typename(null);
    }

    public KpiConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
