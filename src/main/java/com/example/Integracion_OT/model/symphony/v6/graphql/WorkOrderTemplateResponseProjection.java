package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for WorkOrderTemplate
 */

public class WorkOrderTemplateResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WorkOrderTemplateResponseProjection() {
    }

    public WorkOrderTemplateResponseProjection all$() {
        return all$(3);
    }

    public WorkOrderTemplateResponseProjection all$(int maxDepth) {
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("WorkOrderTemplateResponseProjection.PropertyTypeResponseProjection.propertyTypes", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderTemplateResponseProjection.PropertyTypeResponseProjection.propertyTypes", projectionDepthOnFields.getOrDefault("WorkOrderTemplateResponseProjection.PropertyTypeResponseProjection.propertyTypes", 0) + 1);
            this.propertyTypes(new PropertyTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderTemplateResponseProjection.PropertyTypeResponseProjection.propertyTypes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkOrderTemplateResponseProjection.CheckListCategoryDefinitionResponseProjection.checkListCategoryDefinitions", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderTemplateResponseProjection.CheckListCategoryDefinitionResponseProjection.checkListCategoryDefinitions", projectionDepthOnFields.getOrDefault("WorkOrderTemplateResponseProjection.CheckListCategoryDefinitionResponseProjection.checkListCategoryDefinitions", 0) + 1);
            this.checkListCategoryDefinitions(new CheckListCategoryDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderTemplateResponseProjection.CheckListCategoryDefinitionResponseProjection.checkListCategoryDefinitions", 0)));
        }
        this.assigneeCanCompleteWorkOrder();
        this.typename();
        return this;
    }

    public WorkOrderTemplateResponseProjection name() {
        return name(null);
    }

    public WorkOrderTemplateResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public WorkOrderTemplateResponseProjection description() {
        return description(null);
    }

    public WorkOrderTemplateResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public WorkOrderTemplateResponseProjection propertyTypes(PropertyTypeResponseProjection subProjection) {
        return propertyTypes(null, subProjection);
    }

    public WorkOrderTemplateResponseProjection propertyTypes(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("propertyTypes").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderTemplateResponseProjection checkListCategoryDefinitions(CheckListCategoryDefinitionResponseProjection subProjection) {
        return checkListCategoryDefinitions(null, subProjection);
    }

    public WorkOrderTemplateResponseProjection checkListCategoryDefinitions(String alias, CheckListCategoryDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("checkListCategoryDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderTemplateResponseProjection assigneeCanCompleteWorkOrder() {
        return assigneeCanCompleteWorkOrder(null);
    }

    public WorkOrderTemplateResponseProjection assigneeCanCompleteWorkOrder(String alias) {
        fields.add(new GraphQLResponseField("assigneeCanCompleteWorkOrder").alias(alias));
        return this;
    }

    public WorkOrderTemplateResponseProjection typename() {
        return typename(null);
    }

    public WorkOrderTemplateResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
