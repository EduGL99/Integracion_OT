package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderTypeTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTypeTO> propertyTypes;
    private int numberOfWorkOrders;
    @javax.validation.constraints.NotNull
    private java.util.List<CheckListCategoryDefinitionTO> checkListCategoryDefinitions;
    private Boolean assigneeCanCompleteWorkOrder;

    public WorkOrderTypeTO() {
    }

    public WorkOrderTypeTO(String id, String name, String description, java.util.List<PropertyTypeTO> propertyTypes, int numberOfWorkOrders, java.util.List<CheckListCategoryDefinitionTO> checkListCategoryDefinitions, Boolean assigneeCanCompleteWorkOrder) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.propertyTypes = propertyTypes;
        this.numberOfWorkOrders = numberOfWorkOrders;
        this.checkListCategoryDefinitions = checkListCategoryDefinitions;
        this.assigneeCanCompleteWorkOrder = assigneeCanCompleteWorkOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The id of the object.
     */
    public String getId() {
        return id;
    }

    /**
     * The id of the object.
     */
    public void setId(String id) {
        this.id = id;
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

    public int getNumberOfWorkOrders() {
        return numberOfWorkOrders;
    }

    public void setNumberOfWorkOrders(int numberOfWorkOrders) {
        this.numberOfWorkOrders = numberOfWorkOrders;
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
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (propertyTypes != null) {
            joiner.add("propertyTypes: " + GraphQLRequestSerializer.getEntry(propertyTypes));
        }
        joiner.add("numberOfWorkOrders: " + GraphQLRequestSerializer.getEntry(numberOfWorkOrders));
        if (checkListCategoryDefinitions != null) {
            joiner.add("checkListCategoryDefinitions: " + GraphQLRequestSerializer.getEntry(checkListCategoryDefinitions));
        }
        if (assigneeCanCompleteWorkOrder != null) {
            joiner.add("assigneeCanCompleteWorkOrder: " + GraphQLRequestSerializer.getEntry(assigneeCanCompleteWorkOrder));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private java.util.List<PropertyTypeTO> propertyTypes;
        private int numberOfWorkOrders;
        private java.util.List<CheckListCategoryDefinitionTO> checkListCategoryDefinitions;
        private Boolean assigneeCanCompleteWorkOrder;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
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

        public Builder setNumberOfWorkOrders(int numberOfWorkOrders) {
            this.numberOfWorkOrders = numberOfWorkOrders;
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


        public WorkOrderTypeTO build() {
            return new WorkOrderTypeTO(id, name, description, propertyTypes, numberOfWorkOrders, checkListCategoryDefinitions, assigneeCanCompleteWorkOrder);
        }

    }
}
