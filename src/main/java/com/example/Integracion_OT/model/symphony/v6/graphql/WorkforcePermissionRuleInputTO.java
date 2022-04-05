package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkforcePermissionRuleInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private PermissionValueTO isAllowed;
    @javax.validation.constraints.NotNull
    private java.util.List<String> projectTypeIds;
    @javax.validation.constraints.NotNull
    private java.util.List<String> workOrderTypeIds;
    @javax.validation.constraints.NotNull
    private java.util.List<String> organizationIds;

    public WorkforcePermissionRuleInputTO() {
    }

    public WorkforcePermissionRuleInputTO(PermissionValueTO isAllowed, java.util.List<String> projectTypeIds, java.util.List<String> workOrderTypeIds, java.util.List<String> organizationIds) {
        this.isAllowed = isAllowed;
        this.projectTypeIds = projectTypeIds;
        this.workOrderTypeIds = workOrderTypeIds;
        this.organizationIds = organizationIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public PermissionValueTO getIsAllowed() {
        return isAllowed;
    }

    public void setIsAllowed(PermissionValueTO isAllowed) {
        this.isAllowed = isAllowed;
    }

    public java.util.List<String> getProjectTypeIds() {
        return projectTypeIds;
    }

    public void setProjectTypeIds(java.util.List<String> projectTypeIds) {
        this.projectTypeIds = projectTypeIds;
    }

    public java.util.List<String> getWorkOrderTypeIds() {
        return workOrderTypeIds;
    }

    public void setWorkOrderTypeIds(java.util.List<String> workOrderTypeIds) {
        this.workOrderTypeIds = workOrderTypeIds;
    }

    public java.util.List<String> getOrganizationIds() {
        return organizationIds;
    }

    public void setOrganizationIds(java.util.List<String> organizationIds) {
        this.organizationIds = organizationIds;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (isAllowed != null) {
            joiner.add("isAllowed: " + GraphQLRequestSerializer.getEntry(isAllowed));
        }
        if (projectTypeIds != null) {
            joiner.add("projectTypeIds: " + GraphQLRequestSerializer.getEntry(projectTypeIds));
        }
        if (workOrderTypeIds != null) {
            joiner.add("workOrderTypeIds: " + GraphQLRequestSerializer.getEntry(workOrderTypeIds));
        }
        if (organizationIds != null) {
            joiner.add("organizationIds: " + GraphQLRequestSerializer.getEntry(organizationIds));
        }
        return joiner.toString();
    }

    public static class Builder {

        private PermissionValueTO isAllowed;
        private java.util.List<String> projectTypeIds;
        private java.util.List<String> workOrderTypeIds;
        private java.util.List<String> organizationIds;

        public Builder() {
        }

        public Builder setIsAllowed(PermissionValueTO isAllowed) {
            this.isAllowed = isAllowed;
            return this;
        }

        public Builder setProjectTypeIds(java.util.List<String> projectTypeIds) {
            this.projectTypeIds = projectTypeIds;
            return this;
        }

        public Builder setWorkOrderTypeIds(java.util.List<String> workOrderTypeIds) {
            this.workOrderTypeIds = workOrderTypeIds;
            return this;
        }

        public Builder setOrganizationIds(java.util.List<String> organizationIds) {
            this.organizationIds = organizationIds;
            return this;
        }


        public WorkforcePermissionRuleInputTO build() {
            return new WorkforcePermissionRuleInputTO(isAllowed, projectTypeIds, workOrderTypeIds, organizationIds);
        }

    }
}
