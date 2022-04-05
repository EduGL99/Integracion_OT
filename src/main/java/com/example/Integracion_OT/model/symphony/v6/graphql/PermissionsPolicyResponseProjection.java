package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for PermissionsPolicy
 */

public class PermissionsPolicyResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PermissionsPolicyResponseProjection() {
    }

    public PermissionsPolicyResponseProjection all$() {
        return all$(3);
    }

    public PermissionsPolicyResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        this.isGlobal();
        this.isMulticontractor();
        if (projectionDepthOnFields.getOrDefault("PermissionsPolicyResponseProjection.SystemPolicyResponseProjection.policy", 0) <= maxDepth) {
            projectionDepthOnFields.put("PermissionsPolicyResponseProjection.SystemPolicyResponseProjection.policy", projectionDepthOnFields.getOrDefault("PermissionsPolicyResponseProjection.SystemPolicyResponseProjection.policy", 0) + 1);
            this.policy(new SystemPolicyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PermissionsPolicyResponseProjection.SystemPolicyResponseProjection.policy", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PermissionsPolicyResponseProjection.UsersGroupResponseProjection.groups", 0) <= maxDepth) {
            projectionDepthOnFields.put("PermissionsPolicyResponseProjection.UsersGroupResponseProjection.groups", projectionDepthOnFields.getOrDefault("PermissionsPolicyResponseProjection.UsersGroupResponseProjection.groups", 0) + 1);
            this.groups(new UsersGroupResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PermissionsPolicyResponseProjection.UsersGroupResponseProjection.groups", 0)));
        }
        this.typename();
        return this;
    }

    public PermissionsPolicyResponseProjection id() {
        return id(null);
    }

    public PermissionsPolicyResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PermissionsPolicyResponseProjection name() {
        return name(null);
    }

    public PermissionsPolicyResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public PermissionsPolicyResponseProjection description() {
        return description(null);
    }

    public PermissionsPolicyResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public PermissionsPolicyResponseProjection isGlobal() {
        return isGlobal(null);
    }

    public PermissionsPolicyResponseProjection isGlobal(String alias) {
        fields.add(new GraphQLResponseField("isGlobal").alias(alias));
        return this;
    }

    public PermissionsPolicyResponseProjection isMulticontractor() {
        return isMulticontractor(null);
    }

    public PermissionsPolicyResponseProjection isMulticontractor(String alias) {
        fields.add(new GraphQLResponseField("isMulticontractor").alias(alias));
        return this;
    }

    public PermissionsPolicyResponseProjection policy(SystemPolicyResponseProjection subProjection) {
        return policy(null, subProjection);
    }

    public PermissionsPolicyResponseProjection policy(String alias, SystemPolicyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("policy").alias(alias).projection(subProjection));
        return this;
    }

    public PermissionsPolicyResponseProjection groups(UsersGroupResponseProjection subProjection) {
        return groups(null, subProjection);
    }

    public PermissionsPolicyResponseProjection groups(String alias, UsersGroupResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("groups").alias(alias).projection(subProjection));
        return this;
    }

    public PermissionsPolicyResponseProjection typename() {
        return typename(null);
    }

    public PermissionsPolicyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
