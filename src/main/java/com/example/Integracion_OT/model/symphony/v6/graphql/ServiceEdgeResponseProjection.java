package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ServiceEdge
 */

public class ServiceEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ServiceEdgeResponseProjection() {
    }

    public ServiceEdgeResponseProjection all$() {
        return all$(3);
    }

    public ServiceEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ServiceEdgeResponseProjection.ServiceResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceEdgeResponseProjection.ServiceResponseProjection.node", projectionDepthOnFields.getOrDefault("ServiceEdgeResponseProjection.ServiceResponseProjection.node", 0) + 1);
            this.node(new ServiceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceEdgeResponseProjection.ServiceResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public ServiceEdgeResponseProjection node(ServiceResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ServiceEdgeResponseProjection node(String alias, ServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ServiceEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ServiceEdgeResponseProjection typename() {
        return typename(null);
    }

    public ServiceEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
