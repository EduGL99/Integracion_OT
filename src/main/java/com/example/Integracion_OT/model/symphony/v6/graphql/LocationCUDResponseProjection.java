package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for LocationCUD
 */

public class LocationCUDResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public LocationCUDResponseProjection() {
    }

    public LocationCUDResponseProjection all$() {
        return all$(3);
    }

    public LocationCUDResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("LocationCUDResponseProjection.LocationPermissionRuleResponseProjection.create", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationCUDResponseProjection.LocationPermissionRuleResponseProjection.create", projectionDepthOnFields.getOrDefault("LocationCUDResponseProjection.LocationPermissionRuleResponseProjection.create", 0) + 1);
            this.create(new LocationPermissionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationCUDResponseProjection.LocationPermissionRuleResponseProjection.create", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LocationCUDResponseProjection.LocationPermissionRuleResponseProjection.update", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationCUDResponseProjection.LocationPermissionRuleResponseProjection.update", projectionDepthOnFields.getOrDefault("LocationCUDResponseProjection.LocationPermissionRuleResponseProjection.update", 0) + 1);
            this.update(new LocationPermissionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationCUDResponseProjection.LocationPermissionRuleResponseProjection.update", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LocationCUDResponseProjection.LocationPermissionRuleResponseProjection.delete", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationCUDResponseProjection.LocationPermissionRuleResponseProjection.delete", projectionDepthOnFields.getOrDefault("LocationCUDResponseProjection.LocationPermissionRuleResponseProjection.delete", 0) + 1);
            this.delete(new LocationPermissionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationCUDResponseProjection.LocationPermissionRuleResponseProjection.delete", 0)));
        }
        this.typename();
        return this;
    }

    public LocationCUDResponseProjection create(LocationPermissionRuleResponseProjection subProjection) {
        return create(null, subProjection);
    }

    public LocationCUDResponseProjection create(String alias, LocationPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("create").alias(alias).projection(subProjection));
        return this;
    }

    public LocationCUDResponseProjection update(LocationPermissionRuleResponseProjection subProjection) {
        return update(null, subProjection);
    }

    public LocationCUDResponseProjection update(String alias, LocationPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("update").alias(alias).projection(subProjection));
        return this;
    }

    public LocationCUDResponseProjection delete(LocationPermissionRuleResponseProjection subProjection) {
        return delete(null, subProjection);
    }

    public LocationCUDResponseProjection delete(String alias, LocationPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("delete").alias(alias).projection(subProjection));
        return this;
    }

    public LocationCUDResponseProjection typename() {
        return typename(null);
    }

    public LocationCUDResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
