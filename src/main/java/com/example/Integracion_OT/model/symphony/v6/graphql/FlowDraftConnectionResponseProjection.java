package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for FlowDraftConnection
 */

public class FlowDraftConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FlowDraftConnectionResponseProjection() {
    }

    public FlowDraftConnectionResponseProjection all$() {
        return all$(3);
    }

    public FlowDraftConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("FlowDraftConnectionResponseProjection.FlowDraftEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowDraftConnectionResponseProjection.FlowDraftEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("FlowDraftConnectionResponseProjection.FlowDraftEdgeResponseProjection.edges", 0) + 1);
            this.edges(new FlowDraftEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowDraftConnectionResponseProjection.FlowDraftEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FlowDraftConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowDraftConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("FlowDraftConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowDraftConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public FlowDraftConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public FlowDraftConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public FlowDraftConnectionResponseProjection edges(FlowDraftEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public FlowDraftConnectionResponseProjection edges(String alias, FlowDraftEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public FlowDraftConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public FlowDraftConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public FlowDraftConnectionResponseProjection typename() {
        return typename(null);
    }

    public FlowDraftConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
