package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for CounterConnection
 */

public class CounterConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CounterConnectionResponseProjection() {
    }

    public CounterConnectionResponseProjection all$() {
        return all$(3);
    }

    public CounterConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("CounterConnectionResponseProjection.CounterEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CounterConnectionResponseProjection.CounterEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CounterConnectionResponseProjection.CounterEdgeResponseProjection.edges", 0) + 1);
            this.edges(new CounterEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CounterConnectionResponseProjection.CounterEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CounterConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CounterConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CounterConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CounterConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public CounterConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public CounterConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public CounterConnectionResponseProjection edges(CounterEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public CounterConnectionResponseProjection edges(String alias, CounterEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public CounterConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public CounterConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public CounterConnectionResponseProjection typename() {
        return typename(null);
    }

    public CounterConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
