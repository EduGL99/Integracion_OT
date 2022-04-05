package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PermissionSettingsTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private AdministrativePolicyTO adminPolicy;
    @javax.validation.constraints.NotNull
    private InventoryPolicyTO inventoryPolicy;
    @javax.validation.constraints.NotNull
    private WorkforcePolicyTO workforcePolicy;
    @javax.validation.constraints.NotNull
    private AutomationPolicyTO automationPolicy;
    @javax.validation.constraints.NotNull
    private AssurancePolicyTO assurancePolicy;

    public PermissionSettingsTO() {
    }

    public PermissionSettingsTO(AdministrativePolicyTO adminPolicy, InventoryPolicyTO inventoryPolicy, WorkforcePolicyTO workforcePolicy, AutomationPolicyTO automationPolicy, AssurancePolicyTO assurancePolicy) {
        this.adminPolicy = adminPolicy;
        this.inventoryPolicy = inventoryPolicy;
        this.workforcePolicy = workforcePolicy;
        this.automationPolicy = automationPolicy;
        this.assurancePolicy = assurancePolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public AdministrativePolicyTO getAdminPolicy() {
        return adminPolicy;
    }

    public void setAdminPolicy(AdministrativePolicyTO adminPolicy) {
        this.adminPolicy = adminPolicy;
    }

    public InventoryPolicyTO getInventoryPolicy() {
        return inventoryPolicy;
    }

    public void setInventoryPolicy(InventoryPolicyTO inventoryPolicy) {
        this.inventoryPolicy = inventoryPolicy;
    }

    public WorkforcePolicyTO getWorkforcePolicy() {
        return workforcePolicy;
    }

    public void setWorkforcePolicy(WorkforcePolicyTO workforcePolicy) {
        this.workforcePolicy = workforcePolicy;
    }

    public AutomationPolicyTO getAutomationPolicy() {
        return automationPolicy;
    }

    public void setAutomationPolicy(AutomationPolicyTO automationPolicy) {
        this.automationPolicy = automationPolicy;
    }

    public AssurancePolicyTO getAssurancePolicy() {
        return assurancePolicy;
    }

    public void setAssurancePolicy(AssurancePolicyTO assurancePolicy) {
        this.assurancePolicy = assurancePolicy;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (adminPolicy != null) {
            joiner.add("adminPolicy: " + GraphQLRequestSerializer.getEntry(adminPolicy));
        }
        if (inventoryPolicy != null) {
            joiner.add("inventoryPolicy: " + GraphQLRequestSerializer.getEntry(inventoryPolicy));
        }
        if (workforcePolicy != null) {
            joiner.add("workforcePolicy: " + GraphQLRequestSerializer.getEntry(workforcePolicy));
        }
        if (automationPolicy != null) {
            joiner.add("automationPolicy: " + GraphQLRequestSerializer.getEntry(automationPolicy));
        }
        if (assurancePolicy != null) {
            joiner.add("assurancePolicy: " + GraphQLRequestSerializer.getEntry(assurancePolicy));
        }
        return joiner.toString();
    }

    public static class Builder {

        private AdministrativePolicyTO adminPolicy;
        private InventoryPolicyTO inventoryPolicy;
        private WorkforcePolicyTO workforcePolicy;
        private AutomationPolicyTO automationPolicy;
        private AssurancePolicyTO assurancePolicy;

        public Builder() {
        }

        public Builder setAdminPolicy(AdministrativePolicyTO adminPolicy) {
            this.adminPolicy = adminPolicy;
            return this;
        }

        public Builder setInventoryPolicy(InventoryPolicyTO inventoryPolicy) {
            this.inventoryPolicy = inventoryPolicy;
            return this;
        }

        public Builder setWorkforcePolicy(WorkforcePolicyTO workforcePolicy) {
            this.workforcePolicy = workforcePolicy;
            return this;
        }

        public Builder setAutomationPolicy(AutomationPolicyTO automationPolicy) {
            this.automationPolicy = automationPolicy;
            return this;
        }

        public Builder setAssurancePolicy(AssurancePolicyTO assurancePolicy) {
            this.assurancePolicy = assurancePolicy;
            return this;
        }


        public PermissionSettingsTO build() {
            return new PermissionSettingsTO(adminPolicy, inventoryPolicy, workforcePolicy, automationPolicy, assurancePolicy);
        }

    }
}
