package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for LinkConnection
 */

public class LinkConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public LinkConnectionResponseProjection() {
    }

    public LinkConnectionResponseProjection all$() {
        return all$(3);
    }

    public LinkConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("LinkConnectionResponseProjection.LinkEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("LinkConnectionResponseProjection.LinkEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("LinkConnectionResponseProjection.LinkEdgeResponseProjection.edges", 0) + 1);
            this.edges(new LinkEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LinkConnectionResponseProjection.LinkEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LinkConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("LinkConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("LinkConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LinkConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public LinkConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public LinkConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public LinkConnectionResponseProjection edges(LinkEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public LinkConnectionResponseProjection edges(String alias, LinkEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public LinkConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public LinkConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public LinkConnectionResponseProjection typename() {
        return typename(null);
    }

    public LinkConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
