package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for OrganizationEdge
 */

public class OrganizationEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public OrganizationEdgeResponseProjection() {
    }

    public OrganizationEdgeResponseProjection all$() {
        return all$(3);
    }

    public OrganizationEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("OrganizationEdgeResponseProjection.OrganizationResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationEdgeResponseProjection.OrganizationResponseProjection.node", projectionDepthOnFields.getOrDefault("OrganizationEdgeResponseProjection.OrganizationResponseProjection.node", 0) + 1);
            this.node(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationEdgeResponseProjection.OrganizationResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public OrganizationEdgeResponseProjection node(OrganizationResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public OrganizationEdgeResponseProjection node(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public OrganizationEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public OrganizationEdgeResponseProjection typename() {
        return typename(null);
    }

    public OrganizationEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
