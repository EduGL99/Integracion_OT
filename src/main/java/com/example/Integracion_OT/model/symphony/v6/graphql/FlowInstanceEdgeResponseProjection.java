package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for FlowInstanceEdge
 */

public class FlowInstanceEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FlowInstanceEdgeResponseProjection() {
    }

    public FlowInstanceEdgeResponseProjection all$() {
        return all$(3);
    }

    public FlowInstanceEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("FlowInstanceEdgeResponseProjection.FlowInstanceResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowInstanceEdgeResponseProjection.FlowInstanceResponseProjection.node", projectionDepthOnFields.getOrDefault("FlowInstanceEdgeResponseProjection.FlowInstanceResponseProjection.node", 0) + 1);
            this.node(new FlowInstanceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowInstanceEdgeResponseProjection.FlowInstanceResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public FlowInstanceEdgeResponseProjection node(FlowInstanceResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public FlowInstanceEdgeResponseProjection node(String alias, FlowInstanceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public FlowInstanceEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public FlowInstanceEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public FlowInstanceEdgeResponseProjection typename() {
        return typename(null);
    }

    public FlowInstanceEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
