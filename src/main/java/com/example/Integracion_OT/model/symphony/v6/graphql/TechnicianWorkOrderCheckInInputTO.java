package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TechnicianWorkOrderCheckInInputTO implements java.io.Serializable {

    private Double distanceMeters;
    private String checkInTime;

    public TechnicianWorkOrderCheckInInputTO() {
    }

    public TechnicianWorkOrderCheckInInputTO(Double distanceMeters, String checkInTime) {
        this.distanceMeters = distanceMeters;
        this.checkInTime = checkInTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Double getDistanceMeters() {
        return distanceMeters;
    }

    public void setDistanceMeters(Double distanceMeters) {
        this.distanceMeters = distanceMeters;
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (distanceMeters != null) {
            joiner.add("distanceMeters: " + GraphQLRequestSerializer.getEntry(distanceMeters));
        }
        if (checkInTime != null) {
            joiner.add("checkInTime: " + GraphQLRequestSerializer.getEntry(checkInTime));
        }
        return joiner.toString();
    }

    public static class Builder {

        private Double distanceMeters;
        private String checkInTime;

        public Builder() {
        }

        public Builder setDistanceMeters(Double distanceMeters) {
            this.distanceMeters = distanceMeters;
            return this;
        }

        public Builder setCheckInTime(String checkInTime) {
            this.checkInTime = checkInTime;
            return this;
        }


        public TechnicianWorkOrderCheckInInputTO build() {
            return new TechnicianWorkOrderCheckInInputTO(distanceMeters, checkInTime);
        }

    }
}
