package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for PermissionsPolicySearchResult
 */

public class PermissionsPolicySearchResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PermissionsPolicySearchResultResponseProjection() {
    }

    public PermissionsPolicySearchResultResponseProjection all$() {
        return all$(3);
    }

    public PermissionsPolicySearchResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PermissionsPolicySearchResultResponseProjection.PermissionsPolicyResponseProjection.permissionsPolicies", 0) <= maxDepth) {
            projectionDepthOnFields.put("PermissionsPolicySearchResultResponseProjection.PermissionsPolicyResponseProjection.permissionsPolicies", projectionDepthOnFields.getOrDefault("PermissionsPolicySearchResultResponseProjection.PermissionsPolicyResponseProjection.permissionsPolicies", 0) + 1);
            this.permissionsPolicies(new PermissionsPolicyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PermissionsPolicySearchResultResponseProjection.PermissionsPolicyResponseProjection.permissionsPolicies", 0)));
        }
        this.count();
        this.typename();
        return this;
    }

    public PermissionsPolicySearchResultResponseProjection permissionsPolicies(PermissionsPolicyResponseProjection subProjection) {
        return permissionsPolicies(null, subProjection);
    }

    public PermissionsPolicySearchResultResponseProjection permissionsPolicies(String alias, PermissionsPolicyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("permissionsPolicies").alias(alias).projection(subProjection));
        return this;
    }

    public PermissionsPolicySearchResultResponseProjection count() {
        return count(null);
    }

    public PermissionsPolicySearchResultResponseProjection count(String alias) {
        fields.add(new GraphQLResponseField("count").alias(alias));
        return this;
    }

    public PermissionsPolicySearchResultResponseProjection typename() {
        return typename(null);
    }

    public PermissionsPolicySearchResultResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
