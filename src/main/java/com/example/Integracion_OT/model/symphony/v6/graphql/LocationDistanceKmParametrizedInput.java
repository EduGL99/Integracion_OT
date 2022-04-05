package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

/**
 * Parametrized input for field distanceKm in type Location
 */

public class LocationDistanceKmParametrizedInput implements GraphQLParametrizedInput {

    private double latitude;
    private double longitude;

    public LocationDistanceKmParametrizedInput() {
    }

    public LocationDistanceKmParametrizedInput(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public LocationDistanceKmParametrizedInput latitude(double latitude) {
        this.latitude = latitude;
        return this;
    }

    public LocationDistanceKmParametrizedInput longitude(double longitude) {
        this.longitude = longitude;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        joiner.add("latitude: " + GraphQLRequestSerializer.getEntry(latitude));
        joiner.add("longitude: " + GraphQLRequestSerializer.getEntry(longitude));
        return joiner.toString();
    }

}
