package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KpiCategoryConnection
 */

public class KpiCategoryConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KpiCategoryConnectionResponseProjection() {
    }

    public KpiCategoryConnectionResponseProjection all$() {
        return all$(3);
    }

    public KpiCategoryConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("KpiCategoryConnectionResponseProjection.KpiCategoryEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("KpiCategoryConnectionResponseProjection.KpiCategoryEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("KpiCategoryConnectionResponseProjection.KpiCategoryEdgeResponseProjection.edges", 0) + 1);
            this.edges(new KpiCategoryEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KpiCategoryConnectionResponseProjection.KpiCategoryEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("KpiCategoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("KpiCategoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("KpiCategoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KpiCategoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public KpiCategoryConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public KpiCategoryConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public KpiCategoryConnectionResponseProjection edges(KpiCategoryEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public KpiCategoryConnectionResponseProjection edges(String alias, KpiCategoryEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public KpiCategoryConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public KpiCategoryConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public KpiCategoryConnectionResponseProjection typename() {
        return typename(null);
    }

    public KpiCategoryConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
