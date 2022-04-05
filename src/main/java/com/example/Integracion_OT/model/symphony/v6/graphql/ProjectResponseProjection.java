package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Project
 */

public class ProjectResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ProjectResponseProjection() {
    }

    public ProjectResponseProjection all$() {
        return all$(3);
    }

    public ProjectResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        this.priority();
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.UserResponseProjection.createdBy", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectResponseProjection.UserResponseProjection.createdBy", projectionDepthOnFields.getOrDefault("ProjectResponseProjection.UserResponseProjection.createdBy", 0) + 1);
            this.createdBy(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.UserResponseProjection.createdBy", 0)));
        }
        this.createTime();
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectTypeResponseProjection.type", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectResponseProjection.ProjectTypeResponseProjection.type", projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectTypeResponseProjection.type", 0) + 1);
            this.type(new ProjectTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectTypeResponseProjection.type", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectTemplateResponseProjection.template", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectResponseProjection.ProjectTemplateResponseProjection.template", projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectTemplateResponseProjection.template", 0) + 1);
            this.template(new ProjectTemplateResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectTemplateResponseProjection.template", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.LocationResponseProjection.location", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectResponseProjection.LocationResponseProjection.location", projectionDepthOnFields.getOrDefault("ProjectResponseProjection.LocationResponseProjection.location", 0) + 1);
            this.location(new LocationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.LocationResponseProjection.location", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.WorkOrderResponseProjection.workOrders", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectResponseProjection.WorkOrderResponseProjection.workOrders", projectionDepthOnFields.getOrDefault("ProjectResponseProjection.WorkOrderResponseProjection.workOrders", 0) + 1);
            this.workOrders(new WorkOrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.WorkOrderResponseProjection.workOrders", 0)));
        }
        this.numberOfWorkOrders();
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.PropertyResponseProjection.properties", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectResponseProjection.PropertyResponseProjection.properties", projectionDepthOnFields.getOrDefault("ProjectResponseProjection.PropertyResponseProjection.properties", 0) + 1);
            this.properties(new PropertyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.PropertyResponseProjection.properties", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.CommentResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectResponseProjection.CommentResponseProjection.comments", projectionDepthOnFields.getOrDefault("ProjectResponseProjection.CommentResponseProjection.comments", 0) + 1);
            this.comments(new CommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.CommentResponseProjection.comments", 0)));
        }
        this.typename();
        return this;
    }

    public ProjectResponseProjection id() {
        return id(null);
    }

    public ProjectResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ProjectResponseProjection name() {
        return name(null);
    }

    public ProjectResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ProjectResponseProjection description() {
        return description(null);
    }

    public ProjectResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ProjectResponseProjection priority() {
        return priority(null);
    }

    public ProjectResponseProjection priority(String alias) {
        fields.add(new GraphQLResponseField("priority").alias(alias));
        return this;
    }

    public ProjectResponseProjection createdBy(UserResponseProjection subProjection) {
        return createdBy(null, subProjection);
    }

    public ProjectResponseProjection createdBy(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("createdBy").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection createTime() {
        return createTime(null);
    }

    public ProjectResponseProjection createTime(String alias) {
        fields.add(new GraphQLResponseField("createTime").alias(alias));
        return this;
    }

    public ProjectResponseProjection type(ProjectTypeResponseProjection subProjection) {
        return type(null, subProjection);
    }

    public ProjectResponseProjection type(String alias, ProjectTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("type").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection template(ProjectTemplateResponseProjection subProjection) {
        return template(null, subProjection);
    }

    public ProjectResponseProjection template(String alias, ProjectTemplateResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("template").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection location(LocationResponseProjection subProjection) {
        return location(null, subProjection);
    }

    public ProjectResponseProjection location(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("location").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection workOrders(WorkOrderResponseProjection subProjection) {
        return workOrders(null, subProjection);
    }

    public ProjectResponseProjection workOrders(String alias, WorkOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrders").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection numberOfWorkOrders() {
        return numberOfWorkOrders(null);
    }

    public ProjectResponseProjection numberOfWorkOrders(String alias) {
        fields.add(new GraphQLResponseField("numberOfWorkOrders").alias(alias));
        return this;
    }

    public ProjectResponseProjection properties(PropertyResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public ProjectResponseProjection properties(String alias, PropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection comments(CommentResponseProjection subProjection) {
        return comments(null, subProjection);
    }

    public ProjectResponseProjection comments(String alias, CommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comments").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection typename() {
        return typename(null);
    }

    public ProjectResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
