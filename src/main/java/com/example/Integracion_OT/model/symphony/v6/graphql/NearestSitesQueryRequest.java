package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.*;


public class NearestSitesQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "nearestSites";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();
    private String alias;

    public NearestSitesQueryRequest() {
    }

    public NearestSitesQueryRequest(String alias) {
        this.alias = alias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void setLatitude(double latitude) {
        this.input.put("latitude", latitude);
    }

    public void setLongitude(double longitude) {
        this.input.put("longitude", longitude);
    }

    public void setFirst(int first) {
        this.input.put("first", first);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public String getAlias() {
        return alias != null ? alias : OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public Set<String> getUseObjectMapperForInputSerialization() {
        return useObjectMapperForInputSerialization;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {

        private String $alias;
        private double latitude;
        private double longitude;
        private int first = 10;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setLatitude(double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(double longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder setFirst(int first) {
            this.first = first;
            return this;
        }


        public NearestSitesQueryRequest build() {
            NearestSitesQueryRequest obj = new NearestSitesQueryRequest($alias);
            obj.setLatitude(latitude);
            obj.setLongitude(longitude);
            obj.setFirst(first);
            return obj;
        }

    }
}
