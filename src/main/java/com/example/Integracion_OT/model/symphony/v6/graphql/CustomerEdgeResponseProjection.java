package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for CustomerEdge
 */

public class CustomerEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CustomerEdgeResponseProjection() {
    }

    public CustomerEdgeResponseProjection all$() {
        return all$(3);
    }

    public CustomerEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CustomerEdgeResponseProjection.CustomerResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CustomerEdgeResponseProjection.CustomerResponseProjection.node", projectionDepthOnFields.getOrDefault("CustomerEdgeResponseProjection.CustomerResponseProjection.node", 0) + 1);
            this.node(new CustomerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CustomerEdgeResponseProjection.CustomerResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public CustomerEdgeResponseProjection node(CustomerResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public CustomerEdgeResponseProjection node(String alias, CustomerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public CustomerEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public CustomerEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public CustomerEdgeResponseProjection typename() {
        return typename(null);
    }

    public CustomerEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
