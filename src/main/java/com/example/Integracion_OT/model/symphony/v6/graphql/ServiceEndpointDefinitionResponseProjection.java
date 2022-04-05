package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ServiceEndpointDefinition
 */

public class ServiceEndpointDefinitionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ServiceEndpointDefinitionResponseProjection() {
    }

    public ServiceEndpointDefinitionResponseProjection all$() {
        return all$(3);
    }

    public ServiceEndpointDefinitionResponseProjection all$(int maxDepth) {
        this.id();
        this.index();
        this.role();
        this.name();
        if (projectionDepthOnFields.getOrDefault("ServiceEndpointDefinitionResponseProjection.ServiceEndpointResponseProjection.endpoints", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceEndpointDefinitionResponseProjection.ServiceEndpointResponseProjection.endpoints", projectionDepthOnFields.getOrDefault("ServiceEndpointDefinitionResponseProjection.ServiceEndpointResponseProjection.endpoints", 0) + 1);
            this.endpoints(new ServiceEndpointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceEndpointDefinitionResponseProjection.ServiceEndpointResponseProjection.endpoints", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceEndpointDefinitionResponseProjection.EquipmentTypeResponseProjection.equipmentType", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceEndpointDefinitionResponseProjection.EquipmentTypeResponseProjection.equipmentType", projectionDepthOnFields.getOrDefault("ServiceEndpointDefinitionResponseProjection.EquipmentTypeResponseProjection.equipmentType", 0) + 1);
            this.equipmentType(new EquipmentTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceEndpointDefinitionResponseProjection.EquipmentTypeResponseProjection.equipmentType", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceEndpointDefinitionResponseProjection.ServiceTypeResponseProjection.serviceType", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceEndpointDefinitionResponseProjection.ServiceTypeResponseProjection.serviceType", projectionDepthOnFields.getOrDefault("ServiceEndpointDefinitionResponseProjection.ServiceTypeResponseProjection.serviceType", 0) + 1);
            this.serviceType(new ServiceTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceEndpointDefinitionResponseProjection.ServiceTypeResponseProjection.serviceType", 0)));
        }
        this.typename();
        return this;
    }

    public ServiceEndpointDefinitionResponseProjection id() {
        return id(null);
    }

    public ServiceEndpointDefinitionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ServiceEndpointDefinitionResponseProjection index() {
        return index(null);
    }

    public ServiceEndpointDefinitionResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public ServiceEndpointDefinitionResponseProjection role() {
        return role(null);
    }

    public ServiceEndpointDefinitionResponseProjection role(String alias) {
        fields.add(new GraphQLResponseField("role").alias(alias));
        return this;
    }

    public ServiceEndpointDefinitionResponseProjection name() {
        return name(null);
    }

    public ServiceEndpointDefinitionResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ServiceEndpointDefinitionResponseProjection endpoints(ServiceEndpointResponseProjection subProjection) {
        return endpoints(null, subProjection);
    }

    public ServiceEndpointDefinitionResponseProjection endpoints(String alias, ServiceEndpointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("endpoints").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceEndpointDefinitionResponseProjection equipmentType(EquipmentTypeResponseProjection subProjection) {
        return equipmentType(null, subProjection);
    }

    public ServiceEndpointDefinitionResponseProjection equipmentType(String alias, EquipmentTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipmentType").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceEndpointDefinitionResponseProjection serviceType(ServiceTypeResponseProjection subProjection) {
        return serviceType(null, subProjection);
    }

    public ServiceEndpointDefinitionResponseProjection serviceType(String alias, ServiceTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("serviceType").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceEndpointDefinitionResponseProjection typename() {
        return typename(null);
    }

    public ServiceEndpointDefinitionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
