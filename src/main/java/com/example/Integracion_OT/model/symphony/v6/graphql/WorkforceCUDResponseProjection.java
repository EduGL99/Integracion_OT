package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for WorkforceCUD
 */

public class WorkforceCUDResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WorkforceCUDResponseProjection() {
    }

    public WorkforceCUDResponseProjection all$() {
        return all$(3);
    }

    public WorkforceCUDResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("WorkforceCUDResponseProjection.WorkforcePermissionRuleResponseProjection.create", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkforceCUDResponseProjection.WorkforcePermissionRuleResponseProjection.create", projectionDepthOnFields.getOrDefault("WorkforceCUDResponseProjection.WorkforcePermissionRuleResponseProjection.create", 0) + 1);
            this.create(new WorkforcePermissionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkforceCUDResponseProjection.WorkforcePermissionRuleResponseProjection.create", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkforceCUDResponseProjection.WorkforcePermissionRuleResponseProjection.update", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkforceCUDResponseProjection.WorkforcePermissionRuleResponseProjection.update", projectionDepthOnFields.getOrDefault("WorkforceCUDResponseProjection.WorkforcePermissionRuleResponseProjection.update", 0) + 1);
            this.update(new WorkforcePermissionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkforceCUDResponseProjection.WorkforcePermissionRuleResponseProjection.update", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkforceCUDResponseProjection.WorkforcePermissionRuleResponseProjection.delete", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkforceCUDResponseProjection.WorkforcePermissionRuleResponseProjection.delete", projectionDepthOnFields.getOrDefault("WorkforceCUDResponseProjection.WorkforcePermissionRuleResponseProjection.delete", 0) + 1);
            this.delete(new WorkforcePermissionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkforceCUDResponseProjection.WorkforcePermissionRuleResponseProjection.delete", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkforceCUDResponseProjection.WorkforcePermissionRuleResponseProjection.assign", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkforceCUDResponseProjection.WorkforcePermissionRuleResponseProjection.assign", projectionDepthOnFields.getOrDefault("WorkforceCUDResponseProjection.WorkforcePermissionRuleResponseProjection.assign", 0) + 1);
            this.assign(new WorkforcePermissionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkforceCUDResponseProjection.WorkforcePermissionRuleResponseProjection.assign", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkforceCUDResponseProjection.WorkforcePermissionRuleResponseProjection.transferOwnership", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkforceCUDResponseProjection.WorkforcePermissionRuleResponseProjection.transferOwnership", projectionDepthOnFields.getOrDefault("WorkforceCUDResponseProjection.WorkforcePermissionRuleResponseProjection.transferOwnership", 0) + 1);
            this.transferOwnership(new WorkforcePermissionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkforceCUDResponseProjection.WorkforcePermissionRuleResponseProjection.transferOwnership", 0)));
        }
        this.typename();
        return this;
    }

    public WorkforceCUDResponseProjection create(WorkforcePermissionRuleResponseProjection subProjection) {
        return create(null, subProjection);
    }

    public WorkforceCUDResponseProjection create(String alias, WorkforcePermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("create").alias(alias).projection(subProjection));
        return this;
    }

    public WorkforceCUDResponseProjection update(WorkforcePermissionRuleResponseProjection subProjection) {
        return update(null, subProjection);
    }

    public WorkforceCUDResponseProjection update(String alias, WorkforcePermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("update").alias(alias).projection(subProjection));
        return this;
    }

    public WorkforceCUDResponseProjection delete(WorkforcePermissionRuleResponseProjection subProjection) {
        return delete(null, subProjection);
    }

    public WorkforceCUDResponseProjection delete(String alias, WorkforcePermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("delete").alias(alias).projection(subProjection));
        return this;
    }

    public WorkforceCUDResponseProjection assign(WorkforcePermissionRuleResponseProjection subProjection) {
        return assign(null, subProjection);
    }

    public WorkforceCUDResponseProjection assign(String alias, WorkforcePermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("assign").alias(alias).projection(subProjection));
        return this;
    }

    public WorkforceCUDResponseProjection transferOwnership(WorkforcePermissionRuleResponseProjection subProjection) {
        return transferOwnership(null, subProjection);
    }

    public WorkforceCUDResponseProjection transferOwnership(String alias, WorkforcePermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("transferOwnership").alias(alias).projection(subProjection));
        return this;
    }

    public WorkforceCUDResponseProjection typename() {
        return typename(null);
    }

    public WorkforceCUDResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
