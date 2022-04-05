package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ServiceTypeEdge
 */

public class ServiceTypeEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ServiceTypeEdgeResponseProjection() {
    }

    public ServiceTypeEdgeResponseProjection all$() {
        return all$(3);
    }

    public ServiceTypeEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ServiceTypeEdgeResponseProjection.ServiceTypeResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceTypeEdgeResponseProjection.ServiceTypeResponseProjection.node", projectionDepthOnFields.getOrDefault("ServiceTypeEdgeResponseProjection.ServiceTypeResponseProjection.node", 0) + 1);
            this.node(new ServiceTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceTypeEdgeResponseProjection.ServiceTypeResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public ServiceTypeEdgeResponseProjection node(ServiceTypeResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ServiceTypeEdgeResponseProjection node(String alias, ServiceTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceTypeEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ServiceTypeEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ServiceTypeEdgeResponseProjection typename() {
        return typename(null);
    }

    public ServiceTypeEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
