package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TriggerBlockTO implements java.io.Serializable, BlockDetailsTO {

    @javax.validation.constraints.NotNull
    private TriggerTypeTO triggerType;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableExpressionTO> params;
    @javax.validation.constraints.NotNull
    private ExitPointTO exitPoint;

    public TriggerBlockTO() {
    }

    public TriggerBlockTO(TriggerTypeTO triggerType, java.util.List<VariableExpressionTO> params, ExitPointTO exitPoint) {
        this.triggerType = triggerType;
        this.params = params;
        this.exitPoint = exitPoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public TriggerTypeTO getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(TriggerTypeTO triggerType) {
        this.triggerType = triggerType;
    }

    public java.util.List<VariableExpressionTO> getParams() {
        return params;
    }

    public void setParams(java.util.List<VariableExpressionTO> params) {
        this.params = params;
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
        if (triggerType != null) {
            joiner.add("triggerType: " + GraphQLRequestSerializer.getEntry(triggerType));
        }
        if (params != null) {
            joiner.add("params: " + GraphQLRequestSerializer.getEntry(params));
        }
        if (exitPoint != null) {
            joiner.add("exitPoint: " + GraphQLRequestSerializer.getEntry(exitPoint));
        }
        return joiner.toString();
    }

    public static class Builder {

        private TriggerTypeTO triggerType;
        private java.util.List<VariableExpressionTO> params;
        private ExitPointTO exitPoint;

        public Builder() {
        }

        public Builder setTriggerType(TriggerTypeTO triggerType) {
            this.triggerType = triggerType;
            return this;
        }

        public Builder setParams(java.util.List<VariableExpressionTO> params) {
            this.params = params;
            return this;
        }

        public Builder setExitPoint(ExitPointTO exitPoint) {
            this.exitPoint = exitPoint;
            return this;
        }


        public TriggerBlockTO build() {
            return new TriggerBlockTO(triggerType, params, exitPoint);
        }

    }
}
