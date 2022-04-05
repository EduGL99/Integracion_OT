package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.*;


public class AddTriggerBlockMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "addTriggerBlock";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();
    private String alias;

    public AddTriggerBlockMutationRequest() {
    }

    public AddTriggerBlockMutationRequest(String alias) {
        this.alias = alias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void setFlowDraftId(String flowDraftId) {
        this.input.put("flowDraftId", flowDraftId);
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

    public void setInput(TriggerBlockInputTO input) {
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
        private String flowDraftId;
        private TriggerBlockInputTO input;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setFlowDraftId(String flowDraftId) {
            this.flowDraftId = flowDraftId;
            return this;
        }

        public Builder setInput(TriggerBlockInputTO input) {
            this.input = input;
            return this;
        }


        public AddTriggerBlockMutationRequest build() {
            AddTriggerBlockMutationRequest obj = new AddTriggerBlockMutationRequest($alias);
            obj.setFlowDraftId(flowDraftId);
            obj.setInput(input);
            return obj;
        }

    }
}
