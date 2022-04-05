package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for LinkEdge
 */

public class LinkEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public LinkEdgeResponseProjection() {
    }

    public LinkEdgeResponseProjection all$() {
        return all$(3);
    }

    public LinkEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("LinkEdgeResponseProjection.LinkResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("LinkEdgeResponseProjection.LinkResponseProjection.node", projectionDepthOnFields.getOrDefault("LinkEdgeResponseProjection.LinkResponseProjection.node", 0) + 1);
            this.node(new LinkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LinkEdgeResponseProjection.LinkResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public LinkEdgeResponseProjection node(LinkResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public LinkEdgeResponseProjection node(String alias, LinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public LinkEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public LinkEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public LinkEdgeResponseProjection typename() {
        return typename(null);
    }

    public LinkEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
