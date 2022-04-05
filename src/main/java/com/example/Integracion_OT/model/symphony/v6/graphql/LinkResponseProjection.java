package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Link
 */

public class LinkResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public LinkResponseProjection() {
    }

    public LinkResponseProjection all$() {
        return all$(3);
    }

    public LinkResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("LinkResponseProjection.EquipmentPortResponseProjection.ports", 0) <= maxDepth) {
            projectionDepthOnFields.put("LinkResponseProjection.EquipmentPortResponseProjection.ports", projectionDepthOnFields.getOrDefault("LinkResponseProjection.EquipmentPortResponseProjection.ports", 0) + 1);
            this.ports(new EquipmentPortResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LinkResponseProjection.EquipmentPortResponseProjection.ports", 0)));
        }
        this.futureState();
        if (projectionDepthOnFields.getOrDefault("LinkResponseProjection.WorkOrderResponseProjection.workOrder", 0) <= maxDepth) {
            projectionDepthOnFields.put("LinkResponseProjection.WorkOrderResponseProjection.workOrder", projectionDepthOnFields.getOrDefault("LinkResponseProjection.WorkOrderResponseProjection.workOrder", 0) + 1);
            this.workOrder(new WorkOrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LinkResponseProjection.WorkOrderResponseProjection.workOrder", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LinkResponseProjection.PropertyResponseProjection.properties", 0) <= maxDepth) {
            projectionDepthOnFields.put("LinkResponseProjection.PropertyResponseProjection.properties", projectionDepthOnFields.getOrDefault("LinkResponseProjection.PropertyResponseProjection.properties", 0) + 1);
            this.properties(new PropertyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LinkResponseProjection.PropertyResponseProjection.properties", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LinkResponseProjection.ServiceResponseProjection.services", 0) <= maxDepth) {
            projectionDepthOnFields.put("LinkResponseProjection.ServiceResponseProjection.services", projectionDepthOnFields.getOrDefault("LinkResponseProjection.ServiceResponseProjection.services", 0) + 1);
            this.services(new ServiceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LinkResponseProjection.ServiceResponseProjection.services", 0)));
        }
        this.typename();
        return this;
    }

    public LinkResponseProjection id() {
        return id(null);
    }

    public LinkResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public LinkResponseProjection ports(EquipmentPortResponseProjection subProjection) {
        return ports(null, subProjection);
    }

    public LinkResponseProjection ports(String alias, EquipmentPortResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ports").alias(alias).projection(subProjection));
        return this;
    }

    public LinkResponseProjection futureState() {
        return futureState(null);
    }

    public LinkResponseProjection futureState(String alias) {
        fields.add(new GraphQLResponseField("futureState").alias(alias));
        return this;
    }

    public LinkResponseProjection workOrder(WorkOrderResponseProjection subProjection) {
        return workOrder(null, subProjection);
    }

    public LinkResponseProjection workOrder(String alias, WorkOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrder").alias(alias).projection(subProjection));
        return this;
    }

    public LinkResponseProjection properties(PropertyResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public LinkResponseProjection properties(String alias, PropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public LinkResponseProjection services(ServiceResponseProjection subProjection) {
        return services(null, subProjection);
    }

    public LinkResponseProjection services(String alias, ServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("services").alias(alias).projection(subProjection));
        return this;
    }

    public LinkResponseProjection typename() {
        return typename(null);
    }

    public LinkResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
