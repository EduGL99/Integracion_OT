package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for WorkerTypeEdge
 */

public class WorkerTypeEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WorkerTypeEdgeResponseProjection() {
    }

    public WorkerTypeEdgeResponseProjection all$() {
        return all$(3);
    }

    public WorkerTypeEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("WorkerTypeEdgeResponseProjection.WorkerTypeResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkerTypeEdgeResponseProjection.WorkerTypeResponseProjection.node", projectionDepthOnFields.getOrDefault("WorkerTypeEdgeResponseProjection.WorkerTypeResponseProjection.node", 0) + 1);
            this.node(new WorkerTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkerTypeEdgeResponseProjection.WorkerTypeResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public WorkerTypeEdgeResponseProjection node(WorkerTypeResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public WorkerTypeEdgeResponseProjection node(String alias, WorkerTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public WorkerTypeEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public WorkerTypeEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public WorkerTypeEdgeResponseProjection typename() {
        return typename(null);
    }

    public WorkerTypeEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
