package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for FloorPlanScale
 */

public class FloorPlanScaleResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FloorPlanScaleResponseProjection() {
    }

    public FloorPlanScaleResponseProjection all$() {
        return all$(3);
    }

    public FloorPlanScaleResponseProjection all$(int maxDepth) {
        this.referencePoint1X();
        this.referencePoint1Y();
        this.referencePoint2X();
        this.referencePoint2Y();
        this.scaleInMeters();
        this.typename();
        return this;
    }

    public FloorPlanScaleResponseProjection referencePoint1X() {
        return referencePoint1X(null);
    }

    public FloorPlanScaleResponseProjection referencePoint1X(String alias) {
        fields.add(new GraphQLResponseField("referencePoint1X").alias(alias));
        return this;
    }

    public FloorPlanScaleResponseProjection referencePoint1Y() {
        return referencePoint1Y(null);
    }

    public FloorPlanScaleResponseProjection referencePoint1Y(String alias) {
        fields.add(new GraphQLResponseField("referencePoint1Y").alias(alias));
        return this;
    }

    public FloorPlanScaleResponseProjection referencePoint2X() {
        return referencePoint2X(null);
    }

    public FloorPlanScaleResponseProjection referencePoint2X(String alias) {
        fields.add(new GraphQLResponseField("referencePoint2X").alias(alias));
        return this;
    }

    public FloorPlanScaleResponseProjection referencePoint2Y() {
        return referencePoint2Y(null);
    }

    public FloorPlanScaleResponseProjection referencePoint2Y(String alias) {
        fields.add(new GraphQLResponseField("referencePoint2Y").alias(alias));
        return this;
    }

    public FloorPlanScaleResponseProjection scaleInMeters() {
        return scaleInMeters(null);
    }

    public FloorPlanScaleResponseProjection scaleInMeters(String alias) {
        fields.add(new GraphQLResponseField("scaleInMeters").alias(alias));
        return this;
    }

    public FloorPlanScaleResponseProjection typename() {
        return typename(null);
    }

    public FloorPlanScaleResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
