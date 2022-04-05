package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Activity
 */

public class ActivityResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ActivityResponseProjection() {
    }

    public ActivityResponseProjection all$() {
        return all$(3);
    }

    public ActivityResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("ActivityResponseProjection.UserResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActivityResponseProjection.UserResponseProjection.author", projectionDepthOnFields.getOrDefault("ActivityResponseProjection.UserResponseProjection.author", 0) + 1);
            this.author(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActivityResponseProjection.UserResponseProjection.author", 0)));
        }
        this.isCreate();
        this.activityType();
        if (projectionDepthOnFields.getOrDefault("ActivityResponseProjection.NodeResponseProjection.newRelatedNode", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActivityResponseProjection.NodeResponseProjection.newRelatedNode", projectionDepthOnFields.getOrDefault("ActivityResponseProjection.NodeResponseProjection.newRelatedNode", 0) + 1);
            this.newRelatedNode(new NodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActivityResponseProjection.NodeResponseProjection.newRelatedNode", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ActivityResponseProjection.NodeResponseProjection.oldRelatedNode", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActivityResponseProjection.NodeResponseProjection.oldRelatedNode", projectionDepthOnFields.getOrDefault("ActivityResponseProjection.NodeResponseProjection.oldRelatedNode", 0) + 1);
            this.oldRelatedNode(new NodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActivityResponseProjection.NodeResponseProjection.oldRelatedNode", 0)));
        }
        this.oldValue();
        this.newValue();
        this.createTime();
        if (projectionDepthOnFields.getOrDefault("ActivityResponseProjection.WorkOrderResponseProjection.workOrder", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActivityResponseProjection.WorkOrderResponseProjection.workOrder", projectionDepthOnFields.getOrDefault("ActivityResponseProjection.WorkOrderResponseProjection.workOrder", 0) + 1);
            this.workOrder(new WorkOrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActivityResponseProjection.WorkOrderResponseProjection.workOrder", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ActivityResponseProjection.ClockDetailsResponseProjection.clockDetails", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActivityResponseProjection.ClockDetailsResponseProjection.clockDetails", projectionDepthOnFields.getOrDefault("ActivityResponseProjection.ClockDetailsResponseProjection.clockDetails", 0) + 1);
            this.clockDetails(new ClockDetailsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActivityResponseProjection.ClockDetailsResponseProjection.clockDetails", 0)));
        }
        this.typename();
        return this;
    }

    public ActivityResponseProjection id() {
        return id(null);
    }

    public ActivityResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ActivityResponseProjection author(UserResponseProjection subProjection) {
        return author(null, subProjection);
    }

    public ActivityResponseProjection author(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection));
        return this;
    }

    public ActivityResponseProjection isCreate() {
        return isCreate(null);
    }

    public ActivityResponseProjection isCreate(String alias) {
        fields.add(new GraphQLResponseField("isCreate").alias(alias));
        return this;
    }

    public ActivityResponseProjection activityType() {
        return activityType(null);
    }

    public ActivityResponseProjection activityType(String alias) {
        fields.add(new GraphQLResponseField("activityType").alias(alias));
        return this;
    }

    public ActivityResponseProjection newRelatedNode(NodeResponseProjection subProjection) {
        return newRelatedNode(null, subProjection);
    }

    public ActivityResponseProjection newRelatedNode(String alias, NodeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("newRelatedNode").alias(alias).projection(subProjection));
        return this;
    }

    public ActivityResponseProjection oldRelatedNode(NodeResponseProjection subProjection) {
        return oldRelatedNode(null, subProjection);
    }

    public ActivityResponseProjection oldRelatedNode(String alias, NodeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("oldRelatedNode").alias(alias).projection(subProjection));
        return this;
    }

    public ActivityResponseProjection oldValue() {
        return oldValue(null);
    }

    public ActivityResponseProjection oldValue(String alias) {
        fields.add(new GraphQLResponseField("oldValue").alias(alias));
        return this;
    }

    public ActivityResponseProjection newValue() {
        return newValue(null);
    }

    public ActivityResponseProjection newValue(String alias) {
        fields.add(new GraphQLResponseField("newValue").alias(alias));
        return this;
    }

    public ActivityResponseProjection createTime() {
        return createTime(null);
    }

    public ActivityResponseProjection createTime(String alias) {
        fields.add(new GraphQLResponseField("createTime").alias(alias));
        return this;
    }

    public ActivityResponseProjection workOrder(WorkOrderResponseProjection subProjection) {
        return workOrder(null, subProjection);
    }

    public ActivityResponseProjection workOrder(String alias, WorkOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrder").alias(alias).projection(subProjection));
        return this;
    }

    public ActivityResponseProjection clockDetails(ClockDetailsResponseProjection subProjection) {
        return clockDetails(null, subProjection);
    }

    public ActivityResponseProjection clockDetails(String alias, ClockDetailsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("clockDetails").alias(alias).projection(subProjection));
        return this;
    }

    public ActivityResponseProjection typename() {
        return typename(null);
    }

    public ActivityResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
