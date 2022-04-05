package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddFloorPlanInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String locationID;
    @javax.validation.constraints.NotNull
    private AddImageInputTO image;
    private int referenceX;
    private int referenceY;
    private double latitude;
    private double longitude;
    private int referencePoint1X;
    private int referencePoint1Y;
    private int referencePoint2X;
    private int referencePoint2Y;
    private double scaleInMeters;

    public AddFloorPlanInputTO() {
    }

    public AddFloorPlanInputTO(String name, String locationID, AddImageInputTO image, int referenceX, int referenceY, double latitude, double longitude, int referencePoint1X, int referencePoint1Y, int referencePoint2X, int referencePoint2Y, double scaleInMeters) {
        this.name = name;
        this.locationID = locationID;
        this.image = image;
        this.referenceX = referenceX;
        this.referenceY = referenceY;
        this.latitude = latitude;
        this.longitude = longitude;
        this.referencePoint1X = referencePoint1X;
        this.referencePoint1Y = referencePoint1Y;
        this.referencePoint2X = referencePoint2X;
        this.referencePoint2Y = referencePoint2Y;
        this.scaleInMeters = scaleInMeters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public AddImageInputTO getImage() {
        return image;
    }

    public void setImage(AddImageInputTO image) {
        this.image = image;
    }

    public int getReferenceX() {
        return referenceX;
    }

    public void setReferenceX(int referenceX) {
        this.referenceX = referenceX;
    }

    public int getReferenceY() {
        return referenceY;
    }

    public void setReferenceY(int referenceY) {
        this.referenceY = referenceY;
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

    public int getReferencePoint1X() {
        return referencePoint1X;
    }

    public void setReferencePoint1X(int referencePoint1X) {
        this.referencePoint1X = referencePoint1X;
    }

    public int getReferencePoint1Y() {
        return referencePoint1Y;
    }

    public void setReferencePoint1Y(int referencePoint1Y) {
        this.referencePoint1Y = referencePoint1Y;
    }

    public int getReferencePoint2X() {
        return referencePoint2X;
    }

    public void setReferencePoint2X(int referencePoint2X) {
        this.referencePoint2X = referencePoint2X;
    }

    public int getReferencePoint2Y() {
        return referencePoint2Y;
    }

    public void setReferencePoint2Y(int referencePoint2Y) {
        this.referencePoint2Y = referencePoint2Y;
    }

    public double getScaleInMeters() {
        return scaleInMeters;
    }

    public void setScaleInMeters(double scaleInMeters) {
        this.scaleInMeters = scaleInMeters;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (locationID != null) {
            joiner.add("locationID: " + GraphQLRequestSerializer.getEntry(locationID));
        }
        if (image != null) {
            joiner.add("image: " + GraphQLRequestSerializer.getEntry(image));
        }
        joiner.add("referenceX: " + GraphQLRequestSerializer.getEntry(referenceX));
        joiner.add("referenceY: " + GraphQLRequestSerializer.getEntry(referenceY));
        joiner.add("latitude: " + GraphQLRequestSerializer.getEntry(latitude));
        joiner.add("longitude: " + GraphQLRequestSerializer.getEntry(longitude));
        joiner.add("referencePoint1X: " + GraphQLRequestSerializer.getEntry(referencePoint1X));
        joiner.add("referencePoint1Y: " + GraphQLRequestSerializer.getEntry(referencePoint1Y));
        joiner.add("referencePoint2X: " + GraphQLRequestSerializer.getEntry(referencePoint2X));
        joiner.add("referencePoint2Y: " + GraphQLRequestSerializer.getEntry(referencePoint2Y));
        joiner.add("scaleInMeters: " + GraphQLRequestSerializer.getEntry(scaleInMeters));
        return joiner.toString();
    }

    public static class Builder {

        private String name;
        private String locationID;
        private AddImageInputTO image;
        private int referenceX;
        private int referenceY;
        private double latitude;
        private double longitude;
        private int referencePoint1X;
        private int referencePoint1Y;
        private int referencePoint2X;
        private int referencePoint2Y;
        private double scaleInMeters;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLocationID(String locationID) {
            this.locationID = locationID;
            return this;
        }

        public Builder setImage(AddImageInputTO image) {
            this.image = image;
            return this;
        }

        public Builder setReferenceX(int referenceX) {
            this.referenceX = referenceX;
            return this;
        }

        public Builder setReferenceY(int referenceY) {
            this.referenceY = referenceY;
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

        public Builder setReferencePoint1X(int referencePoint1X) {
            this.referencePoint1X = referencePoint1X;
            return this;
        }

        public Builder setReferencePoint1Y(int referencePoint1Y) {
            this.referencePoint1Y = referencePoint1Y;
            return this;
        }

        public Builder setReferencePoint2X(int referencePoint2X) {
            this.referencePoint2X = referencePoint2X;
            return this;
        }

        public Builder setReferencePoint2Y(int referencePoint2Y) {
            this.referencePoint2Y = referencePoint2Y;
            return this;
        }

        public Builder setScaleInMeters(double scaleInMeters) {
            this.scaleInMeters = scaleInMeters;
            return this;
        }


        public AddFloorPlanInputTO build() {
            return new AddFloorPlanInputTO(name, locationID, image, referenceX, referenceY, latitude, longitude, referencePoint1X, referencePoint1Y, referencePoint2X, referencePoint2Y, scaleInMeters);
        }

    }
}
