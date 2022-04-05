package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Coordinates
 */

public class CoordinatesResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CoordinatesResponseProjection() {
    }

    public CoordinatesResponseProjection all$() {
        return all$(3);
    }

    public CoordinatesResponseProjection all$(int maxDepth) {
        this.latitude();
        this.longitude();
        this.typename();
        return this;
    }

    public CoordinatesResponseProjection latitude() {
        return latitude(null);
    }

    public CoordinatesResponseProjection latitude(String alias) {
        fields.add(new GraphQLResponseField("latitude").alias(alias));
        return this;
    }

    public CoordinatesResponseProjection longitude() {
        return longitude(null);
    }

    public CoordinatesResponseProjection longitude(String alias) {
        fields.add(new GraphQLResponseField("longitude").alias(alias));
        return this;
    }

    public CoordinatesResponseProjection typename() {
        return typename(null);
    }

    public CoordinatesResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
