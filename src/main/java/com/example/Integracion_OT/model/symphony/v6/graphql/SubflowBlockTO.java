package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubflowBlockTO implements java.io.Serializable, BlockDetailsTO {

    private FlowTO flow;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableExpressionTO> params;
    @javax.validation.constraints.NotNull
    private EntryPointTO entryPoint;
    @javax.validation.constraints.NotNull
    private ExitPointTO exitPoint;

    public SubflowBlockTO() {
    }

    public SubflowBlockTO(FlowTO flow, java.util.List<VariableExpressionTO> params, EntryPointTO entryPoint, ExitPointTO exitPoint) {
        this.flow = flow;
        this.params = params;
        this.entryPoint = entryPoint;
        this.exitPoint = exitPoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public FlowTO getFlow() {
        return flow;
    }

    public void setFlow(FlowTO flow) {
        this.flow = flow;
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

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (flow != null) {
            joiner.add("flow: " + GraphQLRequestSerializer.getEntry(flow));
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
        return joiner.toString();
    }

    public static class Builder {

        private FlowTO flow;
        private java.util.List<VariableExpressionTO> params;
        private EntryPointTO entryPoint;
        private ExitPointTO exitPoint;

        public Builder() {
        }

        public Builder setFlow(FlowTO flow) {
            this.flow = flow;
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


        public SubflowBlockTO build() {
            return new SubflowBlockTO(flow, params, entryPoint, exitPoint);
        }

    }
}
