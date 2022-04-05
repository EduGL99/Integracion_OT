package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppointmentTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String creationDate;
    @javax.validation.constraints.NotNull
    private UserTO assignee;
    @javax.validation.constraints.NotNull
    private WorkOrderTO workOrder;
    @javax.validation.constraints.NotNull
    private String start;
    @javax.validation.constraints.NotNull
    private String end;
    private double duration;
    @javax.validation.constraints.NotNull
    private AppointmentStatusTO status;

    public AppointmentTO() {
    }

    public AppointmentTO(String id, String creationDate, UserTO assignee, WorkOrderTO workOrder, String start, String end, double duration, AppointmentStatusTO status) {
        this.id = id;
        this.creationDate = creationDate;
        this.assignee = assignee;
        this.workOrder = workOrder;
        this.start = start;
        this.end = end;
        this.duration = duration;
        this.status = status;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The id of the object.
     */
    public String getId() {
        return id;
    }

    /**
     * The id of the object.
     */
    public void setId(String id) {
        this.id = id;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public UserTO getAssignee() {
        return assignee;
    }

    public void setAssignee(UserTO assignee) {
        this.assignee = assignee;
    }

    public WorkOrderTO getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(WorkOrderTO workOrder) {
        this.workOrder = workOrder;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public AppointmentStatusTO getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatusTO status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (creationDate != null) {
            joiner.add("creationDate: " + GraphQLRequestSerializer.getEntry(creationDate));
        }
        if (assignee != null) {
            joiner.add("assignee: " + GraphQLRequestSerializer.getEntry(assignee));
        }
        if (workOrder != null) {
            joiner.add("workOrder: " + GraphQLRequestSerializer.getEntry(workOrder));
        }
        if (start != null) {
            joiner.add("start: " + GraphQLRequestSerializer.getEntry(start));
        }
        if (end != null) {
            joiner.add("end: " + GraphQLRequestSerializer.getEntry(end));
        }
        joiner.add("duration: " + GraphQLRequestSerializer.getEntry(duration));
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String creationDate;
        private UserTO assignee;
        private WorkOrderTO workOrder;
        private String start;
        private String end;
        private double duration;
        private AppointmentStatusTO status;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setCreationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public Builder setAssignee(UserTO assignee) {
            this.assignee = assignee;
            return this;
        }

        public Builder setWorkOrder(WorkOrderTO workOrder) {
            this.workOrder = workOrder;
            return this;
        }

        public Builder setStart(String start) {
            this.start = start;
            return this;
        }

        public Builder setEnd(String end) {
            this.end = end;
            return this;
        }

        public Builder setDuration(double duration) {
            this.duration = duration;
            return this;
        }

        public Builder setStatus(AppointmentStatusTO status) {
            this.status = status;
            return this;
        }


        public AppointmentTO build() {
            return new AppointmentTO(id, creationDate, assignee, workOrder, start, end, duration, status);
        }

    }
}
