package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FloorPlanScaleTO implements java.io.Serializable {

    private int referencePoint1X;
    private int referencePoint1Y;
    private int referencePoint2X;
    private int referencePoint2Y;
    private double scaleInMeters;

    public FloorPlanScaleTO() {
    }

    public FloorPlanScaleTO(int referencePoint1X, int referencePoint1Y, int referencePoint2X, int referencePoint2Y, double scaleInMeters) {
        this.referencePoint1X = referencePoint1X;
        this.referencePoint1Y = referencePoint1Y;
        this.referencePoint2X = referencePoint2X;
        this.referencePoint2Y = referencePoint2Y;
        this.scaleInMeters = scaleInMeters;
    }

    public static Builder builder() {
        return new Builder();
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
        joiner.add("referencePoint1X: " + GraphQLRequestSerializer.getEntry(referencePoint1X));
        joiner.add("referencePoint1Y: " + GraphQLRequestSerializer.getEntry(referencePoint1Y));
        joiner.add("referencePoint2X: " + GraphQLRequestSerializer.getEntry(referencePoint2X));
        joiner.add("referencePoint2Y: " + GraphQLRequestSerializer.getEntry(referencePoint2Y));
        joiner.add("scaleInMeters: " + GraphQLRequestSerializer.getEntry(scaleInMeters));
        return joiner.toString();
    }

    public static class Builder {

        private int referencePoint1X;
        private int referencePoint1Y;
        private int referencePoint2X;
        private int referencePoint2Y;
        private double scaleInMeters;

        public Builder() {
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


        public FloorPlanScaleTO build() {
            return new FloorPlanScaleTO(referencePoint1X, referencePoint1Y, referencePoint2X, referencePoint2Y, scaleInMeters);
        }

    }
}
