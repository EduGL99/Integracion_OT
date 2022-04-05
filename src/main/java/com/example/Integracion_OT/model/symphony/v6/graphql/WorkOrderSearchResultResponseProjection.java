package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for WorkOrderSearchResult
 */

public class WorkOrderSearchResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WorkOrderSearchResultResponseProjection() {
    }

    public WorkOrderSearchResultResponseProjection all$() {
        return all$(3);
    }

    public WorkOrderSearchResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("WorkOrderSearchResultResponseProjection.WorkOrderResponseProjection.workOrders", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderSearchResultResponseProjection.WorkOrderResponseProjection.workOrders", projectionDepthOnFields.getOrDefault("WorkOrderSearchResultResponseProjection.WorkOrderResponseProjection.workOrders", 0) + 1);
            this.workOrders(new WorkOrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderSearchResultResponseProjection.WorkOrderResponseProjection.workOrders", 0)));
        }
        this.count();
        this.typename();
        return this;
    }

    public WorkOrderSearchResultResponseProjection workOrders(WorkOrderResponseProjection subProjection) {
        return workOrders(null, subProjection);
    }

    public WorkOrderSearchResultResponseProjection workOrders(String alias, WorkOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrders").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderSearchResultResponseProjection count() {
        return count(null);
    }

    public WorkOrderSearchResultResponseProjection count(String alias) {
        fields.add(new GraphQLResponseField("count").alias(alias));
        return this;
    }

    public WorkOrderSearchResultResponseProjection typename() {
        return typename(null);
    }

    public WorkOrderSearchResultResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
