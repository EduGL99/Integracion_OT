package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ServiceType
 */

public class ServiceTypeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ServiceTypeResponseProjection() {
    }

    public ServiceTypeResponseProjection all$() {
        return all$(3);
    }

    public ServiceTypeResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.isDeleted();
        this.hasCustomer();
        if (projectionDepthOnFields.getOrDefault("ServiceTypeResponseProjection.PropertyTypeResponseProjection.propertyTypes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceTypeResponseProjection.PropertyTypeResponseProjection.propertyTypes", projectionDepthOnFields.getOrDefault("ServiceTypeResponseProjection.PropertyTypeResponseProjection.propertyTypes", 0) + 1);
            this.propertyTypes(new PropertyTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceTypeResponseProjection.PropertyTypeResponseProjection.propertyTypes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceTypeResponseProjection.ServiceResponseProjection.services", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceTypeResponseProjection.ServiceResponseProjection.services", projectionDepthOnFields.getOrDefault("ServiceTypeResponseProjection.ServiceResponseProjection.services", 0) + 1);
            this.services(new ServiceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceTypeResponseProjection.ServiceResponseProjection.services", 0)));
        }
        this.numberOfServices();
        if (projectionDepthOnFields.getOrDefault("ServiceTypeResponseProjection.ServiceEndpointDefinitionResponseProjection.endpointDefinitions", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceTypeResponseProjection.ServiceEndpointDefinitionResponseProjection.endpointDefinitions", projectionDepthOnFields.getOrDefault("ServiceTypeResponseProjection.ServiceEndpointDefinitionResponseProjection.endpointDefinitions", 0) + 1);
            this.endpointDefinitions(new ServiceEndpointDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceTypeResponseProjection.ServiceEndpointDefinitionResponseProjection.endpointDefinitions", 0)));
        }
        this.discoveryMethod();
        this.typename();
        return this;
    }

    public ServiceTypeResponseProjection id() {
        return id(null);
    }

    public ServiceTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ServiceTypeResponseProjection name() {
        return name(null);
    }

    public ServiceTypeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ServiceTypeResponseProjection isDeleted() {
        return isDeleted(null);
    }

    public ServiceTypeResponseProjection isDeleted(String alias) {
        fields.add(new GraphQLResponseField("isDeleted").alias(alias));
        return this;
    }

    public ServiceTypeResponseProjection hasCustomer() {
        return hasCustomer(null);
    }

    public ServiceTypeResponseProjection hasCustomer(String alias) {
        fields.add(new GraphQLResponseField("hasCustomer").alias(alias));
        return this;
    }

    public ServiceTypeResponseProjection propertyTypes(PropertyTypeResponseProjection subProjection) {
        return propertyTypes(null, subProjection);
    }

    public ServiceTypeResponseProjection propertyTypes(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("propertyTypes").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceTypeResponseProjection services(ServiceResponseProjection subProjection) {
        return services(null, subProjection);
    }

    public ServiceTypeResponseProjection services(String alias, ServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("services").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceTypeResponseProjection numberOfServices() {
        return numberOfServices(null);
    }

    public ServiceTypeResponseProjection numberOfServices(String alias) {
        fields.add(new GraphQLResponseField("numberOfServices").alias(alias));
        return this;
    }

    public ServiceTypeResponseProjection endpointDefinitions(ServiceEndpointDefinitionResponseProjection subProjection) {
        return endpointDefinitions(null, subProjection);
    }

    public ServiceTypeResponseProjection endpointDefinitions(String alias, ServiceEndpointDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("endpointDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceTypeResponseProjection discoveryMethod() {
        return discoveryMethod(null);
    }

    public ServiceTypeResponseProjection discoveryMethod(String alias) {
        fields.add(new GraphQLResponseField("discoveryMethod").alias(alias));
        return this;
    }

    public ServiceTypeResponseProjection typename() {
        return typename(null);
    }

    public ServiceTypeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
