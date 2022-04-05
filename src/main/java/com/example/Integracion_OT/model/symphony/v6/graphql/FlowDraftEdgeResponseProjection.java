package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for FlowDraftEdge
 */

public class FlowDraftEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FlowDraftEdgeResponseProjection() {
    }

    public FlowDraftEdgeResponseProjection all$() {
        return all$(3);
    }

    public FlowDraftEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("FlowDraftEdgeResponseProjection.FlowDraftResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowDraftEdgeResponseProjection.FlowDraftResponseProjection.node", projectionDepthOnFields.getOrDefault("FlowDraftEdgeResponseProjection.FlowDraftResponseProjection.node", 0) + 1);
            this.node(new FlowDraftResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowDraftEdgeResponseProjection.FlowDraftResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public FlowDraftEdgeResponseProjection node(FlowDraftResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public FlowDraftEdgeResponseProjection node(String alias, FlowDraftResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public FlowDraftEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public FlowDraftEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public FlowDraftEdgeResponseProjection typename() {
        return typename(null);
    }

    public FlowDraftEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
