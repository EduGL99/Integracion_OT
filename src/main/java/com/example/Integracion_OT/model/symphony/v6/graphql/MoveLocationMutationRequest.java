package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.*;


public class MoveLocationMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "moveLocation";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();
    private String alias;

    public MoveLocationMutationRequest() {
    }

    public MoveLocationMutationRequest(String alias) {
        this.alias = alias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void setLocationID(String locationID) {
        this.input.put("locationID", locationID);
    }

    public void setParentLocationID(String parentLocationID) {
        this.input.put("parentLocationID", parentLocationID);
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
        private String locationID;
        private String parentLocationID;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setLocationID(String locationID) {
            this.locationID = locationID;
            return this;
        }

        public Builder setParentLocationID(String parentLocationID) {
            this.parentLocationID = parentLocationID;
            return this;
        }


        public MoveLocationMutationRequest build() {
            MoveLocationMutationRequest obj = new MoveLocationMutationRequest($alias);
            obj.setLocationID(locationID);
            obj.setParentLocationID(parentLocationID);
            return obj;
        }

    }
}
