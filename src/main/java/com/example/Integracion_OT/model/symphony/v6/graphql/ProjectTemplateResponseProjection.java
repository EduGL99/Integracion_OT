package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ProjectTemplate
 */

public class ProjectTemplateResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ProjectTemplateResponseProjection() {
    }

    public ProjectTemplateResponseProjection all$() {
        return all$(3);
    }

    public ProjectTemplateResponseProjection all$(int maxDepth) {
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("ProjectTemplateResponseProjection.PropertyTypeResponseProjection.properties", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectTemplateResponseProjection.PropertyTypeResponseProjection.properties", projectionDepthOnFields.getOrDefault("ProjectTemplateResponseProjection.PropertyTypeResponseProjection.properties", 0) + 1);
            this.properties(new PropertyTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectTemplateResponseProjection.PropertyTypeResponseProjection.properties", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProjectTemplateResponseProjection.WorkOrderDefinitionResponseProjection.workOrders", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectTemplateResponseProjection.WorkOrderDefinitionResponseProjection.workOrders", projectionDepthOnFields.getOrDefault("ProjectTemplateResponseProjection.WorkOrderDefinitionResponseProjection.workOrders", 0) + 1);
            this.workOrders(new WorkOrderDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectTemplateResponseProjection.WorkOrderDefinitionResponseProjection.workOrders", 0)));
        }
        this.typename();
        return this;
    }

    public ProjectTemplateResponseProjection name() {
        return name(null);
    }

    public ProjectTemplateResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ProjectTemplateResponseProjection description() {
        return description(null);
    }

    public ProjectTemplateResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ProjectTemplateResponseProjection properties(PropertyTypeResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public ProjectTemplateResponseProjection properties(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectTemplateResponseProjection workOrders(WorkOrderDefinitionResponseProjection subProjection) {
        return workOrders(null, subProjection);
    }

    public ProjectTemplateResponseProjection workOrders(String alias, WorkOrderDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrders").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectTemplateResponseProjection typename() {
        return typename(null);
    }

    public ProjectTemplateResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
