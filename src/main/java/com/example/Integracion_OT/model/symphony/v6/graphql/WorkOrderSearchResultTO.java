package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderSearchResultTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<WorkOrderTO> workOrders;
    private int count;

    public WorkOrderSearchResultTO() {
    }

    public WorkOrderSearchResultTO(java.util.List<WorkOrderTO> workOrders, int count) {
        this.workOrders = workOrders;
        this.count = count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public java.util.List<WorkOrderTO> getWorkOrders() {
        return workOrders;
    }

    public void setWorkOrders(java.util.List<WorkOrderTO> workOrders) {
        this.workOrders = workOrders;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (workOrders != null) {
            joiner.add("workOrders: " + GraphQLRequestSerializer.getEntry(workOrders));
        }
        joiner.add("count: " + GraphQLRequestSerializer.getEntry(count));
        return joiner.toString();
    }

    public static class Builder {

        private java.util.List<WorkOrderTO> workOrders;
        private int count;

        public Builder() {
        }

        public Builder setWorkOrders(java.util.List<WorkOrderTO> workOrders) {
            this.workOrders = workOrders;
            return this;
        }

        public Builder setCount(int count) {
            this.count = count;
            return this;
        }


        public WorkOrderSearchResultTO build() {
            return new WorkOrderSearchResultTO(workOrders, count);
        }

    }
}
