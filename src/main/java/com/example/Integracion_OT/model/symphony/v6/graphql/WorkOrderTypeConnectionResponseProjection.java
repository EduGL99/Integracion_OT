package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for WorkOrderTypeConnection
 */

public class WorkOrderTypeConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WorkOrderTypeConnectionResponseProjection() {
    }

    public WorkOrderTypeConnectionResponseProjection all$() {
        return all$(3);
    }

    public WorkOrderTypeConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("WorkOrderTypeConnectionResponseProjection.WorkOrderTypeEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderTypeConnectionResponseProjection.WorkOrderTypeEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("WorkOrderTypeConnectionResponseProjection.WorkOrderTypeEdgeResponseProjection.edges", 0) + 1);
            this.edges(new WorkOrderTypeEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderTypeConnectionResponseProjection.WorkOrderTypeEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkOrderTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("WorkOrderTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public WorkOrderTypeConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public WorkOrderTypeConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public WorkOrderTypeConnectionResponseProjection edges(WorkOrderTypeEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public WorkOrderTypeConnectionResponseProjection edges(String alias, WorkOrderTypeEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderTypeConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public WorkOrderTypeConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderTypeConnectionResponseProjection typename() {
        return typename(null);
    }

    public WorkOrderTypeConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
