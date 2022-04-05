package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FloorPlanReferencePointTO implements java.io.Serializable {

    private int x;
    private int y;
    private double latitude;
    private double longitude;

    public FloorPlanReferencePointTO() {
    }

    public FloorPlanReferencePointTO(int x, int y, double latitude, double longitude) {
        this.x = x;
        this.y = y;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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
        joiner.add("x: " + GraphQLRequestSerializer.getEntry(x));
        joiner.add("y: " + GraphQLRequestSerializer.getEntry(y));
        joiner.add("latitude: " + GraphQLRequestSerializer.getEntry(latitude));
        joiner.add("longitude: " + GraphQLRequestSerializer.getEntry(longitude));
        return joiner.toString();
    }

    public static class Builder {

        private int x;
        private int y;
        private double latitude;
        private double longitude;

        public Builder() {
        }

        public Builder setX(int x) {
            this.x = x;
            return this;
        }

        public Builder setY(int y) {
            this.y = y;
            return this;
        }

        public Builder setLatitude(double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(double longitude) {
            this.longitude = longitude;
            return this;
        }


        public FloorPlanReferencePointTO build() {
            return new FloorPlanReferencePointTO(x, y, latitude, longitude);
        }

    }
}
