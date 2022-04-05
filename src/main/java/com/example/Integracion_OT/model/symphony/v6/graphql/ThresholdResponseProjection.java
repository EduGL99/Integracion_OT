package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Threshold
 */

public class ThresholdResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ThresholdResponseProjection() {
    }

    public ThresholdResponseProjection all$() {
        return all$(3);
    }

    public ThresholdResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        this.status();
        if (projectionDepthOnFields.getOrDefault("ThresholdResponseProjection.RuleResponseProjection.rule", 0) <= maxDepth) {
            projectionDepthOnFields.put("ThresholdResponseProjection.RuleResponseProjection.rule", projectionDepthOnFields.getOrDefault("ThresholdResponseProjection.RuleResponseProjection.rule", 0) + 1);
            this.rule(new RuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ThresholdResponseProjection.RuleResponseProjection.rule", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ThresholdResponseProjection.KpiResponseProjection.kpi", 0) <= maxDepth) {
            projectionDepthOnFields.put("ThresholdResponseProjection.KpiResponseProjection.kpi", projectionDepthOnFields.getOrDefault("ThresholdResponseProjection.KpiResponseProjection.kpi", 0) + 1);
            this.kpi(new KpiResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ThresholdResponseProjection.KpiResponseProjection.kpi", 0)));
        }
        this.typename();
        return this;
    }

    public ThresholdResponseProjection id() {
        return id(null);
    }

    public ThresholdResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ThresholdResponseProjection name() {
        return name(null);
    }

    public ThresholdResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ThresholdResponseProjection description() {
        return description(null);
    }

    public ThresholdResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ThresholdResponseProjection status() {
        return status(null);
    }

    public ThresholdResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public ThresholdResponseProjection rule(RuleResponseProjection subProjection) {
        return rule(null, subProjection);
    }

    public ThresholdResponseProjection rule(String alias, RuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("rule").alias(alias).projection(subProjection));
        return this;
    }

    public ThresholdResponseProjection kpi(KpiResponseProjection subProjection) {
        return kpi(null, subProjection);
    }

    public ThresholdResponseProjection kpi(String alias, KpiResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("kpi").alias(alias).projection(subProjection));
        return this;
    }

    public ThresholdResponseProjection typename() {
        return typename(null);
    }

    public ThresholdResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
