package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for UserSearchResult
 */

public class UserSearchResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public UserSearchResultResponseProjection() {
    }

    public UserSearchResultResponseProjection all$() {
        return all$(3);
    }

    public UserSearchResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("UserSearchResultResponseProjection.UserResponseProjection.users", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserSearchResultResponseProjection.UserResponseProjection.users", projectionDepthOnFields.getOrDefault("UserSearchResultResponseProjection.UserResponseProjection.users", 0) + 1);
            this.users(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserSearchResultResponseProjection.UserResponseProjection.users", 0)));
        }
        this.count();
        this.typename();
        return this;
    }

    public UserSearchResultResponseProjection users(UserResponseProjection subProjection) {
        return users(null, subProjection);
    }

    public UserSearchResultResponseProjection users(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("users").alias(alias).projection(subProjection));
        return this;
    }

    public UserSearchResultResponseProjection count() {
        return count(null);
    }

    public UserSearchResultResponseProjection count(String alias) {
        fields.add(new GraphQLResponseField("count").alias(alias));
        return this;
    }

    public UserSearchResultResponseProjection typename() {
        return typename(null);
    }

    public UserSearchResultResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
