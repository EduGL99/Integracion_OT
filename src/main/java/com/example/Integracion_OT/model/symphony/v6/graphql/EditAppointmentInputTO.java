package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditAppointmentInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private String assigneeID;
    private String workorderID;
    private String date;
    private AppointmentStatusTO status;
    private Double duration;

    public EditAppointmentInputTO() {
    }

    public EditAppointmentInputTO(String id, String assigneeID, String workorderID, String date, AppointmentStatusTO status, Double duration) {
        this.id = id;
        this.assigneeID = assigneeID;
        this.workorderID = workorderID;
        this.date = date;
        this.status = status;
        this.duration = duration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public AppointmentStatusTO getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatusTO status) {
        this.status = status;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
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
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (duration != null) {
            joiner.add("duration: " + GraphQLRequestSerializer.getEntry(duration));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String assigneeID;
        private String workorderID;
        private String date;
        private AppointmentStatusTO status;
        private Double duration;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
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

        public Builder setStatus(AppointmentStatusTO status) {
            this.status = status;
            return this;
        }

        public Builder setDuration(Double duration) {
            this.duration = duration;
            return this;
        }


        public EditAppointmentInputTO build() {
            return new EditAppointmentInputTO(id, assigneeID, workorderID, date, status, duration);
        }

    }
}
