package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for PageInfo
 */

public class PageInfoResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PageInfoResponseProjection() {
    }

    public PageInfoResponseProjection all$() {
        return all$(3);
    }

    public PageInfoResponseProjection all$(int maxDepth) {
        this.hasNextPage();
        this.hasPreviousPage();
        this.startCursor();
        this.endCursor();
        this.typename();
        return this;
    }

    public PageInfoResponseProjection hasNextPage() {
        return hasNextPage(null);
    }

    public PageInfoResponseProjection hasNextPage(String alias) {
        fields.add(new GraphQLResponseField("hasNextPage").alias(alias));
        return this;
    }

    public PageInfoResponseProjection hasPreviousPage() {
        return hasPreviousPage(null);
    }

    public PageInfoResponseProjection hasPreviousPage(String alias) {
        fields.add(new GraphQLResponseField("hasPreviousPage").alias(alias));
        return this;
    }

    public PageInfoResponseProjection startCursor() {
        return startCursor(null);
    }

    public PageInfoResponseProjection startCursor(String alias) {
        fields.add(new GraphQLResponseField("startCursor").alias(alias));
        return this;
    }

    public PageInfoResponseProjection endCursor() {
        return endCursor(null);
    }

    public PageInfoResponseProjection endCursor(String alias) {
        fields.add(new GraphQLResponseField("endCursor").alias(alias));
        return this;
    }

    public PageInfoResponseProjection typename() {
        return typename(null);
    }

    public PageInfoResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
