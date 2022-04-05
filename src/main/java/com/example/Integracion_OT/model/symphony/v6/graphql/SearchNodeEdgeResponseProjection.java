package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for SearchNodeEdge
 */

public class SearchNodeEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SearchNodeEdgeResponseProjection() {
    }

    public SearchNodeEdgeResponseProjection all$() {
        return all$(3);
    }

    public SearchNodeEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("SearchNodeEdgeResponseProjection.NodeResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("SearchNodeEdgeResponseProjection.NodeResponseProjection.node", projectionDepthOnFields.getOrDefault("SearchNodeEdgeResponseProjection.NodeResponseProjection.node", 0) + 1);
            this.node(new NodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SearchNodeEdgeResponseProjection.NodeResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public SearchNodeEdgeResponseProjection node(NodeResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public SearchNodeEdgeResponseProjection node(String alias, NodeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public SearchNodeEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public SearchNodeEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public SearchNodeEdgeResponseProjection typename() {
        return typename(null);
    }

    public SearchNodeEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
