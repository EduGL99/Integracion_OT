package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ProjectType
 */

public class ProjectTypeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ProjectTypeResponseProjection() {
    }

    public ProjectTypeResponseProjection all$() {
        return all$(3);
    }

    public ProjectTypeResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("ProjectTypeResponseProjection.ProjectResponseProjection.projects", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectTypeResponseProjection.ProjectResponseProjection.projects", projectionDepthOnFields.getOrDefault("ProjectTypeResponseProjection.ProjectResponseProjection.projects", 0) + 1);
            this.projects(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectTypeResponseProjection.ProjectResponseProjection.projects", 0)));
        }
        this.numberOfProjects();
        if (projectionDepthOnFields.getOrDefault("ProjectTypeResponseProjection.PropertyTypeResponseProjection.properties", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectTypeResponseProjection.PropertyTypeResponseProjection.properties", projectionDepthOnFields.getOrDefault("ProjectTypeResponseProjection.PropertyTypeResponseProjection.properties", 0) + 1);
            this.properties(new PropertyTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectTypeResponseProjection.PropertyTypeResponseProjection.properties", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProjectTypeResponseProjection.WorkOrderDefinitionResponseProjection.workOrders", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectTypeResponseProjection.WorkOrderDefinitionResponseProjection.workOrders", projectionDepthOnFields.getOrDefault("ProjectTypeResponseProjection.WorkOrderDefinitionResponseProjection.workOrders", 0) + 1);
            this.workOrders(new WorkOrderDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectTypeResponseProjection.WorkOrderDefinitionResponseProjection.workOrders", 0)));
        }
        this.typename();
        return this;
    }

    public ProjectTypeResponseProjection id() {
        return id(null);
    }

    public ProjectTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ProjectTypeResponseProjection name() {
        return name(null);
    }

    public ProjectTypeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ProjectTypeResponseProjection description() {
        return description(null);
    }

    public ProjectTypeResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ProjectTypeResponseProjection projects(ProjectResponseProjection subProjection) {
        return projects(null, subProjection);
    }

    public ProjectTypeResponseProjection projects(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projects").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectTypeResponseProjection numberOfProjects() {
        return numberOfProjects(null);
    }

    public ProjectTypeResponseProjection numberOfProjects(String alias) {
        fields.add(new GraphQLResponseField("numberOfProjects").alias(alias));
        return this;
    }

    public ProjectTypeResponseProjection properties(PropertyTypeResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public ProjectTypeResponseProjection properties(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectTypeResponseProjection workOrders(WorkOrderDefinitionResponseProjection subProjection) {
        return workOrders(null, subProjection);
    }

    public ProjectTypeResponseProjection workOrders(String alias, WorkOrderDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrders").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectTypeResponseProjection typename() {
        return typename(null);
    }

    public ProjectTypeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
