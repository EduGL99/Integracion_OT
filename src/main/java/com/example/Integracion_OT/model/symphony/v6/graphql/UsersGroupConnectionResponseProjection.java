package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for UsersGroupConnection
 */

public class UsersGroupConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public UsersGroupConnectionResponseProjection() {
    }

    public UsersGroupConnectionResponseProjection all$() {
        return all$(3);
    }

    public UsersGroupConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("UsersGroupConnectionResponseProjection.UsersGroupEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("UsersGroupConnectionResponseProjection.UsersGroupEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("UsersGroupConnectionResponseProjection.UsersGroupEdgeResponseProjection.edges", 0) + 1);
            this.edges(new UsersGroupEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UsersGroupConnectionResponseProjection.UsersGroupEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UsersGroupConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("UsersGroupConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("UsersGroupConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UsersGroupConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public UsersGroupConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public UsersGroupConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public UsersGroupConnectionResponseProjection edges(UsersGroupEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public UsersGroupConnectionResponseProjection edges(String alias, UsersGroupEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public UsersGroupConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public UsersGroupConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public UsersGroupConnectionResponseProjection typename() {
        return typename(null);
    }

    public UsersGroupConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
