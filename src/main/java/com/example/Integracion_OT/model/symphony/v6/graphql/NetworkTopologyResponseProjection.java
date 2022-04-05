package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for NetworkTopology
 */

public class NetworkTopologyResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public NetworkTopologyResponseProjection() {
    }

    public NetworkTopologyResponseProjection all$() {
        return all$(3);
    }

    public NetworkTopologyResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("NetworkTopologyResponseProjection.NodeResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("NetworkTopologyResponseProjection.NodeResponseProjection.nodes", projectionDepthOnFields.getOrDefault("NetworkTopologyResponseProjection.NodeResponseProjection.nodes", 0) + 1);
            this.nodes(new NodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NetworkTopologyResponseProjection.NodeResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NetworkTopologyResponseProjection.TopologyLinkResponseProjection.links", 0) <= maxDepth) {
            projectionDepthOnFields.put("NetworkTopologyResponseProjection.TopologyLinkResponseProjection.links", projectionDepthOnFields.getOrDefault("NetworkTopologyResponseProjection.TopologyLinkResponseProjection.links", 0) + 1);
            this.links(new TopologyLinkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NetworkTopologyResponseProjection.TopologyLinkResponseProjection.links", 0)));
        }
        this.typename();
        return this;
    }

    public NetworkTopologyResponseProjection nodes(NodeResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public NetworkTopologyResponseProjection nodes(String alias, NodeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public NetworkTopologyResponseProjection links(TopologyLinkResponseProjection subProjection) {
        return links(null, subProjection);
    }

    public NetworkTopologyResponseProjection links(String alias, TopologyLinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("links").alias(alias).projection(subProjection));
        return this;
    }

    public NetworkTopologyResponseProjection typename() {
        return typename(null);
    }

    public NetworkTopologyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
