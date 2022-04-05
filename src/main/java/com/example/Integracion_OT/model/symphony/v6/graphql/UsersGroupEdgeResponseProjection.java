package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for UsersGroupEdge
 */

public class UsersGroupEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public UsersGroupEdgeResponseProjection() {
    }

    public UsersGroupEdgeResponseProjection all$() {
        return all$(3);
    }

    public UsersGroupEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("UsersGroupEdgeResponseProjection.UsersGroupResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("UsersGroupEdgeResponseProjection.UsersGroupResponseProjection.node", projectionDepthOnFields.getOrDefault("UsersGroupEdgeResponseProjection.UsersGroupResponseProjection.node", 0) + 1);
            this.node(new UsersGroupResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UsersGroupEdgeResponseProjection.UsersGroupResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public UsersGroupEdgeResponseProjection node(UsersGroupResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public UsersGroupEdgeResponseProjection node(String alias, UsersGroupResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public UsersGroupEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public UsersGroupEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public UsersGroupEdgeResponseProjection typename() {
        return typename(null);
    }

    public UsersGroupEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
