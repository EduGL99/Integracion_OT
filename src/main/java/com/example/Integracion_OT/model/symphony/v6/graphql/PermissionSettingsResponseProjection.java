package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for PermissionSettings
 */

public class PermissionSettingsResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PermissionSettingsResponseProjection() {
    }

    public PermissionSettingsResponseProjection all$() {
        return all$(3);
    }

    public PermissionSettingsResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PermissionSettingsResponseProjection.AdministrativePolicyResponseProjection.adminPolicy", 0) <= maxDepth) {
            projectionDepthOnFields.put("PermissionSettingsResponseProjection.AdministrativePolicyResponseProjection.adminPolicy", projectionDepthOnFields.getOrDefault("PermissionSettingsResponseProjection.AdministrativePolicyResponseProjection.adminPolicy", 0) + 1);
            this.adminPolicy(new AdministrativePolicyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PermissionSettingsResponseProjection.AdministrativePolicyResponseProjection.adminPolicy", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PermissionSettingsResponseProjection.InventoryPolicyResponseProjection.inventoryPolicy", 0) <= maxDepth) {
            projectionDepthOnFields.put("PermissionSettingsResponseProjection.InventoryPolicyResponseProjection.inventoryPolicy", projectionDepthOnFields.getOrDefault("PermissionSettingsResponseProjection.InventoryPolicyResponseProjection.inventoryPolicy", 0) + 1);
            this.inventoryPolicy(new InventoryPolicyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PermissionSettingsResponseProjection.InventoryPolicyResponseProjection.inventoryPolicy", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PermissionSettingsResponseProjection.WorkforcePolicyResponseProjection.workforcePolicy", 0) <= maxDepth) {
            projectionDepthOnFields.put("PermissionSettingsResponseProjection.WorkforcePolicyResponseProjection.workforcePolicy", projectionDepthOnFields.getOrDefault("PermissionSettingsResponseProjection.WorkforcePolicyResponseProjection.workforcePolicy", 0) + 1);
            this.workforcePolicy(new WorkforcePolicyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PermissionSettingsResponseProjection.WorkforcePolicyResponseProjection.workforcePolicy", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PermissionSettingsResponseProjection.AutomationPolicyResponseProjection.automationPolicy", 0) <= maxDepth) {
            projectionDepthOnFields.put("PermissionSettingsResponseProjection.AutomationPolicyResponseProjection.automationPolicy", projectionDepthOnFields.getOrDefault("PermissionSettingsResponseProjection.AutomationPolicyResponseProjection.automationPolicy", 0) + 1);
            this.automationPolicy(new AutomationPolicyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PermissionSettingsResponseProjection.AutomationPolicyResponseProjection.automationPolicy", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PermissionSettingsResponseProjection.AssurancePolicyResponseProjection.assurancePolicy", 0) <= maxDepth) {
            projectionDepthOnFields.put("PermissionSettingsResponseProjection.AssurancePolicyResponseProjection.assurancePolicy", projectionDepthOnFields.getOrDefault("PermissionSettingsResponseProjection.AssurancePolicyResponseProjection.assurancePolicy", 0) + 1);
            this.assurancePolicy(new AssurancePolicyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PermissionSettingsResponseProjection.AssurancePolicyResponseProjection.assurancePolicy", 0)));
        }
        this.typename();
        return this;
    }

    public PermissionSettingsResponseProjection adminPolicy(AdministrativePolicyResponseProjection subProjection) {
        return adminPolicy(null, subProjection);
    }

    public PermissionSettingsResponseProjection adminPolicy(String alias, AdministrativePolicyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("adminPolicy").alias(alias).projection(subProjection));
        return this;
    }

    public PermissionSettingsResponseProjection inventoryPolicy(InventoryPolicyResponseProjection subProjection) {
        return inventoryPolicy(null, subProjection);
    }

    public PermissionSettingsResponseProjection inventoryPolicy(String alias, InventoryPolicyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("inventoryPolicy").alias(alias).projection(subProjection));
        return this;
    }

    public PermissionSettingsResponseProjection workforcePolicy(WorkforcePolicyResponseProjection subProjection) {
        return workforcePolicy(null, subProjection);
    }

    public PermissionSettingsResponseProjection workforcePolicy(String alias, WorkforcePolicyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workforcePolicy").alias(alias).projection(subProjection));
        return this;
    }

    public PermissionSettingsResponseProjection automationPolicy(AutomationPolicyResponseProjection subProjection) {
        return automationPolicy(null, subProjection);
    }

    public PermissionSettingsResponseProjection automationPolicy(String alias, AutomationPolicyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("automationPolicy").alias(alias).projection(subProjection));
        return this;
    }

    public PermissionSettingsResponseProjection assurancePolicy(AssurancePolicyResponseProjection subProjection) {
        return assurancePolicy(null, subProjection);
    }

    public PermissionSettingsResponseProjection assurancePolicy(String alias, AssurancePolicyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("assurancePolicy").alias(alias).projection(subProjection));
        return this;
    }

    public PermissionSettingsResponseProjection typename() {
        return typename(null);
    }

    public PermissionSettingsResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
