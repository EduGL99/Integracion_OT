package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrueFalseBlockTO implements java.io.Serializable, BlockDetailsTO {

    @javax.validation.constraints.NotNull
    private EntryPointTO entryPoint;
    @javax.validation.constraints.NotNull
    private ExitPointTO trueExitPoint;
    @javax.validation.constraints.NotNull
    private ExitPointTO falseExitPoint;

    public TrueFalseBlockTO() {
    }

    public TrueFalseBlockTO(EntryPointTO entryPoint, ExitPointTO trueExitPoint, ExitPointTO falseExitPoint) {
        this.entryPoint = entryPoint;
        this.trueExitPoint = trueExitPoint;
        this.falseExitPoint = falseExitPoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public EntryPointTO getEntryPoint() {
        return entryPoint;
    }

    public void setEntryPoint(EntryPointTO entryPoint) {
        this.entryPoint = entryPoint;
    }

    public ExitPointTO getTrueExitPoint() {
        return trueExitPoint;
    }

    public void setTrueExitPoint(ExitPointTO trueExitPoint) {
        this.trueExitPoint = trueExitPoint;
    }

    public ExitPointTO getFalseExitPoint() {
        return falseExitPoint;
    }

    public void setFalseExitPoint(ExitPointTO falseExitPoint) {
        this.falseExitPoint = falseExitPoint;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entryPoint != null) {
            joiner.add("entryPoint: " + GraphQLRequestSerializer.getEntry(entryPoint));
        }
        if (trueExitPoint != null) {
            joiner.add("trueExitPoint: " + GraphQLRequestSerializer.getEntry(trueExitPoint));
        }
        if (falseExitPoint != null) {
            joiner.add("falseExitPoint: " + GraphQLRequestSerializer.getEntry(falseExitPoint));
        }
        return joiner.toString();
    }

    public static class Builder {

        private EntryPointTO entryPoint;
        private ExitPointTO trueExitPoint;
        private ExitPointTO falseExitPoint;

        public Builder() {
        }

        public Builder setEntryPoint(EntryPointTO entryPoint) {
            this.entryPoint = entryPoint;
            return this;
        }

        public Builder setTrueExitPoint(ExitPointTO trueExitPoint) {
            this.trueExitPoint = trueExitPoint;
            return this;
        }

        public Builder setFalseExitPoint(ExitPointTO falseExitPoint) {
            this.falseExitPoint = falseExitPoint;
            return this;
        }


        public TrueFalseBlockTO build() {
            return new TrueFalseBlockTO(entryPoint, trueExitPoint, falseExitPoint);
        }

    }
}
