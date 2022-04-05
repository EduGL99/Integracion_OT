package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for LocationSearchResult
 */

public class LocationSearchResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public LocationSearchResultResponseProjection() {
    }

    public LocationSearchResultResponseProjection all$() {
        return all$(3);
    }

    public LocationSearchResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("LocationSearchResultResponseProjection.LocationResponseProjection.locations", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationSearchResultResponseProjection.LocationResponseProjection.locations", projectionDepthOnFields.getOrDefault("LocationSearchResultResponseProjection.LocationResponseProjection.locations", 0) + 1);
            this.locations(new LocationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationSearchResultResponseProjection.LocationResponseProjection.locations", 0)));
        }
        this.count();
        this.typename();
        return this;
    }

    public LocationSearchResultResponseProjection locations(LocationResponseProjection subProjection) {
        return locations(null, subProjection);
    }

    public LocationSearchResultResponseProjection locations(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("locations").alias(alias).projection(subProjection));
        return this;
    }

    public LocationSearchResultResponseProjection count() {
        return count(null);
    }

    public LocationSearchResultResponseProjection count(String alias) {
        fields.add(new GraphQLResponseField("count").alias(alias));
        return this;
    }

    public LocationSearchResultResponseProjection typename() {
        return typename(null);
    }

    public LocationSearchResultResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
