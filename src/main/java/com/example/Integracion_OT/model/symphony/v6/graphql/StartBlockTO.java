package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StartBlockTO implements java.io.Serializable, BlockDetailsTO {

    @javax.validation.constraints.NotNull
    private java.util.List<VariableDefinitionTO> paramDefinitions;
    @javax.validation.constraints.NotNull
    private ExitPointTO exitPoint;

    public StartBlockTO() {
    }

    public StartBlockTO(java.util.List<VariableDefinitionTO> paramDefinitions, ExitPointTO exitPoint) {
        this.paramDefinitions = paramDefinitions;
        this.exitPoint = exitPoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public java.util.List<VariableDefinitionTO> getParamDefinitions() {
        return paramDefinitions;
    }

    public void setParamDefinitions(java.util.List<VariableDefinitionTO> paramDefinitions) {
        this.paramDefinitions = paramDefinitions;
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
        if (paramDefinitions != null) {
            joiner.add("paramDefinitions: " + GraphQLRequestSerializer.getEntry(paramDefinitions));
        }
        if (exitPoint != null) {
            joiner.add("exitPoint: " + GraphQLRequestSerializer.getEntry(exitPoint));
        }
        return joiner.toString();
    }

    public static class Builder {

        private java.util.List<VariableDefinitionTO> paramDefinitions;
        private ExitPointTO exitPoint;

        public Builder() {
        }

        public Builder setParamDefinitions(java.util.List<VariableDefinitionTO> paramDefinitions) {
            this.paramDefinitions = paramDefinitions;
            return this;
        }

        public Builder setExitPoint(ExitPointTO exitPoint) {
            this.exitPoint = exitPoint;
            return this;
        }


        public StartBlockTO build() {
            return new StartBlockTO(paramDefinitions, exitPoint);
        }

    }
}
