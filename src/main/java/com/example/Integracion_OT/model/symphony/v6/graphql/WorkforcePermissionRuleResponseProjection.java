package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for WorkforcePermissionRule
 */

public class WorkforcePermissionRuleResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WorkforcePermissionRuleResponseProjection() {
    }

    public WorkforcePermissionRuleResponseProjection all$() {
        return all$(3);
    }

    public WorkforcePermissionRuleResponseProjection all$(int maxDepth) {
        this.isAllowed();
        this.projectTypeIds();
        this.workOrderTypeIds();
        this.organizationIds();
        this.typename();
        return this;
    }

    public WorkforcePermissionRuleResponseProjection isAllowed() {
        return isAllowed(null);
    }

    public WorkforcePermissionRuleResponseProjection isAllowed(String alias) {
        fields.add(new GraphQLResponseField("isAllowed").alias(alias));
        return this;
    }

    public WorkforcePermissionRuleResponseProjection projectTypeIds() {
        return projectTypeIds(null);
    }

    public WorkforcePermissionRuleResponseProjection projectTypeIds(String alias) {
        fields.add(new GraphQLResponseField("projectTypeIds").alias(alias));
        return this;
    }

    public WorkforcePermissionRuleResponseProjection workOrderTypeIds() {
        return workOrderTypeIds(null);
    }

    public WorkforcePermissionRuleResponseProjection workOrderTypeIds(String alias) {
        fields.add(new GraphQLResponseField("workOrderTypeIds").alias(alias));
        return this;
    }

    public WorkforcePermissionRuleResponseProjection organizationIds() {
        return organizationIds(null);
    }

    public WorkforcePermissionRuleResponseProjection organizationIds(String alias) {
        fields.add(new GraphQLResponseField("organizationIds").alias(alias));
        return this;
    }

    public WorkforcePermissionRuleResponseProjection typename() {
        return typename(null);
    }

    public WorkforcePermissionRuleResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
