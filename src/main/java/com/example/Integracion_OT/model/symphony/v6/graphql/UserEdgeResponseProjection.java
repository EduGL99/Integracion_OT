package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for UserEdge
 */

public class UserEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public UserEdgeResponseProjection() {
    }

    public UserEdgeResponseProjection all$() {
        return all$(3);
    }

    public UserEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("UserEdgeResponseProjection.UserResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserEdgeResponseProjection.UserResponseProjection.node", projectionDepthOnFields.getOrDefault("UserEdgeResponseProjection.UserResponseProjection.node", 0) + 1);
            this.node(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserEdgeResponseProjection.UserResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public UserEdgeResponseProjection node(UserResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public UserEdgeResponseProjection node(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public UserEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public UserEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public UserEdgeResponseProjection typename() {
        return typename(null);
    }

    public UserEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
