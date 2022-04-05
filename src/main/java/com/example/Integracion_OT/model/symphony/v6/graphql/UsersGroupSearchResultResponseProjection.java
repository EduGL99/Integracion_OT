package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for UsersGroupSearchResult
 */

public class UsersGroupSearchResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public UsersGroupSearchResultResponseProjection() {
    }

    public UsersGroupSearchResultResponseProjection all$() {
        return all$(3);
    }

    public UsersGroupSearchResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("UsersGroupSearchResultResponseProjection.UsersGroupResponseProjection.usersGroups", 0) <= maxDepth) {
            projectionDepthOnFields.put("UsersGroupSearchResultResponseProjection.UsersGroupResponseProjection.usersGroups", projectionDepthOnFields.getOrDefault("UsersGroupSearchResultResponseProjection.UsersGroupResponseProjection.usersGroups", 0) + 1);
            this.usersGroups(new UsersGroupResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UsersGroupSearchResultResponseProjection.UsersGroupResponseProjection.usersGroups", 0)));
        }
        this.count();
        this.typename();
        return this;
    }

    public UsersGroupSearchResultResponseProjection usersGroups(UsersGroupResponseProjection subProjection) {
        return usersGroups(null, subProjection);
    }

    public UsersGroupSearchResultResponseProjection usersGroups(String alias, UsersGroupResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("usersGroups").alias(alias).projection(subProjection));
        return this;
    }

    public UsersGroupSearchResultResponseProjection count() {
        return count(null);
    }

    public UsersGroupSearchResultResponseProjection count(String alias) {
        fields.add(new GraphQLResponseField("count").alias(alias));
        return this;
    }

    public UsersGroupSearchResultResponseProjection typename() {
        return typename(null);
    }

    public UsersGroupSearchResultResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
