package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderStatusChangedPayloadTO implements java.io.Serializable {

    private WorkOrderStatusTO from;
    @javax.validation.constraints.NotNull
    private WorkOrderStatusTO to;
    @javax.validation.constraints.NotNull
    private WorkOrderTO workOrder;

    public WorkOrderStatusChangedPayloadTO() {
    }

    public WorkOrderStatusChangedPayloadTO(WorkOrderStatusTO from, WorkOrderStatusTO to, WorkOrderTO workOrder) {
        this.from = from;
        this.to = to;
        this.workOrder = workOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * Previous status of the work order.
     */
    public WorkOrderStatusTO getFrom() {
        return from;
    }

    /**
     * Previous status of the work order.
     */
    public void setFrom(WorkOrderStatusTO from) {
        this.from = from;
    }

    /**
     * Current status of the work order.
     */
    public WorkOrderStatusTO getTo() {
        return to;
    }

    /**
     * Current status of the work order.
     */
    public void setTo(WorkOrderStatusTO to) {
        this.to = to;
    }

    /**
     * The work order of which status was modified.
     */
    public WorkOrderTO getWorkOrder() {
        return workOrder;
    }

    /**
     * The work order of which status was modified.
     */
    public void setWorkOrder(WorkOrderTO workOrder) {
        this.workOrder = workOrder;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (from != null) {
            joiner.add("from: " + GraphQLRequestSerializer.getEntry(from));
        }
        if (to != null) {
            joiner.add("to: " + GraphQLRequestSerializer.getEntry(to));
        }
        if (workOrder != null) {
            joiner.add("workOrder: " + GraphQLRequestSerializer.getEntry(workOrder));
        }
        return joiner.toString();
    }

    public static class Builder {

        private WorkOrderStatusTO from;
        private WorkOrderStatusTO to;
        private WorkOrderTO workOrder;

        public Builder() {
        }

        /**
         * Previous status of the work order.
         */
        public Builder setFrom(WorkOrderStatusTO from) {
            this.from = from;
            return this;
        }

        /**
         * Current status of the work order.
         */
        public Builder setTo(WorkOrderStatusTO to) {
            this.to = to;
            return this;
        }

        /**
         * The work order of which status was modified.
         */
        public Builder setWorkOrder(WorkOrderTO workOrder) {
            this.workOrder = workOrder;
            return this;
        }


        public WorkOrderStatusChangedPayloadTO build() {
            return new WorkOrderStatusChangedPayloadTO(from, to, workOrder);
        }

    }
}
