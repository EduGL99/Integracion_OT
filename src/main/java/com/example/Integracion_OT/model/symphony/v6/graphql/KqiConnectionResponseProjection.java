package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KqiConnection
 */

public class KqiConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KqiConnectionResponseProjection() {
    }

    public KqiConnectionResponseProjection all$() {
        return all$(3);
    }

    public KqiConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("KqiConnectionResponseProjection.KqiEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiConnectionResponseProjection.KqiEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("KqiConnectionResponseProjection.KqiEdgeResponseProjection.edges", 0) + 1);
            this.edges(new KqiEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiConnectionResponseProjection.KqiEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("KqiConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("KqiConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public KqiConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public KqiConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public KqiConnectionResponseProjection edges(KqiEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public KqiConnectionResponseProjection edges(String alias, KqiEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public KqiConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public KqiConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public KqiConnectionResponseProjection typename() {
        return typename(null);
    }

    public KqiConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
