package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KqiSourceConnection
 */

public class KqiSourceConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KqiSourceConnectionResponseProjection() {
    }

    public KqiSourceConnectionResponseProjection all$() {
        return all$(3);
    }

    public KqiSourceConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("KqiSourceConnectionResponseProjection.KqiSourceEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiSourceConnectionResponseProjection.KqiSourceEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("KqiSourceConnectionResponseProjection.KqiSourceEdgeResponseProjection.edges", 0) + 1);
            this.edges(new KqiSourceEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiSourceConnectionResponseProjection.KqiSourceEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("KqiSourceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiSourceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("KqiSourceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiSourceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public KqiSourceConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public KqiSourceConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public KqiSourceConnectionResponseProjection edges(KqiSourceEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public KqiSourceConnectionResponseProjection edges(String alias, KqiSourceEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public KqiSourceConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public KqiSourceConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public KqiSourceConnectionResponseProjection typename() {
        return typename(null);
    }

    public KqiSourceConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
