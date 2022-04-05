package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderTemplateTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTypeTO> propertyTypes;
    @javax.validation.constraints.NotNull
    private java.util.List<CheckListCategoryDefinitionTO> checkListCategoryDefinitions;
    private Boolean assigneeCanCompleteWorkOrder;

    public WorkOrderTemplateTO() {
    }

    public WorkOrderTemplateTO(String name, String description, java.util.List<PropertyTypeTO> propertyTypes, java.util.List<CheckListCategoryDefinitionTO> checkListCategoryDefinitions, Boolean assigneeCanCompleteWorkOrder) {
        this.name = name;
        this.description = description;
        this.propertyTypes = propertyTypes;
        this.checkListCategoryDefinitions = checkListCategoryDefinitions;
        this.assigneeCanCompleteWorkOrder = assigneeCanCompleteWorkOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.List<PropertyTypeTO> getPropertyTypes() {
        return propertyTypes;
    }

    public void setPropertyTypes(java.util.List<PropertyTypeTO> propertyTypes) {
        this.propertyTypes = propertyTypes;
    }

    public java.util.List<CheckListCategoryDefinitionTO> getCheckListCategoryDefinitions() {
        return checkListCategoryDefinitions;
    }

    public void setCheckListCategoryDefinitions(java.util.List<CheckListCategoryDefinitionTO> checkListCategoryDefinitions) {
        this.checkListCategoryDefinitions = checkListCategoryDefinitions;
    }

    public Boolean getAssigneeCanCompleteWorkOrder() {
        return assigneeCanCompleteWorkOrder;
    }

    public void setAssigneeCanCompleteWorkOrder(Boolean assigneeCanCompleteWorkOrder) {
        this.assigneeCanCompleteWorkOrder = assigneeCanCompleteWorkOrder;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (propertyTypes != null) {
            joiner.add("propertyTypes: " + GraphQLRequestSerializer.getEntry(propertyTypes));
        }
        if (checkListCategoryDefinitions != null) {
            joiner.add("checkListCategoryDefinitions: " + GraphQLRequestSerializer.getEntry(checkListCategoryDefinitions));
        }
        if (assigneeCanCompleteWorkOrder != null) {
            joiner.add("assigneeCanCompleteWorkOrder: " + GraphQLRequestSerializer.getEntry(assigneeCanCompleteWorkOrder));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String name;
        private String description;
        private java.util.List<PropertyTypeTO> propertyTypes;
        private java.util.List<CheckListCategoryDefinitionTO> checkListCategoryDefinitions;
        private Boolean assigneeCanCompleteWorkOrder;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setPropertyTypes(java.util.List<PropertyTypeTO> propertyTypes) {
            this.propertyTypes = propertyTypes;
            return this;
        }

        public Builder setCheckListCategoryDefinitions(java.util.List<CheckListCategoryDefinitionTO> checkListCategoryDefinitions) {
            this.checkListCategoryDefinitions = checkListCategoryDefinitions;
            return this;
        }

        public Builder setAssigneeCanCompleteWorkOrder(Boolean assigneeCanCompleteWorkOrder) {
            this.assigneeCanCompleteWorkOrder = assigneeCanCompleteWorkOrder;
            return this;
        }


        public WorkOrderTemplateTO build() {
            return new WorkOrderTemplateTO(name, description, propertyTypes, checkListCategoryDefinitions, assigneeCanCompleteWorkOrder);
        }

    }
}
