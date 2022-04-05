package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for AssurancePolicy
 */

public class AssurancePolicyResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public AssurancePolicyResponseProjection() {
    }

    public AssurancePolicyResponseProjection all$() {
        return all$(3);
    }

    public AssurancePolicyResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("AssurancePolicyResponseProjection.BasicPermissionRuleResponseProjection.read", 0) <= maxDepth) {
            projectionDepthOnFields.put("AssurancePolicyResponseProjection.BasicPermissionRuleResponseProjection.read", projectionDepthOnFields.getOrDefault("AssurancePolicyResponseProjection.BasicPermissionRuleResponseProjection.read", 0) + 1);
            this.read(new BasicPermissionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AssurancePolicyResponseProjection.BasicPermissionRuleResponseProjection.read", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("AssurancePolicyResponseProjection.CUDResponseProjection.templates", 0) <= maxDepth) {
            projectionDepthOnFields.put("AssurancePolicyResponseProjection.CUDResponseProjection.templates", projectionDepthOnFields.getOrDefault("AssurancePolicyResponseProjection.CUDResponseProjection.templates", 0) + 1);
            this.templates(new CUDResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AssurancePolicyResponseProjection.CUDResponseProjection.templates", 0)));
        }
        this.typename();
        return this;
    }

    public AssurancePolicyResponseProjection read(BasicPermissionRuleResponseProjection subProjection) {
        return read(null, subProjection);
    }

    public AssurancePolicyResponseProjection read(String alias, BasicPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("read").alias(alias).projection(subProjection));
        return this;
    }

    public AssurancePolicyResponseProjection templates(CUDResponseProjection subProjection) {
        return templates(null, subProjection);
    }

    public AssurancePolicyResponseProjection templates(String alias, CUDResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("templates").alias(alias).projection(subProjection));
        return this;
    }

    public AssurancePolicyResponseProjection typename() {
        return typename(null);
    }

    public AssurancePolicyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
