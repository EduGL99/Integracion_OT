package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Comparator
 */

public class ComparatorResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ComparatorResponseProjection() {
    }

    public ComparatorResponseProjection all$() {
        return all$(3);
    }

    public ComparatorResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("ComparatorResponseProjection.RuleLimitResponseProjection.ruleLimit", 0) <= maxDepth) {
            projectionDepthOnFields.put("ComparatorResponseProjection.RuleLimitResponseProjection.ruleLimit", projectionDepthOnFields.getOrDefault("ComparatorResponseProjection.RuleLimitResponseProjection.ruleLimit", 0) + 1);
            this.ruleLimit(new RuleLimitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ComparatorResponseProjection.RuleLimitResponseProjection.ruleLimit", 0)));
        }
        this.typename();
        return this;
    }

    public ComparatorResponseProjection id() {
        return id(null);
    }

    public ComparatorResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ComparatorResponseProjection name() {
        return name(null);
    }

    public ComparatorResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ComparatorResponseProjection ruleLimit(RuleLimitResponseProjection subProjection) {
        return ruleLimit(null, subProjection);
    }

    public ComparatorResponseProjection ruleLimit(String alias, RuleLimitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ruleLimit").alias(alias).projection(subProjection));
        return this;
    }

    public ComparatorResponseProjection typename() {
        return typename(null);
    }

    public ComparatorResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
