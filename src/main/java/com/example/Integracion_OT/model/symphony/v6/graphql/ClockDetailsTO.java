package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClockDetailsTO implements java.io.Serializable {

    private ClockOutReasonTO clockOutReason;
    private Double distanceMeters;
    private String comment;

    public ClockDetailsTO() {
    }

    public ClockDetailsTO(ClockOutReasonTO clockOutReason, Double distanceMeters, String comment) {
        this.clockOutReason = clockOutReason;
        this.distanceMeters = distanceMeters;
        this.comment = comment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ClockOutReasonTO getClockOutReason() {
        return clockOutReason;
    }

    public void setClockOutReason(ClockOutReasonTO clockOutReason) {
        this.clockOutReason = clockOutReason;
    }

    public Double getDistanceMeters() {
        return distanceMeters;
    }

    public void setDistanceMeters(Double distanceMeters) {
        this.distanceMeters = distanceMeters;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clockOutReason != null) {
            joiner.add("clockOutReason: " + GraphQLRequestSerializer.getEntry(clockOutReason));
        }
        if (distanceMeters != null) {
            joiner.add("distanceMeters: " + GraphQLRequestSerializer.getEntry(distanceMeters));
        }
        if (comment != null) {
            joiner.add("comment: " + GraphQLRequestSerializer.getEntry(comment));
        }
        return joiner.toString();
    }

    public static class Builder {

        private ClockOutReasonTO clockOutReason;
        private Double distanceMeters;
        private String comment;

        public Builder() {
        }

        public Builder setClockOutReason(ClockOutReasonTO clockOutReason) {
            this.clockOutReason = clockOutReason;
            return this;
        }

        public Builder setDistanceMeters(Double distanceMeters) {
            this.distanceMeters = distanceMeters;
            return this;
        }

        public Builder setComment(String comment) {
            this.comment = comment;
            return this;
        }


        public ClockDetailsTO build() {
            return new ClockDetailsTO(clockOutReason, distanceMeters, comment);
        }

    }
}
