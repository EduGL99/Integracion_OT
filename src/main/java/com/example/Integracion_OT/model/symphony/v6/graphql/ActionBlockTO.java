package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionBlockTO implements java.io.Serializable, BlockDetailsTO {

    @javax.validation.constraints.NotNull
    private ActionTypeTO actionType;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableExpressionTO> params;
    @javax.validation.constraints.NotNull
    private EntryPointTO entryPoint;
    @javax.validation.constraints.NotNull
    private ExitPointTO exitPoint;
    private WorkOrderTypeTO workOrderType;
    private WorkerTypeTO workerType;

    public ActionBlockTO() {
    }

    public ActionBlockTO(ActionTypeTO actionType, java.util.List<VariableExpressionTO> params, EntryPointTO entryPoint, ExitPointTO exitPoint, WorkOrderTypeTO workOrderType, WorkerTypeTO workerType) {
        this.actionType = actionType;
        this.params = params;
        this.entryPoint = entryPoint;
        this.exitPoint = exitPoint;
        this.workOrderType = workOrderType;
        this.workerType = workerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ActionTypeTO getActionType() {
        return actionType;
    }

    public void setActionType(ActionTypeTO actionType) {
        this.actionType = actionType;
    }

    public java.util.List<VariableExpressionTO> getParams() {
        return params;
    }

    public void setParams(java.util.List<VariableExpressionTO> params) {
        this.params = params;
    }

    public EntryPointTO getEntryPoint() {
        return entryPoint;
    }

    public void setEntryPoint(EntryPointTO entryPoint) {
        this.entryPoint = entryPoint;
    }

    public ExitPointTO getExitPoint() {
        return exitPoint;
    }

    public void setExitPoint(ExitPointTO exitPoint) {
        this.exitPoint = exitPoint;
    }

    public WorkOrderTypeTO getWorkOrderType() {
        return workOrderType;
    }

    public void setWorkOrderType(WorkOrderTypeTO workOrderType) {
        this.workOrderType = workOrderType;
    }

    public WorkerTypeTO getWorkerType() {
        return workerType;
    }

    public void setWorkerType(WorkerTypeTO workerType) {
        this.workerType = workerType;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (actionType != null) {
            joiner.add("actionType: " + GraphQLRequestSerializer.getEntry(actionType));
        }
        if (params != null) {
            joiner.add("params: " + GraphQLRequestSerializer.getEntry(params));
        }
        if (entryPoint != null) {
            joiner.add("entryPoint: " + GraphQLRequestSerializer.getEntry(entryPoint));
        }
        if (exitPoint != null) {
            joiner.add("exitPoint: " + GraphQLRequestSerializer.getEntry(exitPoint));
        }
        if (workOrderType != null) {
            joiner.add("workOrderType: " + GraphQLRequestSerializer.getEntry(workOrderType));
        }
        if (workerType != null) {
            joiner.add("workerType: " + GraphQLRequestSerializer.getEntry(workerType));
        }
        return joiner.toString();
    }

    public static class Builder {

        private ActionTypeTO actionType;
        private java.util.List<VariableExpressionTO> params;
        private EntryPointTO entryPoint;
        private ExitPointTO exitPoint;
        private WorkOrderTypeTO workOrderType;
        private WorkerTypeTO workerType;

        public Builder() {
        }

        public Builder setActionType(ActionTypeTO actionType) {
            this.actionType = actionType;
            return this;
        }

        public Builder setParams(java.util.List<VariableExpressionTO> params) {
            this.params = params;
            return this;
        }

        public Builder setEntryPoint(EntryPointTO entryPoint) {
            this.entryPoint = entryPoint;
            return this;
        }

        public Builder setExitPoint(ExitPointTO exitPoint) {
            this.exitPoint = exitPoint;
            return this;
        }

        public Builder setWorkOrderType(WorkOrderTypeTO workOrderType) {
            this.workOrderType = workOrderType;
            return this;
        }

        public Builder setWorkerType(WorkerTypeTO workerType) {
            this.workerType = workerType;
            return this;
        }


        public ActionBlockTO build() {
            return new ActionBlockTO(actionType, params, entryPoint, exitPoint, workOrderType, workerType);
        }

    }
}
