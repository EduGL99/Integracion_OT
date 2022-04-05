package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ServiceEndpoint
 */

public class ServiceEndpointResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ServiceEndpointResponseProjection() {
    }

    public ServiceEndpointResponseProjection all$() {
        return all$(3);
    }

    public ServiceEndpointResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("ServiceEndpointResponseProjection.EquipmentPortResponseProjection.port", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceEndpointResponseProjection.EquipmentPortResponseProjection.port", projectionDepthOnFields.getOrDefault("ServiceEndpointResponseProjection.EquipmentPortResponseProjection.port", 0) + 1);
            this.port(new EquipmentPortResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceEndpointResponseProjection.EquipmentPortResponseProjection.port", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceEndpointResponseProjection.EquipmentResponseProjection.equipment", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceEndpointResponseProjection.EquipmentResponseProjection.equipment", projectionDepthOnFields.getOrDefault("ServiceEndpointResponseProjection.EquipmentResponseProjection.equipment", 0) + 1);
            this.equipment(new EquipmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceEndpointResponseProjection.EquipmentResponseProjection.equipment", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceEndpointResponseProjection.ServiceResponseProjection.service", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceEndpointResponseProjection.ServiceResponseProjection.service", projectionDepthOnFields.getOrDefault("ServiceEndpointResponseProjection.ServiceResponseProjection.service", 0) + 1);
            this.service(new ServiceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceEndpointResponseProjection.ServiceResponseProjection.service", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceEndpointResponseProjection.ServiceEndpointDefinitionResponseProjection.definition", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceEndpointResponseProjection.ServiceEndpointDefinitionResponseProjection.definition", projectionDepthOnFields.getOrDefault("ServiceEndpointResponseProjection.ServiceEndpointDefinitionResponseProjection.definition", 0) + 1);
            this.definition(new ServiceEndpointDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceEndpointResponseProjection.ServiceEndpointDefinitionResponseProjection.definition", 0)));
        }
        this.typename();
        return this;
    }

    public ServiceEndpointResponseProjection id() {
        return id(null);
    }

    public ServiceEndpointResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ServiceEndpointResponseProjection port(EquipmentPortResponseProjection subProjection) {
        return port(null, subProjection);
    }

    public ServiceEndpointResponseProjection port(String alias, EquipmentPortResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("port").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceEndpointResponseProjection equipment(EquipmentResponseProjection subProjection) {
        return equipment(null, subProjection);
    }

    public ServiceEndpointResponseProjection equipment(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipment").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceEndpointResponseProjection service(ServiceResponseProjection subProjection) {
        return service(null, subProjection);
    }

    public ServiceEndpointResponseProjection service(String alias, ServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("service").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceEndpointResponseProjection definition(ServiceEndpointDefinitionResponseProjection subProjection) {
        return definition(null, subProjection);
    }

    public ServiceEndpointResponseProjection definition(String alias, ServiceEndpointDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("definition").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceEndpointResponseProjection typename() {
        return typename(null);
    }

    public ServiceEndpointResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
