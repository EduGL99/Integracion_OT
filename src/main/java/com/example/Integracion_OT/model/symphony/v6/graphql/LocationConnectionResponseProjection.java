package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for LocationConnection
 */

public class LocationConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public LocationConnectionResponseProjection() {
    }

    public LocationConnectionResponseProjection all$() {
        return all$(3);
    }

    public LocationConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("LocationConnectionResponseProjection.LocationEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationConnectionResponseProjection.LocationEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("LocationConnectionResponseProjection.LocationEdgeResponseProjection.edges", 0) + 1);
            this.edges(new LocationEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationConnectionResponseProjection.LocationEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LocationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("LocationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public LocationConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public LocationConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public LocationConnectionResponseProjection edges(LocationEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public LocationConnectionResponseProjection edges(String alias, LocationEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public LocationConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public LocationConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public LocationConnectionResponseProjection typename() {
        return typename(null);
    }

    public LocationConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
