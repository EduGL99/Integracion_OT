package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for LocationEdge
 */

public class LocationEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public LocationEdgeResponseProjection() {
    }

    public LocationEdgeResponseProjection all$() {
        return all$(3);
    }

    public LocationEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("LocationEdgeResponseProjection.LocationResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationEdgeResponseProjection.LocationResponseProjection.node", projectionDepthOnFields.getOrDefault("LocationEdgeResponseProjection.LocationResponseProjection.node", 0) + 1);
            this.node(new LocationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationEdgeResponseProjection.LocationResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public LocationEdgeResponseProjection node(LocationResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public LocationEdgeResponseProjection node(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public LocationEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public LocationEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public LocationEdgeResponseProjection typename() {
        return typename(null);
    }

    public LocationEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
