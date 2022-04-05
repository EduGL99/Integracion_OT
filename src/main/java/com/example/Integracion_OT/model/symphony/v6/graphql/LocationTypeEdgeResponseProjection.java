package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for LocationTypeEdge
 */

public class LocationTypeEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public LocationTypeEdgeResponseProjection() {
    }

    public LocationTypeEdgeResponseProjection all$() {
        return all$(3);
    }

    public LocationTypeEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("LocationTypeEdgeResponseProjection.LocationTypeResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationTypeEdgeResponseProjection.LocationTypeResponseProjection.node", projectionDepthOnFields.getOrDefault("LocationTypeEdgeResponseProjection.LocationTypeResponseProjection.node", 0) + 1);
            this.node(new LocationTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationTypeEdgeResponseProjection.LocationTypeResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public LocationTypeEdgeResponseProjection node(LocationTypeResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public LocationTypeEdgeResponseProjection node(String alias, LocationTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public LocationTypeEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public LocationTypeEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public LocationTypeEdgeResponseProjection typename() {
        return typename(null);
    }

    public LocationTypeEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
