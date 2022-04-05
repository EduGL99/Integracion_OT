package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for NetworkTypeEdge
 */

public class NetworkTypeEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public NetworkTypeEdgeResponseProjection() {
    }

    public NetworkTypeEdgeResponseProjection all$() {
        return all$(3);
    }

    public NetworkTypeEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("NetworkTypeEdgeResponseProjection.NetworkTypeResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("NetworkTypeEdgeResponseProjection.NetworkTypeResponseProjection.node", projectionDepthOnFields.getOrDefault("NetworkTypeEdgeResponseProjection.NetworkTypeResponseProjection.node", 0) + 1);
            this.node(new NetworkTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NetworkTypeEdgeResponseProjection.NetworkTypeResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public NetworkTypeEdgeResponseProjection node(NetworkTypeResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public NetworkTypeEdgeResponseProjection node(String alias, NetworkTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public NetworkTypeEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public NetworkTypeEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public NetworkTypeEdgeResponseProjection typename() {
        return typename(null);
    }

    public NetworkTypeEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
