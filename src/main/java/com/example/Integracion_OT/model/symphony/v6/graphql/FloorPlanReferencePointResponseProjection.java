package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for FloorPlanReferencePoint
 */

public class FloorPlanReferencePointResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FloorPlanReferencePointResponseProjection() {
    }

    public FloorPlanReferencePointResponseProjection all$() {
        return all$(3);
    }

    public FloorPlanReferencePointResponseProjection all$(int maxDepth) {
        this.x();
        this.y();
        this.latitude();
        this.longitude();
        this.typename();
        return this;
    }

    public FloorPlanReferencePointResponseProjection x() {
        return x(null);
    }

    public FloorPlanReferencePointResponseProjection x(String alias) {
        fields.add(new GraphQLResponseField("x").alias(alias));
        return this;
    }

    public FloorPlanReferencePointResponseProjection y() {
        return y(null);
    }

    public FloorPlanReferencePointResponseProjection y(String alias) {
        fields.add(new GraphQLResponseField("y").alias(alias));
        return this;
    }

    public FloorPlanReferencePointResponseProjection latitude() {
        return latitude(null);
    }

    public FloorPlanReferencePointResponseProjection latitude(String alias) {
        fields.add(new GraphQLResponseField("latitude").alias(alias));
        return this;
    }

    public FloorPlanReferencePointResponseProjection longitude() {
        return longitude(null);
    }

    public FloorPlanReferencePointResponseProjection longitude(String alias) {
        fields.add(new GraphQLResponseField("longitude").alias(alias));
        return this;
    }

    public FloorPlanReferencePointResponseProjection typename() {
        return typename(null);
    }

    public FloorPlanReferencePointResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
