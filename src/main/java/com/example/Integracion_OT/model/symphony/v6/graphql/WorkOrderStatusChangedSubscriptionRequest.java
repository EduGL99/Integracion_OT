package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.*;


public class WorkOrderStatusChangedSubscriptionRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "workOrderStatusChanged";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.SUBSCRIPTION;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();
    private String alias;

    public WorkOrderStatusChangedSubscriptionRequest() {
    }

    public WorkOrderStatusChangedSubscriptionRequest(String alias) {
        this.alias = alias;
    }

    public static Builder builder() {
        return new Builder();
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

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }


        public WorkOrderStatusChangedSubscriptionRequest build() {
            WorkOrderStatusChangedSubscriptionRequest obj = new WorkOrderStatusChangedSubscriptionRequest($alias);
            return obj;
        }

    }
}
