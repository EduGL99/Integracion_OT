package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddCounterFormulaInputTO implements java.io.Serializable {

    private boolean mandatory;
    @javax.validation.constraints.NotNull
    private String counterFk;
    @javax.validation.constraints.NotNull
    private String formulaFk;

    public AddCounterFormulaInputTO() {
    }

    public AddCounterFormulaInputTO(boolean mandatory, String counterFk, String formulaFk) {
        this.mandatory = mandatory;
        this.counterFk = counterFk;
        this.formulaFk = formulaFk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    public String getCounterFk() {
        return counterFk;
    }

    public void setCounterFk(String counterFk) {
        this.counterFk = counterFk;
    }

    public String getFormulaFk() {
        return formulaFk;
    }

    public void setFormulaFk(String formulaFk) {
        this.formulaFk = formulaFk;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("mandatory: " + GraphQLRequestSerializer.getEntry(mandatory));
        if (counterFk != null) {
            joiner.add("counterFk: " + GraphQLRequestSerializer.getEntry(counterFk));
        }
        if (formulaFk != null) {
            joiner.add("formulaFk: " + GraphQLRequestSerializer.getEntry(formulaFk));
        }
        return joiner.toString();
    }

    public static class Builder {

        private boolean mandatory;
        private String counterFk;
        private String formulaFk;

        public Builder() {
        }

        public Builder setMandatory(boolean mandatory) {
            this.mandatory = mandatory;
            return this;
        }

        public Builder setCounterFk(String counterFk) {
            this.counterFk = counterFk;
            return this;
        }

        public Builder setFormulaFk(String formulaFk) {
            this.formulaFk = formulaFk;
            return this;
        }


        public AddCounterFormulaInputTO build() {
            return new AddCounterFormulaInputTO(mandatory, counterFk, formulaFk);
        }

    }
}
