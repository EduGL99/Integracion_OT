package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for WorkOrderEdge
 */

public class WorkOrderEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WorkOrderEdgeResponseProjection() {
    }

    public WorkOrderEdgeResponseProjection all$() {
        return all$(3);
    }

    public WorkOrderEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("WorkOrderEdgeResponseProjection.WorkOrderResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderEdgeResponseProjection.WorkOrderResponseProjection.node", projectionDepthOnFields.getOrDefault("WorkOrderEdgeResponseProjection.WorkOrderResponseProjection.node", 0) + 1);
            this.node(new WorkOrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderEdgeResponseProjection.WorkOrderResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public WorkOrderEdgeResponseProjection node(WorkOrderResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public WorkOrderEdgeResponseProjection node(String alias, WorkOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public WorkOrderEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public WorkOrderEdgeResponseProjection typename() {
        return typename(null);
    }

    public WorkOrderEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
