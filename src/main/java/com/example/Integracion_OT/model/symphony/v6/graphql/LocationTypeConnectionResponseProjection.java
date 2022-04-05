package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for LocationTypeConnection
 */

public class LocationTypeConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public LocationTypeConnectionResponseProjection() {
    }

    public LocationTypeConnectionResponseProjection all$() {
        return all$(3);
    }

    public LocationTypeConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("LocationTypeConnectionResponseProjection.LocationTypeEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationTypeConnectionResponseProjection.LocationTypeEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("LocationTypeConnectionResponseProjection.LocationTypeEdgeResponseProjection.edges", 0) + 1);
            this.edges(new LocationTypeEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationTypeConnectionResponseProjection.LocationTypeEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LocationTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("LocationTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public LocationTypeConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public LocationTypeConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public LocationTypeConnectionResponseProjection edges(LocationTypeEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public LocationTypeConnectionResponseProjection edges(String alias, LocationTypeEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public LocationTypeConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public LocationTypeConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public LocationTypeConnectionResponseProjection typename() {
        return typename(null);
    }

    public LocationTypeConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
