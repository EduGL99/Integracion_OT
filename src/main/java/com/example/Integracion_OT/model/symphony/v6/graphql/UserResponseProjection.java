package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for User
 */

public class UserResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public UserResponseProjection() {
    }

    public UserResponseProjection all$() {
        return all$(3);
    }

    public UserResponseProjection all$(int maxDepth) {
        this.id();
        this.authID();
        this.firstName();
        this.lastName();
        this.name();
        this.email();
        this.status();
        this.role();
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.FileResponseProjection.profilePhoto", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.FileResponseProjection.profilePhoto", projectionDepthOnFields.getOrDefault("UserResponseProjection.FileResponseProjection.profilePhoto", 0) + 1);
            this.profilePhoto(new FileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.FileResponseProjection.profilePhoto", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.UsersGroupResponseProjection.groups", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.UsersGroupResponseProjection.groups", projectionDepthOnFields.getOrDefault("UserResponseProjection.UsersGroupResponseProjection.groups", 0) + 1);
            this.groups(new UsersGroupResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.UsersGroupResponseProjection.groups", 0)));
        }
        this.distanceUnit();
        if (projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationResponseProjection.organizationFk", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserResponseProjection.OrganizationResponseProjection.organizationFk", projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationResponseProjection.organizationFk", 0) + 1);
            this.organizationFk(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserResponseProjection.OrganizationResponseProjection.organizationFk", 0)));
        }
        this.typename();
        return this;
    }

    public UserResponseProjection id() {
        return id(null);
    }

    public UserResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public UserResponseProjection authID() {
        return authID(null);
    }

    public UserResponseProjection authID(String alias) {
        fields.add(new GraphQLResponseField("authID").alias(alias));
        return this;
    }

    public UserResponseProjection firstName() {
        return firstName(null);
    }

    public UserResponseProjection firstName(String alias) {
        fields.add(new GraphQLResponseField("firstName").alias(alias));
        return this;
    }

    public UserResponseProjection lastName() {
        return lastName(null);
    }

    public UserResponseProjection lastName(String alias) {
        fields.add(new GraphQLResponseField("lastName").alias(alias));
        return this;
    }

    public UserResponseProjection name() {
        return name(null);
    }

    public UserResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public UserResponseProjection email() {
        return email(null);
    }

    public UserResponseProjection email(String alias) {
        fields.add(new GraphQLResponseField("email").alias(alias));
        return this;
    }

    public UserResponseProjection status() {
        return status(null);
    }

    public UserResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public UserResponseProjection role() {
        return role(null);
    }

    public UserResponseProjection role(String alias) {
        fields.add(new GraphQLResponseField("role").alias(alias));
        return this;
    }

    public UserResponseProjection profilePhoto(FileResponseProjection subProjection) {
        return profilePhoto(null, subProjection);
    }

    public UserResponseProjection profilePhoto(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("profilePhoto").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection groups(UsersGroupResponseProjection subProjection) {
        return groups(null, subProjection);
    }

    public UserResponseProjection groups(String alias, UsersGroupResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("groups").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection distanceUnit() {
        return distanceUnit(null);
    }

    public UserResponseProjection distanceUnit(String alias) {
        fields.add(new GraphQLResponseField("distanceUnit").alias(alias));
        return this;
    }

    public UserResponseProjection organizationFk(OrganizationResponseProjection subProjection) {
        return organizationFk(null, subProjection);
    }

    public UserResponseProjection organizationFk(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("organizationFk").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection typename() {
        return typename(null);
    }

    public UserResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
