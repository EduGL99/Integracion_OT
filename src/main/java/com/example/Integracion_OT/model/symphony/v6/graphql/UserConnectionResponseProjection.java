package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for UserConnection
 */

public class UserConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public UserConnectionResponseProjection() {
    }

    public UserConnectionResponseProjection all$() {
        return all$(3);
    }

    public UserConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserConnectionResponseProjection.UserEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserEdgeResponseProjection.edges", 0) + 1);
            this.edges(new UserEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.UserEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public UserConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public UserConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public UserConnectionResponseProjection edges(UserEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public UserConnectionResponseProjection edges(String alias, UserEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public UserConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public UserConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public UserConnectionResponseProjection typename() {
        return typename(null);
    }

    public UserConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
