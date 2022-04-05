package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for PermissionsPolicyEdge
 */

public class PermissionsPolicyEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PermissionsPolicyEdgeResponseProjection() {
    }

    public PermissionsPolicyEdgeResponseProjection all$() {
        return all$(3);
    }

    public PermissionsPolicyEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PermissionsPolicyEdgeResponseProjection.PermissionsPolicyResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PermissionsPolicyEdgeResponseProjection.PermissionsPolicyResponseProjection.node", projectionDepthOnFields.getOrDefault("PermissionsPolicyEdgeResponseProjection.PermissionsPolicyResponseProjection.node", 0) + 1);
            this.node(new PermissionsPolicyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PermissionsPolicyEdgeResponseProjection.PermissionsPolicyResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public PermissionsPolicyEdgeResponseProjection node(PermissionsPolicyResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public PermissionsPolicyEdgeResponseProjection node(String alias, PermissionsPolicyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public PermissionsPolicyEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public PermissionsPolicyEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public PermissionsPolicyEdgeResponseProjection typename() {
        return typename(null);
    }

    public PermissionsPolicyEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
