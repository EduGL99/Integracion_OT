package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ServiceConnection
 */

public class ServiceConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ServiceConnectionResponseProjection() {
    }

    public ServiceConnectionResponseProjection all$() {
        return all$(3);
    }

    public ServiceConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("ServiceConnectionResponseProjection.ServiceEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceConnectionResponseProjection.ServiceEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ServiceConnectionResponseProjection.ServiceEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ServiceEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceConnectionResponseProjection.ServiceEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ServiceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public ServiceConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public ServiceConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ServiceConnectionResponseProjection edges(ServiceEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ServiceConnectionResponseProjection edges(String alias, ServiceEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ServiceConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceConnectionResponseProjection typename() {
        return typename(null);
    }

    public ServiceConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
