package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CounterFormulaTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    private boolean mandatory;
    @javax.validation.constraints.NotNull
    private CounterTO counterFk;
    @javax.validation.constraints.NotNull
    private FormulaTO formulaFk;

    public CounterFormulaTO() {
    }

    public CounterFormulaTO(String id, boolean mandatory, CounterTO counterFk, FormulaTO formulaFk) {
        this.id = id;
        this.mandatory = mandatory;
        this.counterFk = counterFk;
        this.formulaFk = formulaFk;
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

    public boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    public CounterTO getCounterFk() {
        return counterFk;
    }

    public void setCounterFk(CounterTO counterFk) {
        this.counterFk = counterFk;
    }

    public FormulaTO getFormulaFk() {
        return formulaFk;
    }

    public void setFormulaFk(FormulaTO formulaFk) {
        this.formulaFk = formulaFk;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
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

        private String id;
        private boolean mandatory;
        private CounterTO counterFk;
        private FormulaTO formulaFk;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setMandatory(boolean mandatory) {
            this.mandatory = mandatory;
            return this;
        }

        public Builder setCounterFk(CounterTO counterFk) {
            this.counterFk = counterFk;
            return this;
        }

        public Builder setFormulaFk(FormulaTO formulaFk) {
            this.formulaFk = formulaFk;
            return this;
        }


        public CounterFormulaTO build() {
            return new CounterFormulaTO(id, mandatory, counterFk, formulaFk);
        }

    }
}
