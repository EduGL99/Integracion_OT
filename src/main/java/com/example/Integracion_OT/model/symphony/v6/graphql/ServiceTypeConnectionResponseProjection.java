package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ServiceTypeConnection
 */

public class ServiceTypeConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ServiceTypeConnectionResponseProjection() {
    }

    public ServiceTypeConnectionResponseProjection all$() {
        return all$(3);
    }

    public ServiceTypeConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("ServiceTypeConnectionResponseProjection.ServiceTypeEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceTypeConnectionResponseProjection.ServiceTypeEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ServiceTypeConnectionResponseProjection.ServiceTypeEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ServiceTypeEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceTypeConnectionResponseProjection.ServiceTypeEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ServiceTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public ServiceTypeConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public ServiceTypeConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ServiceTypeConnectionResponseProjection edges(ServiceTypeEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ServiceTypeConnectionResponseProjection edges(String alias, ServiceTypeEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceTypeConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ServiceTypeConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceTypeConnectionResponseProjection typename() {
        return typename(null);
    }

    public ServiceTypeConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
