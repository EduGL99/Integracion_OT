package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EquipmentPort
 */

public class EquipmentPortResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EquipmentPortResponseProjection() {
    }

    public EquipmentPortResponseProjection all$() {
        return all$(3);
    }

    public EquipmentPortResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("EquipmentPortResponseProjection.EquipmentPortDefinitionResponseProjection.definition", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPortResponseProjection.EquipmentPortDefinitionResponseProjection.definition", projectionDepthOnFields.getOrDefault("EquipmentPortResponseProjection.EquipmentPortDefinitionResponseProjection.definition", 0) + 1);
            this.definition(new EquipmentPortDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPortResponseProjection.EquipmentPortDefinitionResponseProjection.definition", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentPortResponseProjection.EquipmentResponseProjection.parentEquipment", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPortResponseProjection.EquipmentResponseProjection.parentEquipment", projectionDepthOnFields.getOrDefault("EquipmentPortResponseProjection.EquipmentResponseProjection.parentEquipment", 0) + 1);
            this.parentEquipment(new EquipmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPortResponseProjection.EquipmentResponseProjection.parentEquipment", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentPortResponseProjection.LinkResponseProjection.link", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPortResponseProjection.LinkResponseProjection.link", projectionDepthOnFields.getOrDefault("EquipmentPortResponseProjection.LinkResponseProjection.link", 0) + 1);
            this.link(new LinkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPortResponseProjection.LinkResponseProjection.link", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentPortResponseProjection.PropertyResponseProjection.properties", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPortResponseProjection.PropertyResponseProjection.properties", projectionDepthOnFields.getOrDefault("EquipmentPortResponseProjection.PropertyResponseProjection.properties", 0) + 1);
            this.properties(new PropertyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPortResponseProjection.PropertyResponseProjection.properties", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentPortResponseProjection.ServiceEndpointResponseProjection.serviceEndpoints", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPortResponseProjection.ServiceEndpointResponseProjection.serviceEndpoints", projectionDepthOnFields.getOrDefault("EquipmentPortResponseProjection.ServiceEndpointResponseProjection.serviceEndpoints", 0) + 1);
            this.serviceEndpoints(new ServiceEndpointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPortResponseProjection.ServiceEndpointResponseProjection.serviceEndpoints", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentPortResponseProjection.ServiceResponseProjection.services", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPortResponseProjection.ServiceResponseProjection.services", projectionDepthOnFields.getOrDefault("EquipmentPortResponseProjection.ServiceResponseProjection.services", 0) + 1);
            this.services(new ServiceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPortResponseProjection.ServiceResponseProjection.services", 0)));
        }
        this.typename();
        return this;
    }

    public EquipmentPortResponseProjection id() {
        return id(null);
    }

    public EquipmentPortResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EquipmentPortResponseProjection definition(EquipmentPortDefinitionResponseProjection subProjection) {
        return definition(null, subProjection);
    }

    public EquipmentPortResponseProjection definition(String alias, EquipmentPortDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("definition").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortResponseProjection parentEquipment(EquipmentResponseProjection subProjection) {
        return parentEquipment(null, subProjection);
    }

    public EquipmentPortResponseProjection parentEquipment(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parentEquipment").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortResponseProjection link(LinkResponseProjection subProjection) {
        return link(null, subProjection);
    }

    public EquipmentPortResponseProjection link(String alias, LinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("link").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortResponseProjection properties(PropertyResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public EquipmentPortResponseProjection properties(String alias, PropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortResponseProjection serviceEndpoints(ServiceEndpointResponseProjection subProjection) {
        return serviceEndpoints(null, subProjection);
    }

    public EquipmentPortResponseProjection serviceEndpoints(String alias, ServiceEndpointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("serviceEndpoints").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortResponseProjection services(ServiceResponseProjection subProjection) {
        return services(null, subProjection);
    }

    public EquipmentPortResponseProjection services(String alias, ServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("services").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortResponseProjection typename() {
        return typename(null);
    }

    public EquipmentPortResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
