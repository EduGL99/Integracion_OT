package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for RuleLimit
 */

public class RuleLimitResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RuleLimitResponseProjection() {
    }

    public RuleLimitResponseProjection all$() {
        return all$(3);
    }

    public RuleLimitResponseProjection all$(int maxDepth) {
        this.id();
        this.number();
        this.limitType();
        if (projectionDepthOnFields.getOrDefault("RuleLimitResponseProjection.ComparatorResponseProjection.comparator", 0) <= maxDepth) {
            projectionDepthOnFields.put("RuleLimitResponseProjection.ComparatorResponseProjection.comparator", projectionDepthOnFields.getOrDefault("RuleLimitResponseProjection.ComparatorResponseProjection.comparator", 0) + 1);
            this.comparator(new ComparatorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RuleLimitResponseProjection.ComparatorResponseProjection.comparator", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RuleLimitResponseProjection.RuleResponseProjection.rule", 0) <= maxDepth) {
            projectionDepthOnFields.put("RuleLimitResponseProjection.RuleResponseProjection.rule", projectionDepthOnFields.getOrDefault("RuleLimitResponseProjection.RuleResponseProjection.rule", 0) + 1);
            this.rule(new RuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RuleLimitResponseProjection.RuleResponseProjection.rule", 0)));
        }
        this.typename();
        return this;
    }

    public RuleLimitResponseProjection id() {
        return id(null);
    }

    public RuleLimitResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RuleLimitResponseProjection number() {
        return number(null);
    }

    public RuleLimitResponseProjection number(String alias) {
        fields.add(new GraphQLResponseField("number").alias(alias));
        return this;
    }

    public RuleLimitResponseProjection limitType() {
        return limitType(null);
    }

    public RuleLimitResponseProjection limitType(String alias) {
        fields.add(new GraphQLResponseField("limitType").alias(alias));
        return this;
    }

    public RuleLimitResponseProjection comparator(ComparatorResponseProjection subProjection) {
        return comparator(null, subProjection);
    }

    public RuleLimitResponseProjection comparator(String alias, ComparatorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comparator").alias(alias).projection(subProjection));
        return this;
    }

    public RuleLimitResponseProjection rule(RuleResponseProjection subProjection) {
        return rule(null, subProjection);
    }

    public RuleLimitResponseProjection rule(String alias, RuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("rule").alias(alias).projection(subProjection));
        return this;
    }

    public RuleLimitResponseProjection typename() {
        return typename(null);
    }

    public RuleLimitResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
