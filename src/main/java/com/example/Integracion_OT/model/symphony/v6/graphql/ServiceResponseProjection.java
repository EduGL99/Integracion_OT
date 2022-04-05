package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Service
 */

public class ServiceResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ServiceResponseProjection() {
    }

    public ServiceResponseProjection all$() {
        return all$(3);
    }

    public ServiceResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.externalId();
        this.status();
        if (projectionDepthOnFields.getOrDefault("ServiceResponseProjection.CustomerResponseProjection.customer", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceResponseProjection.CustomerResponseProjection.customer", projectionDepthOnFields.getOrDefault("ServiceResponseProjection.CustomerResponseProjection.customer", 0) + 1);
            this.customer(new CustomerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceResponseProjection.CustomerResponseProjection.customer", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceResponseProjection.ServiceTypeResponseProjection.serviceType", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceResponseProjection.ServiceTypeResponseProjection.serviceType", projectionDepthOnFields.getOrDefault("ServiceResponseProjection.ServiceTypeResponseProjection.serviceType", 0) + 1);
            this.serviceType(new ServiceTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceResponseProjection.ServiceTypeResponseProjection.serviceType", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceResponseProjection.ServiceResponseProjection.upstream", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceResponseProjection.ServiceResponseProjection.upstream", projectionDepthOnFields.getOrDefault("ServiceResponseProjection.ServiceResponseProjection.upstream", 0) + 1);
            this.upstream(new ServiceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceResponseProjection.ServiceResponseProjection.upstream", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceResponseProjection.ServiceResponseProjection.downstream", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceResponseProjection.ServiceResponseProjection.downstream", projectionDepthOnFields.getOrDefault("ServiceResponseProjection.ServiceResponseProjection.downstream", 0) + 1);
            this.downstream(new ServiceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceResponseProjection.ServiceResponseProjection.downstream", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceResponseProjection.PropertyResponseProjection.properties", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceResponseProjection.PropertyResponseProjection.properties", projectionDepthOnFields.getOrDefault("ServiceResponseProjection.PropertyResponseProjection.properties", 0) + 1);
            this.properties(new PropertyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceResponseProjection.PropertyResponseProjection.properties", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceResponseProjection.ServiceEndpointResponseProjection.endpoints", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceResponseProjection.ServiceEndpointResponseProjection.endpoints", projectionDepthOnFields.getOrDefault("ServiceResponseProjection.ServiceEndpointResponseProjection.endpoints", 0) + 1);
            this.endpoints(new ServiceEndpointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceResponseProjection.ServiceEndpointResponseProjection.endpoints", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceResponseProjection.LinkResponseProjection.links", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceResponseProjection.LinkResponseProjection.links", projectionDepthOnFields.getOrDefault("ServiceResponseProjection.LinkResponseProjection.links", 0) + 1);
            this.links(new LinkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceResponseProjection.LinkResponseProjection.links", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceResponseProjection.EquipmentPortResponseProjection.ports", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceResponseProjection.EquipmentPortResponseProjection.ports", projectionDepthOnFields.getOrDefault("ServiceResponseProjection.EquipmentPortResponseProjection.ports", 0) + 1);
            this.ports(new EquipmentPortResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceResponseProjection.EquipmentPortResponseProjection.ports", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceResponseProjection.NetworkTopologyResponseProjection.topology", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceResponseProjection.NetworkTopologyResponseProjection.topology", projectionDepthOnFields.getOrDefault("ServiceResponseProjection.NetworkTopologyResponseProjection.topology", 0) + 1);
            this.topology(new NetworkTopologyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceResponseProjection.NetworkTopologyResponseProjection.topology", 0)));
        }
        this.typename();
        return this;
    }

    public ServiceResponseProjection id() {
        return id(null);
    }

    public ServiceResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ServiceResponseProjection name() {
        return name(null);
    }

    public ServiceResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ServiceResponseProjection externalId() {
        return externalId(null);
    }

    public ServiceResponseProjection externalId(String alias) {
        fields.add(new GraphQLResponseField("externalId").alias(alias));
        return this;
    }

    public ServiceResponseProjection status() {
        return status(null);
    }

    public ServiceResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public ServiceResponseProjection customer(CustomerResponseProjection subProjection) {
        return customer(null, subProjection);
    }

    public ServiceResponseProjection customer(String alias, CustomerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("customer").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceResponseProjection serviceType(ServiceTypeResponseProjection subProjection) {
        return serviceType(null, subProjection);
    }

    public ServiceResponseProjection serviceType(String alias, ServiceTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("serviceType").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceResponseProjection upstream(ServiceResponseProjection subProjection) {
        return upstream(null, subProjection);
    }

    public ServiceResponseProjection upstream(String alias, ServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("upstream").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceResponseProjection downstream(ServiceResponseProjection subProjection) {
        return downstream(null, subProjection);
    }

    public ServiceResponseProjection downstream(String alias, ServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("downstream").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceResponseProjection properties(PropertyResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public ServiceResponseProjection properties(String alias, PropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceResponseProjection endpoints(ServiceEndpointResponseProjection subProjection) {
        return endpoints(null, subProjection);
    }

    public ServiceResponseProjection endpoints(String alias, ServiceEndpointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("endpoints").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceResponseProjection links(LinkResponseProjection subProjection) {
        return links(null, subProjection);
    }

    public ServiceResponseProjection links(String alias, LinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("links").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceResponseProjection ports(EquipmentPortResponseProjection subProjection) {
        return ports(null, subProjection);
    }

    public ServiceResponseProjection ports(String alias, EquipmentPortResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ports").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceResponseProjection topology(NetworkTopologyResponseProjection subProjection) {
        return topology(null, subProjection);
    }

    public ServiceResponseProjection topology(String alias, NetworkTopologyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("topology").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceResponseProjection typename() {
        return typename(null);
    }

    public ServiceResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
