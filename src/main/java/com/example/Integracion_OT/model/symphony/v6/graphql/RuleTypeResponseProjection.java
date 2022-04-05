package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for RuleType
 */

public class RuleTypeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RuleTypeResponseProjection() {
    }

    public RuleTypeResponseProjection all$() {
        return all$(3);
    }

    public RuleTypeResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("RuleTypeResponseProjection.RuleResponseProjection.rule", 0) <= maxDepth) {
            projectionDepthOnFields.put("RuleTypeResponseProjection.RuleResponseProjection.rule", projectionDepthOnFields.getOrDefault("RuleTypeResponseProjection.RuleResponseProjection.rule", 0) + 1);
            this.rule(new RuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RuleTypeResponseProjection.RuleResponseProjection.rule", 0)));
        }
        this.typename();
        return this;
    }

    public RuleTypeResponseProjection id() {
        return id(null);
    }

    public RuleTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RuleTypeResponseProjection name() {
        return name(null);
    }

    public RuleTypeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public RuleTypeResponseProjection rule(RuleResponseProjection subProjection) {
        return rule(null, subProjection);
    }

    public RuleTypeResponseProjection rule(String alias, RuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("rule").alias(alias).projection(subProjection));
        return this;
    }

    public RuleTypeResponseProjection typename() {
        return typename(null);
    }

    public RuleTypeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
