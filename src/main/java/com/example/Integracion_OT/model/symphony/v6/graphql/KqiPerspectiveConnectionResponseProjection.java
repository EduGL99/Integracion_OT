package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KqiPerspectiveConnection
 */

public class KqiPerspectiveConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KqiPerspectiveConnectionResponseProjection() {
    }

    public KqiPerspectiveConnectionResponseProjection all$() {
        return all$(3);
    }

    public KqiPerspectiveConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("KqiPerspectiveConnectionResponseProjection.KqiPerspectiveEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiPerspectiveConnectionResponseProjection.KqiPerspectiveEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("KqiPerspectiveConnectionResponseProjection.KqiPerspectiveEdgeResponseProjection.edges", 0) + 1);
            this.edges(new KqiPerspectiveEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiPerspectiveConnectionResponseProjection.KqiPerspectiveEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("KqiPerspectiveConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiPerspectiveConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("KqiPerspectiveConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiPerspectiveConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public KqiPerspectiveConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public KqiPerspectiveConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public KqiPerspectiveConnectionResponseProjection edges(KqiPerspectiveEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public KqiPerspectiveConnectionResponseProjection edges(String alias, KqiPerspectiveEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public KqiPerspectiveConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public KqiPerspectiveConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public KqiPerspectiveConnectionResponseProjection typename() {
        return typename(null);
    }

    public KqiPerspectiveConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
