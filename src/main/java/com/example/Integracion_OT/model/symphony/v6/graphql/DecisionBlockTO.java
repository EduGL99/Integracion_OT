package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DecisionBlockTO implements java.io.Serializable, BlockDetailsTO {

    @javax.validation.constraints.NotNull
    private EntryPointTO entryPoint;
    @javax.validation.constraints.NotNull
    private ExitPointTO defaultExitPoint;
    @javax.validation.constraints.NotNull
    private java.util.List<DecisionRouteTO> routes;

    public DecisionBlockTO() {
    }

    public DecisionBlockTO(EntryPointTO entryPoint, ExitPointTO defaultExitPoint, java.util.List<DecisionRouteTO> routes) {
        this.entryPoint = entryPoint;
        this.defaultExitPoint = defaultExitPoint;
        this.routes = routes;
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

    public ExitPointTO getDefaultExitPoint() {
        return defaultExitPoint;
    }

    public void setDefaultExitPoint(ExitPointTO defaultExitPoint) {
        this.defaultExitPoint = defaultExitPoint;
    }

    public java.util.List<DecisionRouteTO> getRoutes() {
        return routes;
    }

    public void setRoutes(java.util.List<DecisionRouteTO> routes) {
        this.routes = routes;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entryPoint != null) {
            joiner.add("entryPoint: " + GraphQLRequestSerializer.getEntry(entryPoint));
        }
        if (defaultExitPoint != null) {
            joiner.add("defaultExitPoint: " + GraphQLRequestSerializer.getEntry(defaultExitPoint));
        }
        if (routes != null) {
            joiner.add("routes: " + GraphQLRequestSerializer.getEntry(routes));
        }
        return joiner.toString();
    }

    public static class Builder {

        private EntryPointTO entryPoint;
        private ExitPointTO defaultExitPoint;
        private java.util.List<DecisionRouteTO> routes;

        public Builder() {
        }

        public Builder setEntryPoint(EntryPointTO entryPoint) {
            this.entryPoint = entryPoint;
            return this;
        }

        public Builder setDefaultExitPoint(ExitPointTO defaultExitPoint) {
            this.defaultExitPoint = defaultExitPoint;
            return this;
        }

        public Builder setRoutes(java.util.List<DecisionRouteTO> routes) {
            this.routes = routes;
            return this;
        }


        public DecisionBlockTO build() {
            return new DecisionBlockTO(entryPoint, defaultExitPoint, routes);
        }

    }
}
