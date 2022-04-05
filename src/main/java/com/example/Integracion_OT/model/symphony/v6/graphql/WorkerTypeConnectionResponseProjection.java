package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for WorkerTypeConnection
 */

public class WorkerTypeConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WorkerTypeConnectionResponseProjection() {
    }

    public WorkerTypeConnectionResponseProjection all$() {
        return all$(3);
    }

    public WorkerTypeConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("WorkerTypeConnectionResponseProjection.WorkerTypeEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkerTypeConnectionResponseProjection.WorkerTypeEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("WorkerTypeConnectionResponseProjection.WorkerTypeEdgeResponseProjection.edges", 0) + 1);
            this.edges(new WorkerTypeEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkerTypeConnectionResponseProjection.WorkerTypeEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkerTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkerTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("WorkerTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkerTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public WorkerTypeConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public WorkerTypeConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public WorkerTypeConnectionResponseProjection edges(WorkerTypeEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public WorkerTypeConnectionResponseProjection edges(String alias, WorkerTypeEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public WorkerTypeConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public WorkerTypeConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public WorkerTypeConnectionResponseProjection typename() {
        return typename(null);
    }

    public WorkerTypeConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
