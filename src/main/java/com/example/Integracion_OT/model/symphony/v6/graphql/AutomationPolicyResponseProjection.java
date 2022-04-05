package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for AutomationPolicy
 */

public class AutomationPolicyResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public AutomationPolicyResponseProjection() {
    }

    public AutomationPolicyResponseProjection all$() {
        return all$(3);
    }

    public AutomationPolicyResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("AutomationPolicyResponseProjection.BasicPermissionRuleResponseProjection.read", 0) <= maxDepth) {
            projectionDepthOnFields.put("AutomationPolicyResponseProjection.BasicPermissionRuleResponseProjection.read", projectionDepthOnFields.getOrDefault("AutomationPolicyResponseProjection.BasicPermissionRuleResponseProjection.read", 0) + 1);
            this.read(new BasicPermissionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AutomationPolicyResponseProjection.BasicPermissionRuleResponseProjection.read", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("AutomationPolicyResponseProjection.CUDResponseProjection.templates", 0) <= maxDepth) {
            projectionDepthOnFields.put("AutomationPolicyResponseProjection.CUDResponseProjection.templates", projectionDepthOnFields.getOrDefault("AutomationPolicyResponseProjection.CUDResponseProjection.templates", 0) + 1);
            this.templates(new CUDResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AutomationPolicyResponseProjection.CUDResponseProjection.templates", 0)));
        }
        this.typename();
        return this;
    }

    public AutomationPolicyResponseProjection read(BasicPermissionRuleResponseProjection subProjection) {
        return read(null, subProjection);
    }

    public AutomationPolicyResponseProjection read(String alias, BasicPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("read").alias(alias).projection(subProjection));
        return this;
    }

    public AutomationPolicyResponseProjection templates(CUDResponseProjection subProjection) {
        return templates(null, subProjection);
    }

    public AutomationPolicyResponseProjection templates(String alias, CUDResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("templates").alias(alias).projection(subProjection));
        return this;
    }

    public AutomationPolicyResponseProjection typename() {
        return typename(null);
    }

    public AutomationPolicyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
