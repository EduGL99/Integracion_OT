package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for PermissionsPolicyConnection
 */

public class PermissionsPolicyConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PermissionsPolicyConnectionResponseProjection() {
    }

    public PermissionsPolicyConnectionResponseProjection all$() {
        return all$(3);
    }

    public PermissionsPolicyConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("PermissionsPolicyConnectionResponseProjection.PermissionsPolicyEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PermissionsPolicyConnectionResponseProjection.PermissionsPolicyEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PermissionsPolicyConnectionResponseProjection.PermissionsPolicyEdgeResponseProjection.edges", 0) + 1);
            this.edges(new PermissionsPolicyEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PermissionsPolicyConnectionResponseProjection.PermissionsPolicyEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PermissionsPolicyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PermissionsPolicyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PermissionsPolicyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PermissionsPolicyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public PermissionsPolicyConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public PermissionsPolicyConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public PermissionsPolicyConnectionResponseProjection edges(PermissionsPolicyEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public PermissionsPolicyConnectionResponseProjection edges(String alias, PermissionsPolicyEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public PermissionsPolicyConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public PermissionsPolicyConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public PermissionsPolicyConnectionResponseProjection typename() {
        return typename(null);
    }

    public PermissionsPolicyConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
