package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddCounterFormulaListInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String formulaFk;
    @javax.validation.constraints.NotNull
    private java.util.List<CounterListInputTO> counterList;

    public AddCounterFormulaListInputTO() {
    }

    public AddCounterFormulaListInputTO(String formulaFk, java.util.List<CounterListInputTO> counterList) {
        this.formulaFk = formulaFk;
        this.counterList = counterList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getFormulaFk() {
        return formulaFk;
    }

    public void setFormulaFk(String formulaFk) {
        this.formulaFk = formulaFk;
    }

    public java.util.List<CounterListInputTO> getCounterList() {
        return counterList;
    }

    public void setCounterList(java.util.List<CounterListInputTO> counterList) {
        this.counterList = counterList;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (formulaFk != null) {
            joiner.add("formulaFk: " + GraphQLRequestSerializer.getEntry(formulaFk));
        }
        if (counterList != null) {
            joiner.add("counterList: " + GraphQLRequestSerializer.getEntry(counterList));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String formulaFk;
        private java.util.List<CounterListInputTO> counterList;

        public Builder() {
        }

        public Builder setFormulaFk(String formulaFk) {
            this.formulaFk = formulaFk;
            return this;
        }

        public Builder setCounterList(java.util.List<CounterListInputTO> counterList) {
            this.counterList = counterList;
            return this;
        }


        public AddCounterFormulaListInputTO build() {
            return new AddCounterFormulaListInputTO(formulaFk, counterList);
        }

    }
}
