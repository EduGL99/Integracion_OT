package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EndBlockTO implements java.io.Serializable, BlockDetailsTO {

    @javax.validation.constraints.NotNull
    private java.util.List<VariableExpressionTO> params;
    @javax.validation.constraints.NotNull
    private EntryPointTO entryPoint;

    public EndBlockTO() {
    }

    public EndBlockTO(java.util.List<VariableExpressionTO> params, EntryPointTO entryPoint) {
        this.params = params;
        this.entryPoint = entryPoint;
    }

    public static Builder builder() {
        return new Builder();
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

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (params != null) {
            joiner.add("params: " + GraphQLRequestSerializer.getEntry(params));
        }
        if (entryPoint != null) {
            joiner.add("entryPoint: " + GraphQLRequestSerializer.getEntry(entryPoint));
        }
        return joiner.toString();
    }

    public static class Builder {

        private java.util.List<VariableExpressionTO> params;
        private EntryPointTO entryPoint;

        public Builder() {
        }

        public Builder setParams(java.util.List<VariableExpressionTO> params) {
            this.params = params;
            return this;
        }

        public Builder setEntryPoint(EntryPointTO entryPoint) {
            this.entryPoint = entryPoint;
            return this;
        }


        public EndBlockTO build() {
            return new EndBlockTO(params, entryPoint);
        }

    }
}
