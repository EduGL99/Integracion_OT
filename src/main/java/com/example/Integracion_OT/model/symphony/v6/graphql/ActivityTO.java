package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActivityTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    private UserTO author;
    private boolean isCreate;
    @javax.validation.constraints.NotNull
    private ActivityFieldTO activityType;
    private NodeTO newRelatedNode;
    private NodeTO oldRelatedNode;
    private String oldValue;
    private String newValue;
    @javax.validation.constraints.NotNull
    private String createTime;
    @javax.validation.constraints.NotNull
    private WorkOrderTO workOrder;
    private ClockDetailsTO clockDetails;

    public ActivityTO() {
    }

    public ActivityTO(String id, UserTO author, boolean isCreate, ActivityFieldTO activityType, NodeTO newRelatedNode, NodeTO oldRelatedNode, String oldValue, String newValue, String createTime, WorkOrderTO workOrder, ClockDetailsTO clockDetails) {
        this.id = id;
        this.author = author;
        this.isCreate = isCreate;
        this.activityType = activityType;
        this.newRelatedNode = newRelatedNode;
        this.oldRelatedNode = oldRelatedNode;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.createTime = createTime;
        this.workOrder = workOrder;
        this.clockDetails = clockDetails;
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

    public UserTO getAuthor() {
        return author;
    }

    public void setAuthor(UserTO author) {
        this.author = author;
    }

    public boolean getIsCreate() {
        return isCreate;
    }

    public void setIsCreate(boolean isCreate) {
        this.isCreate = isCreate;
    }

    public ActivityFieldTO getActivityType() {
        return activityType;
    }

    public void setActivityType(ActivityFieldTO activityType) {
        this.activityType = activityType;
    }

    public NodeTO getNewRelatedNode() {
        return newRelatedNode;
    }

    public void setNewRelatedNode(NodeTO newRelatedNode) {
        this.newRelatedNode = newRelatedNode;
    }

    public NodeTO getOldRelatedNode() {
        return oldRelatedNode;
    }

    public void setOldRelatedNode(NodeTO oldRelatedNode) {
        this.oldRelatedNode = oldRelatedNode;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public WorkOrderTO getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(WorkOrderTO workOrder) {
        this.workOrder = workOrder;
    }

    public ClockDetailsTO getClockDetails() {
        return clockDetails;
    }

    public void setClockDetails(ClockDetailsTO clockDetails) {
        this.clockDetails = clockDetails;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (author != null) {
            joiner.add("author: " + GraphQLRequestSerializer.getEntry(author));
        }
        joiner.add("isCreate: " + GraphQLRequestSerializer.getEntry(isCreate));
        if (activityType != null) {
            joiner.add("activityType: " + GraphQLRequestSerializer.getEntry(activityType));
        }
        if (newRelatedNode != null) {
            joiner.add("newRelatedNode: " + GraphQLRequestSerializer.getEntry(newRelatedNode));
        }
        if (oldRelatedNode != null) {
            joiner.add("oldRelatedNode: " + GraphQLRequestSerializer.getEntry(oldRelatedNode));
        }
        if (oldValue != null) {
            joiner.add("oldValue: " + GraphQLRequestSerializer.getEntry(oldValue));
        }
        if (newValue != null) {
            joiner.add("newValue: " + GraphQLRequestSerializer.getEntry(newValue));
        }
        if (createTime != null) {
            joiner.add("createTime: " + GraphQLRequestSerializer.getEntry(createTime));
        }
        if (workOrder != null) {
            joiner.add("workOrder: " + GraphQLRequestSerializer.getEntry(workOrder));
        }
        if (clockDetails != null) {
            joiner.add("clockDetails: " + GraphQLRequestSerializer.getEntry(clockDetails));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private UserTO author;
        private boolean isCreate;
        private ActivityFieldTO activityType;
        private NodeTO newRelatedNode;
        private NodeTO oldRelatedNode;
        private String oldValue;
        private String newValue;
        private String createTime;
        private WorkOrderTO workOrder;
        private ClockDetailsTO clockDetails;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setAuthor(UserTO author) {
            this.author = author;
            return this;
        }

        public Builder setIsCreate(boolean isCreate) {
            this.isCreate = isCreate;
            return this;
        }

        public Builder setActivityType(ActivityFieldTO activityType) {
            this.activityType = activityType;
            return this;
        }

        public Builder setNewRelatedNode(NodeTO newRelatedNode) {
            this.newRelatedNode = newRelatedNode;
            return this;
        }

        public Builder setOldRelatedNode(NodeTO oldRelatedNode) {
            this.oldRelatedNode = oldRelatedNode;
            return this;
        }

        public Builder setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }

        public Builder setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setWorkOrder(WorkOrderTO workOrder) {
            this.workOrder = workOrder;
            return this;
        }

        public Builder setClockDetails(ClockDetailsTO clockDetails) {
            this.clockDetails = clockDetails;
            return this;
        }


        public ActivityTO build() {
            return new ActivityTO(id, author, isCreate, activityType, newRelatedNode, oldRelatedNode, oldValue, newValue, createTime, workOrder, clockDetails);
        }

    }
}
