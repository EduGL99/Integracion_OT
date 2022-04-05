package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddAppointmentInputTO implements java.io.Serializable {

    private String creatorId;
    @javax.validation.constraints.NotNull
    private String assigneeID;
    @javax.validation.constraints.NotNull
    private String workorderID;
    @javax.validation.constraints.NotNull
    private String date;
    private double duration;

    public AddAppointmentInputTO() {
    }

    public AddAppointmentInputTO(String creatorId, String assigneeID, String workorderID, String date, double duration) {
        this.creatorId = creatorId;
        this.assigneeID = assigneeID;
        this.workorderID = workorderID;
        this.date = date;
        this.duration = duration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getAssigneeID() {
        return assigneeID;
    }

    public void setAssigneeID(String assigneeID) {
        this.assigneeID = assigneeID;
    }

    public String getWorkorderID() {
        return workorderID;
    }

    public void setWorkorderID(String workorderID) {
        this.workorderID = workorderID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (creatorId != null) {
            joiner.add("creatorId: " + GraphQLRequestSerializer.getEntry(creatorId));
        }
        if (assigneeID != null) {
            joiner.add("assigneeID: " + GraphQLRequestSerializer.getEntry(assigneeID));
        }
        if (workorderID != null) {
            joiner.add("workorderID: " + GraphQLRequestSerializer.getEntry(workorderID));
        }
        if (date != null) {
            joiner.add("date: " + GraphQLRequestSerializer.getEntry(date));
        }
        joiner.add("duration: " + GraphQLRequestSerializer.getEntry(duration));
        return joiner.toString();
    }

    public static class Builder {

        private String creatorId;
        private String assigneeID;
        private String workorderID;
        private String date;
        private double duration;

        public Builder() {
        }

        public Builder setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        public Builder setAssigneeID(String assigneeID) {
            this.assigneeID = assigneeID;
            return this;
        }

        public Builder setWorkorderID(String workorderID) {
            this.workorderID = workorderID;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setDuration(double duration) {
            this.duration = duration;
            return this;
        }


        public AddAppointmentInputTO build() {
            return new AddAppointmentInputTO(creatorId, assigneeID, workorderID, date, duration);
        }

    }
}
