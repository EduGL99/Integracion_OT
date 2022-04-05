package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for WorkOrderStatusChangedPayload
 */

public class WorkOrderStatusChangedPayloadResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WorkOrderStatusChangedPayloadResponseProjection() {
    }

    public WorkOrderStatusChangedPayloadResponseProjection all$() {
        return all$(3);
    }

    public WorkOrderStatusChangedPayloadResponseProjection all$(int maxDepth) {
        this.from();
        this.to();
        if (projectionDepthOnFields.getOrDefault("WorkOrderStatusChangedPayloadResponseProjection.WorkOrderResponseProjection.workOrder", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderStatusChangedPayloadResponseProjection.WorkOrderResponseProjection.workOrder", projectionDepthOnFields.getOrDefault("WorkOrderStatusChangedPayloadResponseProjection.WorkOrderResponseProjection.workOrder", 0) + 1);
            this.workOrder(new WorkOrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderStatusChangedPayloadResponseProjection.WorkOrderResponseProjection.workOrder", 0)));
        }
        this.typename();
        return this;
    }

    public WorkOrderStatusChangedPayloadResponseProjection from() {
        return from(null);
    }

    public WorkOrderStatusChangedPayloadResponseProjection from(String alias) {
        fields.add(new GraphQLResponseField("from").alias(alias));
        return this;
    }

    public WorkOrderStatusChangedPayloadResponseProjection to() {
        return to(null);
    }

    public WorkOrderStatusChangedPayloadResponseProjection to(String alias) {
        fields.add(new GraphQLResponseField("to").alias(alias));
        return this;
    }

    public WorkOrderStatusChangedPayloadResponseProjection workOrder(WorkOrderResponseProjection subProjection) {
        return workOrder(null, subProjection);
    }

    public WorkOrderStatusChangedPayloadResponseProjection workOrder(String alias, WorkOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrder").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderStatusChangedPayloadResponseProjection typename() {
        return typename(null);
    }

    public WorkOrderStatusChangedPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
