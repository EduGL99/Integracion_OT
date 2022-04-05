package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for WorkOrderDefinition
 */

public class WorkOrderDefinitionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WorkOrderDefinitionResponseProjection() {
    }

    public WorkOrderDefinitionResponseProjection all$() {
        return all$(3);
    }

    public WorkOrderDefinitionResponseProjection all$(int maxDepth) {
        this.id();
        this.index();
        if (projectionDepthOnFields.getOrDefault("WorkOrderDefinitionResponseProjection.WorkOrderTypeResponseProjection.type", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderDefinitionResponseProjection.WorkOrderTypeResponseProjection.type", projectionDepthOnFields.getOrDefault("WorkOrderDefinitionResponseProjection.WorkOrderTypeResponseProjection.type", 0) + 1);
            this.type(new WorkOrderTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderDefinitionResponseProjection.WorkOrderTypeResponseProjection.type", 0)));
        }
        this.typename();
        return this;
    }

    public WorkOrderDefinitionResponseProjection id() {
        return id(null);
    }

    public WorkOrderDefinitionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public WorkOrderDefinitionResponseProjection index() {
        return index(null);
    }

    public WorkOrderDefinitionResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public WorkOrderDefinitionResponseProjection type(WorkOrderTypeResponseProjection subProjection) {
        return type(null, subProjection);
    }

    public WorkOrderDefinitionResponseProjection type(String alias, WorkOrderTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("type").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderDefinitionResponseProjection typename() {
        return typename(null);
    }

    public WorkOrderDefinitionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
