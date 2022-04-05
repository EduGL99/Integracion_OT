package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DecisionRouteTO implements java.io.Serializable {

    private ExitPointTO exitPoint;

    public DecisionRouteTO() {
    }

    public DecisionRouteTO(ExitPointTO exitPoint) {
        this.exitPoint = exitPoint;
    }

    public static Builder builder() {
        return new Builder();
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
        if (exitPoint != null) {
            joiner.add("exitPoint: " + GraphQLRequestSerializer.getEntry(exitPoint));
        }
        return joiner.toString();
    }

    public static class Builder {

        private ExitPointTO exitPoint;

        public Builder() {
        }

        public Builder setExitPoint(ExitPointTO exitPoint) {
            this.exitPoint = exitPoint;
            return this;
        }


        public DecisionRouteTO build() {
            return new DecisionRouteTO(exitPoint);
        }

    }
}
