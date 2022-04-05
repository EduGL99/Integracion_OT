package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for DomainEdge
 */

public class DomainEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public DomainEdgeResponseProjection() {
    }

    public DomainEdgeResponseProjection all$() {
        return all$(3);
    }

    public DomainEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("DomainEdgeResponseProjection.DomainResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("DomainEdgeResponseProjection.DomainResponseProjection.node", projectionDepthOnFields.getOrDefault("DomainEdgeResponseProjection.DomainResponseProjection.node", 0) + 1);
            this.node(new DomainResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DomainEdgeResponseProjection.DomainResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public DomainEdgeResponseProjection node(DomainResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public DomainEdgeResponseProjection node(String alias, DomainResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public DomainEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public DomainEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public DomainEdgeResponseProjection typename() {
        return typename(null);
    }

    public DomainEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
