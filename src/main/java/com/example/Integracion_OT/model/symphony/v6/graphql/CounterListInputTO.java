package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CounterListInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String counterFk;
    private boolean mandatory;

    public CounterListInputTO() {
    }

    public CounterListInputTO(String counterFk, boolean mandatory) {
        this.counterFk = counterFk;
        this.mandatory = mandatory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getCounterFk() {
        return counterFk;
    }

    public void setCounterFk(String counterFk) {
        this.counterFk = counterFk;
    }

    public boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (counterFk != null) {
            joiner.add("counterFk: " + GraphQLRequestSerializer.getEntry(counterFk));
        }
        joiner.add("mandatory: " + GraphQLRequestSerializer.getEntry(mandatory));
        return joiner.toString();
    }

    public static class Builder {

        private String counterFk;
        private boolean mandatory;

        public Builder() {
        }

        public Builder setCounterFk(String counterFk) {
            this.counterFk = counterFk;
            return this;
        }

        public Builder setMandatory(boolean mandatory) {
            this.mandatory = mandatory;
            return this;
        }


        public CounterListInputTO build() {
            return new CounterListInputTO(counterFk, mandatory);
        }

    }
}
