package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KqiTargetConnection
 */

public class KqiTargetConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KqiTargetConnectionResponseProjection() {
    }

    public KqiTargetConnectionResponseProjection all$() {
        return all$(3);
    }

    public KqiTargetConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("KqiTargetConnectionResponseProjection.KqiTargetEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiTargetConnectionResponseProjection.KqiTargetEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("KqiTargetConnectionResponseProjection.KqiTargetEdgeResponseProjection.edges", 0) + 1);
            this.edges(new KqiTargetEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiTargetConnectionResponseProjection.KqiTargetEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("KqiTargetConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiTargetConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("KqiTargetConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiTargetConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public KqiTargetConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public KqiTargetConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public KqiTargetConnectionResponseProjection edges(KqiTargetEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public KqiTargetConnectionResponseProjection edges(String alias, KqiTargetEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public KqiTargetConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public KqiTargetConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public KqiTargetConnectionResponseProjection typename() {
        return typename(null);
    }

    public KqiTargetConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
