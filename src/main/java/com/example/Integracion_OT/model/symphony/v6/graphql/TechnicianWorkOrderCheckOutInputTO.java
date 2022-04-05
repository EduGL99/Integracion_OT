package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TechnicianWorkOrderCheckOutInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String workOrderId;
    @javax.validation.constraints.NotNull
    private ClockOutReasonTO reason;
    @javax.validation.constraints.NotNull
    private java.util.List<CheckListCategoryInputTO> checkListCategories;
    private String comment;
    private Double distanceMeters;
    private String checkOutTime;

    public TechnicianWorkOrderCheckOutInputTO() {
    }

    public TechnicianWorkOrderCheckOutInputTO(String workOrderId, ClockOutReasonTO reason, java.util.List<CheckListCategoryInputTO> checkListCategories, String comment, Double distanceMeters, String checkOutTime) {
        this.workOrderId = workOrderId;
        this.reason = reason;
        this.checkListCategories = checkListCategories;
        this.comment = comment;
        this.distanceMeters = distanceMeters;
        this.checkOutTime = checkOutTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
    }

    public ClockOutReasonTO getReason() {
        return reason;
    }

    public void setReason(ClockOutReasonTO reason) {
        this.reason = reason;
    }

    public java.util.List<CheckListCategoryInputTO> getCheckListCategories() {
        return checkListCategories;
    }

    public void setCheckListCategories(java.util.List<CheckListCategoryInputTO> checkListCategories) {
        this.checkListCategories = checkListCategories;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Double getDistanceMeters() {
        return distanceMeters;
    }

    public void setDistanceMeters(Double distanceMeters) {
        this.distanceMeters = distanceMeters;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (workOrderId != null) {
            joiner.add("workOrderId: " + GraphQLRequestSerializer.getEntry(workOrderId));
        }
        if (reason != null) {
            joiner.add("reason: " + GraphQLRequestSerializer.getEntry(reason));
        }
        if (checkListCategories != null) {
            joiner.add("checkListCategories: " + GraphQLRequestSerializer.getEntry(checkListCategories));
        }
        if (comment != null) {
            joiner.add("comment: " + GraphQLRequestSerializer.getEntry(comment));
        }
        if (distanceMeters != null) {
            joiner.add("distanceMeters: " + GraphQLRequestSerializer.getEntry(distanceMeters));
        }
        if (checkOutTime != null) {
            joiner.add("checkOutTime: " + GraphQLRequestSerializer.getEntry(checkOutTime));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String workOrderId;
        private ClockOutReasonTO reason;
        private java.util.List<CheckListCategoryInputTO> checkListCategories;
        private String comment;
        private Double distanceMeters;
        private String checkOutTime;

        public Builder() {
        }

        public Builder setWorkOrderId(String workOrderId) {
            this.workOrderId = workOrderId;
            return this;
        }

        public Builder setReason(ClockOutReasonTO reason) {
            this.reason = reason;
            return this;
        }

        public Builder setCheckListCategories(java.util.List<CheckListCategoryInputTO> checkListCategories) {
            this.checkListCategories = checkListCategories;
            return this;
        }

        public Builder setComment(String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setDistanceMeters(Double distanceMeters) {
            this.distanceMeters = distanceMeters;
            return this;
        }

        public Builder setCheckOutTime(String checkOutTime) {
            this.checkOutTime = checkOutTime;
            return this;
        }


        public TechnicianWorkOrderCheckOutInputTO build() {
            return new TechnicianWorkOrderCheckOutInputTO(workOrderId, reason, checkListCategories, comment, distanceMeters, checkOutTime);
        }

    }
}
