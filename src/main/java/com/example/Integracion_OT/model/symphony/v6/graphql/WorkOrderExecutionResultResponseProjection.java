package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for WorkOrderExecutionResult
 */

public class WorkOrderExecutionResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WorkOrderExecutionResultResponseProjection() {
    }

    public WorkOrderExecutionResultResponseProjection all$() {
        return all$(3);
    }

    public WorkOrderExecutionResultResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("WorkOrderExecutionResultResponseProjection.EquipmentResponseProjection.equipmentAdded", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderExecutionResultResponseProjection.EquipmentResponseProjection.equipmentAdded", projectionDepthOnFields.getOrDefault("WorkOrderExecutionResultResponseProjection.EquipmentResponseProjection.equipmentAdded", 0) + 1);
            this.equipmentAdded(new EquipmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderExecutionResultResponseProjection.EquipmentResponseProjection.equipmentAdded", 0)));
        }
        this.equipmentRemoved();
        if (projectionDepthOnFields.getOrDefault("WorkOrderExecutionResultResponseProjection.LinkResponseProjection.linkAdded", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderExecutionResultResponseProjection.LinkResponseProjection.linkAdded", projectionDepthOnFields.getOrDefault("WorkOrderExecutionResultResponseProjection.LinkResponseProjection.linkAdded", 0) + 1);
            this.linkAdded(new LinkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderExecutionResultResponseProjection.LinkResponseProjection.linkAdded", 0)));
        }
        this.linkRemoved();
        this.typename();
        return this;
    }

    public WorkOrderExecutionResultResponseProjection id() {
        return id(null);
    }

    public WorkOrderExecutionResultResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public WorkOrderExecutionResultResponseProjection name() {
        return name(null);
    }

    public WorkOrderExecutionResultResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public WorkOrderExecutionResultResponseProjection equipmentAdded(EquipmentResponseProjection subProjection) {
        return equipmentAdded(null, subProjection);
    }

    public WorkOrderExecutionResultResponseProjection equipmentAdded(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipmentAdded").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderExecutionResultResponseProjection equipmentRemoved() {
        return equipmentRemoved(null);
    }

    public WorkOrderExecutionResultResponseProjection equipmentRemoved(String alias) {
        fields.add(new GraphQLResponseField("equipmentRemoved").alias(alias));
        return this;
    }

    public WorkOrderExecutionResultResponseProjection linkAdded(LinkResponseProjection subProjection) {
        return linkAdded(null, subProjection);
    }

    public WorkOrderExecutionResultResponseProjection linkAdded(String alias, LinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("linkAdded").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderExecutionResultResponseProjection linkRemoved() {
        return linkRemoved(null);
    }

    public WorkOrderExecutionResultResponseProjection linkRemoved(String alias) {
        fields.add(new GraphQLResponseField("linkRemoved").alias(alias));
        return this;
    }

    public WorkOrderExecutionResultResponseProjection typename() {
        return typename(null);
    }

    public WorkOrderExecutionResultResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
