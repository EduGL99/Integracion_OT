package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for DomainConnection
 */

public class DomainConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public DomainConnectionResponseProjection() {
    }

    public DomainConnectionResponseProjection all$() {
        return all$(3);
    }

    public DomainConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("DomainConnectionResponseProjection.DomainEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("DomainConnectionResponseProjection.DomainEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("DomainConnectionResponseProjection.DomainEdgeResponseProjection.edges", 0) + 1);
            this.edges(new DomainEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DomainConnectionResponseProjection.DomainEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DomainConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("DomainConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("DomainConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DomainConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public DomainConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public DomainConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public DomainConnectionResponseProjection edges(DomainEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public DomainConnectionResponseProjection edges(String alias, DomainEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public DomainConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public DomainConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public DomainConnectionResponseProjection typename() {
        return typename(null);
    }

    public DomainConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
