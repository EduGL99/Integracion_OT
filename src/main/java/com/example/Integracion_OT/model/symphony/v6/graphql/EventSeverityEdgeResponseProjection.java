package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EventSeverityEdge
 */

public class EventSeverityEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EventSeverityEdgeResponseProjection() {
    }

    public EventSeverityEdgeResponseProjection all$() {
        return all$(3);
    }

    public EventSeverityEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("EventSeverityEdgeResponseProjection.EventSeverityResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("EventSeverityEdgeResponseProjection.EventSeverityResponseProjection.node", projectionDepthOnFields.getOrDefault("EventSeverityEdgeResponseProjection.EventSeverityResponseProjection.node", 0) + 1);
            this.node(new EventSeverityResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EventSeverityEdgeResponseProjection.EventSeverityResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public EventSeverityEdgeResponseProjection node(EventSeverityResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public EventSeverityEdgeResponseProjection node(String alias, EventSeverityResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public EventSeverityEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public EventSeverityEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public EventSeverityEdgeResponseProjection typename() {
        return typename(null);
    }

    public EventSeverityEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
