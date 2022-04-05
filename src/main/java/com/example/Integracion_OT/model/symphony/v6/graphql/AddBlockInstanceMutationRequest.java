package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.*;


public class AddBlockInstanceMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "addBlockInstance";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();
    private String alias;

    public AddBlockInstanceMutationRequest() {
    }

    public AddBlockInstanceMutationRequest(String alias) {
        this.alias = alias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void setFlowInstanceId(String flowInstanceId) {
        this.input.put("flowInstanceId", flowInstanceId);
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

    public void setInput(AddBlockInstanceInputTO input) {
        this.input.put("input", input);
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
        private String flowInstanceId;
        private AddBlockInstanceInputTO input;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setFlowInstanceId(String flowInstanceId) {
            this.flowInstanceId = flowInstanceId;
            return this;
        }

        public Builder setInput(AddBlockInstanceInputTO input) {
            this.input = input;
            return this;
        }


        public AddBlockInstanceMutationRequest build() {
            AddBlockInstanceMutationRequest obj = new AddBlockInstanceMutationRequest($alias);
            obj.setFlowInstanceId(flowInstanceId);
            obj.setInput(input);
            return obj;
        }

    }
}
