package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.*;


public class RemoveEquipmentFromPositionMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "removeEquipmentFromPosition";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();
    private String alias;

    public RemoveEquipmentFromPositionMutationRequest() {
    }

    public RemoveEquipmentFromPositionMutationRequest(String alias) {
        this.alias = alias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void setPositionId(String positionId) {
        this.input.put("positionId", positionId);
    }

    public void setWorkOrderId(String workOrderId) {
        this.input.put("workOrderId", workOrderId);
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
        private String positionId;
        private String workOrderId;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setPositionId(String positionId) {
            this.positionId = positionId;
            return this;
        }

        public Builder setWorkOrderId(String workOrderId) {
            this.workOrderId = workOrderId;
            return this;
        }


        public RemoveEquipmentFromPositionMutationRequest build() {
            RemoveEquipmentFromPositionMutationRequest obj = new RemoveEquipmentFromPositionMutationRequest($alias);
            obj.setPositionId(positionId);
            obj.setWorkOrderId(workOrderId);
            return obj;
        }

    }
}
