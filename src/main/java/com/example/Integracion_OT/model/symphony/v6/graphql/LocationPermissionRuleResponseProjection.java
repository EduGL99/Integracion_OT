package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for LocationPermissionRule
 */

public class LocationPermissionRuleResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public LocationPermissionRuleResponseProjection() {
    }

    public LocationPermissionRuleResponseProjection all$() {
        return all$(3);
    }

    public LocationPermissionRuleResponseProjection all$(int maxDepth) {
        this.isAllowed();
        this.locationTypeIds();
        this.typename();
        return this;
    }

    public LocationPermissionRuleResponseProjection isAllowed() {
        return isAllowed(null);
    }

    public LocationPermissionRuleResponseProjection isAllowed(String alias) {
        fields.add(new GraphQLResponseField("isAllowed").alias(alias));
        return this;
    }

    public LocationPermissionRuleResponseProjection locationTypeIds() {
        return locationTypeIds(null);
    }

    public LocationPermissionRuleResponseProjection locationTypeIds(String alias) {
        fields.add(new GraphQLResponseField("locationTypeIds").alias(alias));
        return this;
    }

    public LocationPermissionRuleResponseProjection typename() {
        return typename(null);
    }

    public LocationPermissionRuleResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
