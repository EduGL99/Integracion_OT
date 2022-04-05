package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.*;


public class MarkSiteSurveyNeededMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "markSiteSurveyNeeded";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();
    private String alias;

    public MarkSiteSurveyNeededMutationRequest() {
    }

    public MarkSiteSurveyNeededMutationRequest(String alias) {
        this.alias = alias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void setLocationId(String locationId) {
        this.input.put("locationId", locationId);
    }

    public void setNeeded(boolean needed) {
        this.input.put("needed", needed);
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
        private String locationId;
        private boolean needed;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setLocationId(String locationId) {
            this.locationId = locationId;
            return this;
        }

        public Builder setNeeded(boolean needed) {
            this.needed = needed;
            return this;
        }


        public MarkSiteSurveyNeededMutationRequest build() {
            MarkSiteSurveyNeededMutationRequest obj = new MarkSiteSurveyNeededMutationRequest($alias);
            obj.setLocationId(locationId);
            obj.setNeeded(needed);
            return obj;
        }

    }
}
