package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EventSeverity
 */

public class EventSeverityResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EventSeverityResponseProjection() {
    }

    public EventSeverityResponseProjection all$() {
        return all$(3);
    }

    public EventSeverityResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("EventSeverityResponseProjection.RuleResponseProjection.rule", 0) <= maxDepth) {
            projectionDepthOnFields.put("EventSeverityResponseProjection.RuleResponseProjection.rule", projectionDepthOnFields.getOrDefault("EventSeverityResponseProjection.RuleResponseProjection.rule", 0) + 1);
            this.rule(new RuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EventSeverityResponseProjection.RuleResponseProjection.rule", 0)));
        }
        this.typename();
        return this;
    }

    public EventSeverityResponseProjection id() {
        return id(null);
    }

    public EventSeverityResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EventSeverityResponseProjection name() {
        return name(null);
    }

    public EventSeverityResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public EventSeverityResponseProjection rule(RuleResponseProjection subProjection) {
        return rule(null, subProjection);
    }

    public EventSeverityResponseProjection rule(String alias, RuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("rule").alias(alias).projection(subProjection));
        return this;
    }

    public EventSeverityResponseProjection typename() {
        return typename(null);
    }

    public EventSeverityResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
