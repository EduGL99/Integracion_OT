package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for CustomerConnection
 */

public class CustomerConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CustomerConnectionResponseProjection() {
    }

    public CustomerConnectionResponseProjection all$() {
        return all$(3);
    }

    public CustomerConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("CustomerConnectionResponseProjection.CustomerEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CustomerConnectionResponseProjection.CustomerEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CustomerConnectionResponseProjection.CustomerEdgeResponseProjection.edges", 0) + 1);
            this.edges(new CustomerEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CustomerConnectionResponseProjection.CustomerEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CustomerConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CustomerConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CustomerConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CustomerConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public CustomerConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public CustomerConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public CustomerConnectionResponseProjection edges(CustomerEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public CustomerConnectionResponseProjection edges(String alias, CustomerEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public CustomerConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public CustomerConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public CustomerConnectionResponseProjection typename() {
        return typename(null);
    }

    public CustomerConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
