package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for TopologyLink
 */

public class TopologyLinkResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public TopologyLinkResponseProjection() {
    }

    public TopologyLinkResponseProjection all$() {
        return all$(3);
    }

    public TopologyLinkResponseProjection all$(int maxDepth) {
        this.type();
        if (projectionDepthOnFields.getOrDefault("TopologyLinkResponseProjection.NodeResponseProjection.source", 0) <= maxDepth) {
            projectionDepthOnFields.put("TopologyLinkResponseProjection.NodeResponseProjection.source", projectionDepthOnFields.getOrDefault("TopologyLinkResponseProjection.NodeResponseProjection.source", 0) + 1);
            this.source(new NodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TopologyLinkResponseProjection.NodeResponseProjection.source", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TopologyLinkResponseProjection.NodeResponseProjection.target", 0) <= maxDepth) {
            projectionDepthOnFields.put("TopologyLinkResponseProjection.NodeResponseProjection.target", projectionDepthOnFields.getOrDefault("TopologyLinkResponseProjection.NodeResponseProjection.target", 0) + 1);
            this.target(new NodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TopologyLinkResponseProjection.NodeResponseProjection.target", 0)));
        }
        this.typename();
        return this;
    }

    public TopologyLinkResponseProjection type() {
        return type(null);
    }

    public TopologyLinkResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public TopologyLinkResponseProjection source(NodeResponseProjection subProjection) {
        return source(null, subProjection);
    }

    public TopologyLinkResponseProjection source(String alias, NodeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("source").alias(alias).projection(subProjection));
        return this;
    }

    public TopologyLinkResponseProjection target(NodeResponseProjection subProjection) {
        return target(null, subProjection);
    }

    public TopologyLinkResponseProjection target(String alias, NodeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("target").alias(alias).projection(subProjection));
        return this;
    }

    public TopologyLinkResponseProjection typename() {
        return typename(null);
    }

    public TopologyLinkResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
