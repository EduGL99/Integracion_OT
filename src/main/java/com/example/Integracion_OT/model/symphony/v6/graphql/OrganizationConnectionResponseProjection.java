package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for OrganizationConnection
 */

public class OrganizationConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public OrganizationConnectionResponseProjection() {
    }

    public OrganizationConnectionResponseProjection all$() {
        return all$(3);
    }

    public OrganizationConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationConnectionResponseProjection.OrganizationEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationEdgeResponseProjection.edges", 0) + 1);
            this.edges(new OrganizationEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.OrganizationEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("OrganizationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public OrganizationConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public OrganizationConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public OrganizationConnectionResponseProjection edges(OrganizationEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public OrganizationConnectionResponseProjection edges(String alias, OrganizationEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public OrganizationConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public OrganizationConnectionResponseProjection typename() {
        return typename(null);
    }

    public OrganizationConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
