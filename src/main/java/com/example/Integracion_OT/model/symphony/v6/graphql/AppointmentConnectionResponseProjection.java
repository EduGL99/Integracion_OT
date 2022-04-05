package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for AppointmentConnection
 */

public class AppointmentConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public AppointmentConnectionResponseProjection() {
    }

    public AppointmentConnectionResponseProjection all$() {
        return all$(3);
    }

    public AppointmentConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("AppointmentConnectionResponseProjection.AppointmentEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("AppointmentConnectionResponseProjection.AppointmentEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("AppointmentConnectionResponseProjection.AppointmentEdgeResponseProjection.edges", 0) + 1);
            this.edges(new AppointmentEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AppointmentConnectionResponseProjection.AppointmentEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("AppointmentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("AppointmentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("AppointmentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AppointmentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public AppointmentConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public AppointmentConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public AppointmentConnectionResponseProjection edges(AppointmentEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public AppointmentConnectionResponseProjection edges(String alias, AppointmentEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public AppointmentConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public AppointmentConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public AppointmentConnectionResponseProjection typename() {
        return typename(null);
    }

    public AppointmentConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
