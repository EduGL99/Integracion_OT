package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Rule
 */

public class RuleResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RuleResponseProjection() {
    }

    public RuleResponseProjection all$() {
        return all$(3);
    }

    public RuleResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.gracePeriod();
        this.startDateTime();
        this.endDateTime();
        if (projectionDepthOnFields.getOrDefault("RuleResponseProjection.RuleLimitResponseProjection.ruleLimit", 0) <= maxDepth) {
            projectionDepthOnFields.put("RuleResponseProjection.RuleLimitResponseProjection.ruleLimit", projectionDepthOnFields.getOrDefault("RuleResponseProjection.RuleLimitResponseProjection.ruleLimit", 0) + 1);
            this.ruleLimit(new RuleLimitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RuleResponseProjection.RuleLimitResponseProjection.ruleLimit", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RuleResponseProjection.RuleTypeResponseProjection.ruleType", 0) <= maxDepth) {
            projectionDepthOnFields.put("RuleResponseProjection.RuleTypeResponseProjection.ruleType", projectionDepthOnFields.getOrDefault("RuleResponseProjection.RuleTypeResponseProjection.ruleType", 0) + 1);
            this.ruleType(new RuleTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RuleResponseProjection.RuleTypeResponseProjection.ruleType", 0)));
        }
        this.eventTypeName();
        this.specificProblem();
        this.additionalInfo();
        this.status();
        if (projectionDepthOnFields.getOrDefault("RuleResponseProjection.EventSeverityResponseProjection.eventSeverity", 0) <= maxDepth) {
            projectionDepthOnFields.put("RuleResponseProjection.EventSeverityResponseProjection.eventSeverity", projectionDepthOnFields.getOrDefault("RuleResponseProjection.EventSeverityResponseProjection.eventSeverity", 0) + 1);
            this.eventSeverity(new EventSeverityResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RuleResponseProjection.EventSeverityResponseProjection.eventSeverity", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RuleResponseProjection.ThresholdResponseProjection.threshold", 0) <= maxDepth) {
            projectionDepthOnFields.put("RuleResponseProjection.ThresholdResponseProjection.threshold", projectionDepthOnFields.getOrDefault("RuleResponseProjection.ThresholdResponseProjection.threshold", 0) + 1);
            this.threshold(new ThresholdResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RuleResponseProjection.ThresholdResponseProjection.threshold", 0)));
        }
        this.typename();
        return this;
    }

    public RuleResponseProjection id() {
        return id(null);
    }

    public RuleResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RuleResponseProjection name() {
        return name(null);
    }

    public RuleResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public RuleResponseProjection gracePeriod() {
        return gracePeriod(null);
    }

    public RuleResponseProjection gracePeriod(String alias) {
        fields.add(new GraphQLResponseField("gracePeriod").alias(alias));
        return this;
    }

    public RuleResponseProjection startDateTime() {
        return startDateTime(null);
    }

    public RuleResponseProjection startDateTime(String alias) {
        fields.add(new GraphQLResponseField("startDateTime").alias(alias));
        return this;
    }

    public RuleResponseProjection endDateTime() {
        return endDateTime(null);
    }

    public RuleResponseProjection endDateTime(String alias) {
        fields.add(new GraphQLResponseField("endDateTime").alias(alias));
        return this;
    }

    public RuleResponseProjection ruleLimit(RuleLimitResponseProjection subProjection) {
        return ruleLimit(null, subProjection);
    }

    public RuleResponseProjection ruleLimit(String alias, RuleLimitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ruleLimit").alias(alias).projection(subProjection));
        return this;
    }

    public RuleResponseProjection ruleType(RuleTypeResponseProjection subProjection) {
        return ruleType(null, subProjection);
    }

    public RuleResponseProjection ruleType(String alias, RuleTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ruleType").alias(alias).projection(subProjection));
        return this;
    }

    public RuleResponseProjection eventTypeName() {
        return eventTypeName(null);
    }

    public RuleResponseProjection eventTypeName(String alias) {
        fields.add(new GraphQLResponseField("eventTypeName").alias(alias));
        return this;
    }

    public RuleResponseProjection specificProblem() {
        return specificProblem(null);
    }

    public RuleResponseProjection specificProblem(String alias) {
        fields.add(new GraphQLResponseField("specificProblem").alias(alias));
        return this;
    }

    public RuleResponseProjection additionalInfo() {
        return additionalInfo(null);
    }

    public RuleResponseProjection additionalInfo(String alias) {
        fields.add(new GraphQLResponseField("additionalInfo").alias(alias));
        return this;
    }

    public RuleResponseProjection status() {
        return status(null);
    }

    public RuleResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public RuleResponseProjection eventSeverity(EventSeverityResponseProjection subProjection) {
        return eventSeverity(null, subProjection);
    }

    public RuleResponseProjection eventSeverity(String alias, EventSeverityResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("eventSeverity").alias(alias).projection(subProjection));
        return this;
    }

    public RuleResponseProjection threshold(ThresholdResponseProjection subProjection) {
        return threshold(null, subProjection);
    }

    public RuleResponseProjection threshold(String alias, ThresholdResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("threshold").alias(alias).projection(subProjection));
        return this;
    }

    public RuleResponseProjection typename() {
        return typename(null);
    }

    public RuleResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
