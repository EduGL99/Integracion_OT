package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ComparatorConnection
 */

public class ComparatorConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ComparatorConnectionResponseProjection() {
    }

    public ComparatorConnectionResponseProjection all$() {
        return all$(3);
    }

    public ComparatorConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("ComparatorConnectionResponseProjection.ComparatorEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ComparatorConnectionResponseProjection.ComparatorEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ComparatorConnectionResponseProjection.ComparatorEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ComparatorEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ComparatorConnectionResponseProjection.ComparatorEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ComparatorConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ComparatorConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ComparatorConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ComparatorConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public ComparatorConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public ComparatorConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ComparatorConnectionResponseProjection edges(ComparatorEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ComparatorConnectionResponseProjection edges(String alias, ComparatorEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ComparatorConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ComparatorConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ComparatorConnectionResponseProjection typename() {
        return typename(null);
    }

    public ComparatorConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
