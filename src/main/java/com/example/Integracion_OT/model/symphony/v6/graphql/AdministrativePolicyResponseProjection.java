package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for AdministrativePolicy
 */

public class AdministrativePolicyResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public AdministrativePolicyResponseProjection() {
    }

    public AdministrativePolicyResponseProjection all$() {
        return all$(3);
    }

    public AdministrativePolicyResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("AdministrativePolicyResponseProjection.BasicPermissionRuleResponseProjection.access", 0) <= maxDepth) {
            projectionDepthOnFields.put("AdministrativePolicyResponseProjection.BasicPermissionRuleResponseProjection.access", projectionDepthOnFields.getOrDefault("AdministrativePolicyResponseProjection.BasicPermissionRuleResponseProjection.access", 0) + 1);
            this.access(new BasicPermissionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AdministrativePolicyResponseProjection.BasicPermissionRuleResponseProjection.access", 0)));
        }
        this.typename();
        return this;
    }

    public AdministrativePolicyResponseProjection access(BasicPermissionRuleResponseProjection subProjection) {
        return access(null, subProjection);
    }

    public AdministrativePolicyResponseProjection access(String alias, BasicPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("access").alias(alias).projection(subProjection));
        return this;
    }

    public AdministrativePolicyResponseProjection typename() {
        return typename(null);
    }

    public AdministrativePolicyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
