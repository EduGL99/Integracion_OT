package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DecisionBlockInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cid;
    @javax.validation.constraints.NotNull
    private java.util.List<DecisionRouteInputTO> routes;
    private BlockUIRepresentationInputTO uiRepresentation;

    public DecisionBlockInputTO() {
    }

    public DecisionBlockInputTO(String cid, java.util.List<DecisionRouteInputTO> routes, BlockUIRepresentationInputTO uiRepresentation) {
        this.cid = cid;
        this.routes = routes;
        this.uiRepresentation = uiRepresentation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public java.util.List<DecisionRouteInputTO> getRoutes() {
        return routes;
    }

    public void setRoutes(java.util.List<DecisionRouteInputTO> routes) {
        this.routes = routes;
    }

    public BlockUIRepresentationInputTO getUiRepresentation() {
        return uiRepresentation;
    }

    public void setUiRepresentation(BlockUIRepresentationInputTO uiRepresentation) {
        this.uiRepresentation = uiRepresentation;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (cid != null) {
            joiner.add("cid: " + GraphQLRequestSerializer.getEntry(cid));
        }
        if (routes != null) {
            joiner.add("routes: " + GraphQLRequestSerializer.getEntry(routes));
        }
        if (uiRepresentation != null) {
            joiner.add("uiRepresentation: " + GraphQLRequestSerializer.getEntry(uiRepresentation));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String cid;
        private java.util.List<DecisionRouteInputTO> routes;
        private BlockUIRepresentationInputTO uiRepresentation;

        public Builder() {
        }

        public Builder setCid(String cid) {
            this.cid = cid;
            return this;
        }

        public Builder setRoutes(java.util.List<DecisionRouteInputTO> routes) {
            this.routes = routes;
            return this;
        }

        public Builder setUiRepresentation(BlockUIRepresentationInputTO uiRepresentation) {
            this.uiRepresentation = uiRepresentation;
            return this;
        }


        public DecisionBlockInputTO build() {
            return new DecisionBlockInputTO(cid, routes, uiRepresentation);
        }

    }
}
