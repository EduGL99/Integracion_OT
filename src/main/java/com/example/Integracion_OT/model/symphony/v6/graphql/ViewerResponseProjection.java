package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Viewer
 */

public class ViewerResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ViewerResponseProjection() {
    }

    public ViewerResponseProjection all$() {
        return all$(3);
    }

    public ViewerResponseProjection all$(int maxDepth) {
        this.tenant();
        if (projectionDepthOnFields.getOrDefault("ViewerResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("ViewerResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("ViewerResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ViewerResponseProjection.UserResponseProjection.user", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ViewerResponseProjection.PermissionSettingsResponseProjection.permissions", 0) <= maxDepth) {
            projectionDepthOnFields.put("ViewerResponseProjection.PermissionSettingsResponseProjection.permissions", projectionDepthOnFields.getOrDefault("ViewerResponseProjection.PermissionSettingsResponseProjection.permissions", 0) + 1);
            this.permissions(new PermissionSettingsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ViewerResponseProjection.PermissionSettingsResponseProjection.permissions", 0)));
        }
        this.typename();
        return this;
    }

    public ViewerResponseProjection tenant() {
        return tenant(null);
    }

    public ViewerResponseProjection tenant(String alias) {
        fields.add(new GraphQLResponseField("tenant").alias(alias));
        return this;
    }

    public ViewerResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public ViewerResponseProjection user(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public ViewerResponseProjection permissions(PermissionSettingsResponseProjection subProjection) {
        return permissions(null, subProjection);
    }

    public ViewerResponseProjection permissions(String alias, PermissionSettingsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("permissions").alias(alias).projection(subProjection));
        return this;
    }

    public ViewerResponseProjection typename() {
        return typename(null);
    }

    public ViewerResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
