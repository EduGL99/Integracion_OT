package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for WorkOrderConnection
 */

public class WorkOrderConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WorkOrderConnectionResponseProjection() {
    }

    public WorkOrderConnectionResponseProjection all$() {
        return all$(3);
    }

    public WorkOrderConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("WorkOrderConnectionResponseProjection.WorkOrderEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderConnectionResponseProjection.WorkOrderEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("WorkOrderConnectionResponseProjection.WorkOrderEdgeResponseProjection.edges", 0) + 1);
            this.edges(new WorkOrderEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderConnectionResponseProjection.WorkOrderEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkOrderConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("WorkOrderConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public WorkOrderConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public WorkOrderConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public WorkOrderConnectionResponseProjection edges(WorkOrderEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public WorkOrderConnectionResponseProjection edges(String alias, WorkOrderEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public WorkOrderConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderConnectionResponseProjection typename() {
        return typename(null);
    }

    public WorkOrderConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
