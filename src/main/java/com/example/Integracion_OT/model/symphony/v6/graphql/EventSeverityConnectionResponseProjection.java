package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EventSeverityConnection
 */

public class EventSeverityConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EventSeverityConnectionResponseProjection() {
    }

    public EventSeverityConnectionResponseProjection all$() {
        return all$(3);
    }

    public EventSeverityConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("EventSeverityConnectionResponseProjection.EventSeverityEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("EventSeverityConnectionResponseProjection.EventSeverityEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("EventSeverityConnectionResponseProjection.EventSeverityEdgeResponseProjection.edges", 0) + 1);
            this.edges(new EventSeverityEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EventSeverityConnectionResponseProjection.EventSeverityEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EventSeverityConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("EventSeverityConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("EventSeverityConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EventSeverityConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public EventSeverityConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public EventSeverityConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public EventSeverityConnectionResponseProjection edges(EventSeverityEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public EventSeverityConnectionResponseProjection edges(String alias, EventSeverityEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public EventSeverityConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public EventSeverityConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public EventSeverityConnectionResponseProjection typename() {
        return typename(null);
    }

    public EventSeverityConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
