package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ThresholdConnection
 */

public class ThresholdConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ThresholdConnectionResponseProjection() {
    }

    public ThresholdConnectionResponseProjection all$() {
        return all$(3);
    }

    public ThresholdConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("ThresholdConnectionResponseProjection.ThresholdEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ThresholdConnectionResponseProjection.ThresholdEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ThresholdConnectionResponseProjection.ThresholdEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ThresholdEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ThresholdConnectionResponseProjection.ThresholdEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ThresholdConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ThresholdConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ThresholdConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ThresholdConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public ThresholdConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public ThresholdConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ThresholdConnectionResponseProjection edges(ThresholdEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ThresholdConnectionResponseProjection edges(String alias, ThresholdEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ThresholdConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ThresholdConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ThresholdConnectionResponseProjection typename() {
        return typename(null);
    }

    public ThresholdConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
