package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for WorkOrderType
 */

public class WorkOrderTypeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WorkOrderTypeResponseProjection() {
    }

    public WorkOrderTypeResponseProjection all$() {
        return all$(3);
    }

    public WorkOrderTypeResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("WorkOrderTypeResponseProjection.PropertyTypeResponseProjection.propertyTypes", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderTypeResponseProjection.PropertyTypeResponseProjection.propertyTypes", projectionDepthOnFields.getOrDefault("WorkOrderTypeResponseProjection.PropertyTypeResponseProjection.propertyTypes", 0) + 1);
            this.propertyTypes(new PropertyTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderTypeResponseProjection.PropertyTypeResponseProjection.propertyTypes", 0)));
        }
        this.numberOfWorkOrders();
        if (projectionDepthOnFields.getOrDefault("WorkOrderTypeResponseProjection.CheckListCategoryDefinitionResponseProjection.checkListCategoryDefinitions", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderTypeResponseProjection.CheckListCategoryDefinitionResponseProjection.checkListCategoryDefinitions", projectionDepthOnFields.getOrDefault("WorkOrderTypeResponseProjection.CheckListCategoryDefinitionResponseProjection.checkListCategoryDefinitions", 0) + 1);
            this.checkListCategoryDefinitions(new CheckListCategoryDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderTypeResponseProjection.CheckListCategoryDefinitionResponseProjection.checkListCategoryDefinitions", 0)));
        }
        this.assigneeCanCompleteWorkOrder();
        this.typename();
        return this;
    }

    public WorkOrderTypeResponseProjection id() {
        return id(null);
    }

    public WorkOrderTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public WorkOrderTypeResponseProjection name() {
        return name(null);
    }

    public WorkOrderTypeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public WorkOrderTypeResponseProjection description() {
        return description(null);
    }

    public WorkOrderTypeResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public WorkOrderTypeResponseProjection propertyTypes(PropertyTypeResponseProjection subProjection) {
        return propertyTypes(null, subProjection);
    }

    public WorkOrderTypeResponseProjection propertyTypes(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("propertyTypes").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderTypeResponseProjection numberOfWorkOrders() {
        return numberOfWorkOrders(null);
    }

    public WorkOrderTypeResponseProjection numberOfWorkOrders(String alias) {
        fields.add(new GraphQLResponseField("numberOfWorkOrders").alias(alias));
        return this;
    }

    public WorkOrderTypeResponseProjection checkListCategoryDefinitions(CheckListCategoryDefinitionResponseProjection subProjection) {
        return checkListCategoryDefinitions(null, subProjection);
    }

    public WorkOrderTypeResponseProjection checkListCategoryDefinitions(String alias, CheckListCategoryDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("checkListCategoryDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderTypeResponseProjection assigneeCanCompleteWorkOrder() {
        return assigneeCanCompleteWorkOrder(null);
    }

    public WorkOrderTypeResponseProjection assigneeCanCompleteWorkOrder(String alias) {
        fields.add(new GraphQLResponseField("assigneeCanCompleteWorkOrder").alias(alias));
        return this;
    }

    public WorkOrderTypeResponseProjection typename() {
        return typename(null);
    }

    public WorkOrderTypeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
