package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for CounterFamilyConnection
 */

public class CounterFamilyConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CounterFamilyConnectionResponseProjection() {
    }

    public CounterFamilyConnectionResponseProjection all$() {
        return all$(3);
    }

    public CounterFamilyConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("CounterFamilyConnectionResponseProjection.CounterFamilyEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CounterFamilyConnectionResponseProjection.CounterFamilyEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CounterFamilyConnectionResponseProjection.CounterFamilyEdgeResponseProjection.edges", 0) + 1);
            this.edges(new CounterFamilyEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CounterFamilyConnectionResponseProjection.CounterFamilyEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CounterFamilyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CounterFamilyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CounterFamilyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CounterFamilyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public CounterFamilyConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public CounterFamilyConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public CounterFamilyConnectionResponseProjection edges(CounterFamilyEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public CounterFamilyConnectionResponseProjection edges(String alias, CounterFamilyEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public CounterFamilyConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public CounterFamilyConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public CounterFamilyConnectionResponseProjection typename() {
        return typename(null);
    }

    public CounterFamilyConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
