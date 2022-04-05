package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for FlowInstanceConnection
 */

public class FlowInstanceConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FlowInstanceConnectionResponseProjection() {
    }

    public FlowInstanceConnectionResponseProjection all$() {
        return all$(3);
    }

    public FlowInstanceConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("FlowInstanceConnectionResponseProjection.FlowInstanceEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowInstanceConnectionResponseProjection.FlowInstanceEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("FlowInstanceConnectionResponseProjection.FlowInstanceEdgeResponseProjection.edges", 0) + 1);
            this.edges(new FlowInstanceEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowInstanceConnectionResponseProjection.FlowInstanceEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FlowInstanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowInstanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("FlowInstanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowInstanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public FlowInstanceConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public FlowInstanceConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public FlowInstanceConnectionResponseProjection edges(FlowInstanceEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public FlowInstanceConnectionResponseProjection edges(String alias, FlowInstanceEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public FlowInstanceConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public FlowInstanceConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public FlowInstanceConnectionResponseProjection typename() {
        return typename(null);
    }

    public FlowInstanceConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
