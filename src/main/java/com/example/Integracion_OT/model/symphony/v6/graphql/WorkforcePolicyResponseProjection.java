package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for WorkforcePolicy
 */

public class WorkforcePolicyResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WorkforcePolicyResponseProjection() {
    }

    public WorkforcePolicyResponseProjection all$() {
        return all$(3);
    }

    public WorkforcePolicyResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("WorkforcePolicyResponseProjection.WorkforcePermissionRuleResponseProjection.read", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkforcePolicyResponseProjection.WorkforcePermissionRuleResponseProjection.read", projectionDepthOnFields.getOrDefault("WorkforcePolicyResponseProjection.WorkforcePermissionRuleResponseProjection.read", 0) + 1);
            this.read(new WorkforcePermissionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkforcePolicyResponseProjection.WorkforcePermissionRuleResponseProjection.read", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkforcePolicyResponseProjection.WorkforceCUDResponseProjection.data", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkforcePolicyResponseProjection.WorkforceCUDResponseProjection.data", projectionDepthOnFields.getOrDefault("WorkforcePolicyResponseProjection.WorkforceCUDResponseProjection.data", 0) + 1);
            this.data(new WorkforceCUDResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkforcePolicyResponseProjection.WorkforceCUDResponseProjection.data", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkforcePolicyResponseProjection.CUDResponseProjection.templates", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkforcePolicyResponseProjection.CUDResponseProjection.templates", projectionDepthOnFields.getOrDefault("WorkforcePolicyResponseProjection.CUDResponseProjection.templates", 0) + 1);
            this.templates(new CUDResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkforcePolicyResponseProjection.CUDResponseProjection.templates", 0)));
        }
        this.typename();
        return this;
    }

    public WorkforcePolicyResponseProjection read(WorkforcePermissionRuleResponseProjection subProjection) {
        return read(null, subProjection);
    }

    public WorkforcePolicyResponseProjection read(String alias, WorkforcePermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("read").alias(alias).projection(subProjection));
        return this;
    }

    public WorkforcePolicyResponseProjection data(WorkforceCUDResponseProjection subProjection) {
        return data(null, subProjection);
    }

    public WorkforcePolicyResponseProjection data(String alias, WorkforceCUDResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("data").alias(alias).projection(subProjection));
        return this;
    }

    public WorkforcePolicyResponseProjection templates(CUDResponseProjection subProjection) {
        return templates(null, subProjection);
    }

    public WorkforcePolicyResponseProjection templates(String alias, CUDResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("templates").alias(alias).projection(subProjection));
        return this;
    }

    public WorkforcePolicyResponseProjection typename() {
        return typename(null);
    }

    public WorkforcePolicyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
