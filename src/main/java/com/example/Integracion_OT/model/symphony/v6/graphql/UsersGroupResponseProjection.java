package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for UsersGroup
 */

public class UsersGroupResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public UsersGroupResponseProjection() {
    }

    public UsersGroupResponseProjection all$() {
        return all$(3);
    }

    public UsersGroupResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        this.status();
        if (projectionDepthOnFields.getOrDefault("UsersGroupResponseProjection.UserResponseProjection.members", 0) <= maxDepth) {
            projectionDepthOnFields.put("UsersGroupResponseProjection.UserResponseProjection.members", projectionDepthOnFields.getOrDefault("UsersGroupResponseProjection.UserResponseProjection.members", 0) + 1);
            this.members(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UsersGroupResponseProjection.UserResponseProjection.members", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UsersGroupResponseProjection.PermissionsPolicyResponseProjection.policies", 0) <= maxDepth) {
            projectionDepthOnFields.put("UsersGroupResponseProjection.PermissionsPolicyResponseProjection.policies", projectionDepthOnFields.getOrDefault("UsersGroupResponseProjection.PermissionsPolicyResponseProjection.policies", 0) + 1);
            this.policies(new PermissionsPolicyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UsersGroupResponseProjection.PermissionsPolicyResponseProjection.policies", 0)));
        }
        this.typename();
        return this;
    }

    public UsersGroupResponseProjection id() {
        return id(null);
    }

    public UsersGroupResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public UsersGroupResponseProjection name() {
        return name(null);
    }

    public UsersGroupResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public UsersGroupResponseProjection description() {
        return description(null);
    }

    public UsersGroupResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public UsersGroupResponseProjection status() {
        return status(null);
    }

    public UsersGroupResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public UsersGroupResponseProjection members(UserResponseProjection subProjection) {
        return members(null, subProjection);
    }

    public UsersGroupResponseProjection members(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("members").alias(alias).projection(subProjection));
        return this;
    }

    public UsersGroupResponseProjection policies(PermissionsPolicyResponseProjection subProjection) {
        return policies(null, subProjection);
    }

    public UsersGroupResponseProjection policies(String alias, PermissionsPolicyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("policies").alias(alias).projection(subProjection));
        return this;
    }

    public UsersGroupResponseProjection typename() {
        return typename(null);
    }

    public UsersGroupResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
