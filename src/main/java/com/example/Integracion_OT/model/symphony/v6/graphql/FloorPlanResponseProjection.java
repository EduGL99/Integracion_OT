package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for FloorPlan
 */

public class FloorPlanResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FloorPlanResponseProjection() {
    }

    public FloorPlanResponseProjection all$() {
        return all$(3);
    }

    public FloorPlanResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.locationID();
        if (projectionDepthOnFields.getOrDefault("FloorPlanResponseProjection.FileResponseProjection.image", 0) <= maxDepth) {
            projectionDepthOnFields.put("FloorPlanResponseProjection.FileResponseProjection.image", projectionDepthOnFields.getOrDefault("FloorPlanResponseProjection.FileResponseProjection.image", 0) + 1);
            this.image(new FileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FloorPlanResponseProjection.FileResponseProjection.image", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FloorPlanResponseProjection.FloorPlanReferencePointResponseProjection.referencePoint", 0) <= maxDepth) {
            projectionDepthOnFields.put("FloorPlanResponseProjection.FloorPlanReferencePointResponseProjection.referencePoint", projectionDepthOnFields.getOrDefault("FloorPlanResponseProjection.FloorPlanReferencePointResponseProjection.referencePoint", 0) + 1);
            this.referencePoint(new FloorPlanReferencePointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FloorPlanResponseProjection.FloorPlanReferencePointResponseProjection.referencePoint", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FloorPlanResponseProjection.FloorPlanScaleResponseProjection.scale", 0) <= maxDepth) {
            projectionDepthOnFields.put("FloorPlanResponseProjection.FloorPlanScaleResponseProjection.scale", projectionDepthOnFields.getOrDefault("FloorPlanResponseProjection.FloorPlanScaleResponseProjection.scale", 0) + 1);
            this.scale(new FloorPlanScaleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FloorPlanResponseProjection.FloorPlanScaleResponseProjection.scale", 0)));
        }
        this.typename();
        return this;
    }

    public FloorPlanResponseProjection id() {
        return id(null);
    }

    public FloorPlanResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public FloorPlanResponseProjection name() {
        return name(null);
    }

    public FloorPlanResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public FloorPlanResponseProjection locationID() {
        return locationID(null);
    }

    public FloorPlanResponseProjection locationID(String alias) {
        fields.add(new GraphQLResponseField("locationID").alias(alias));
        return this;
    }

    public FloorPlanResponseProjection image(FileResponseProjection subProjection) {
        return image(null, subProjection);
    }

    public FloorPlanResponseProjection image(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("image").alias(alias).projection(subProjection));
        return this;
    }

    public FloorPlanResponseProjection referencePoint(FloorPlanReferencePointResponseProjection subProjection) {
        return referencePoint(null, subProjection);
    }

    public FloorPlanResponseProjection referencePoint(String alias, FloorPlanReferencePointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("referencePoint").alias(alias).projection(subProjection));
        return this;
    }

    public FloorPlanResponseProjection scale(FloorPlanScaleResponseProjection subProjection) {
        return scale(null, subProjection);
    }

    public FloorPlanResponseProjection scale(String alias, FloorPlanScaleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("scale").alias(alias).projection(subProjection));
        return this;
    }

    public FloorPlanResponseProjection typename() {
        return typename(null);
    }

    public FloorPlanResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
