package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CoordinatesTO implements java.io.Serializable {

    private double latitude;
    private double longitude;

    public CoordinatesTO() {
    }

    public CoordinatesTO(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public static Builder builder() {
        return new Builder();
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("latitude: " + GraphQLRequestSerializer.getEntry(latitude));
        joiner.add("longitude: " + GraphQLRequestSerializer.getEntry(longitude));
        return joiner.toString();
    }

    public static class Builder {

        private double latitude;
        private double longitude;

        public Builder() {
        }

        public Builder setLatitude(double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(double longitude) {
            this.longitude = longitude;
            return this;
        }


        public CoordinatesTO build() {
            return new CoordinatesTO(latitude, longitude);
        }

    }
}
