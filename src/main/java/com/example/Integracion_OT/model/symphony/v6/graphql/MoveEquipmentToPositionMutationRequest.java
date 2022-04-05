package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.*;


public class MoveEquipmentToPositionMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "moveEquipmentToPosition";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();
    private String alias;

    public MoveEquipmentToPositionMutationRequest() {
    }

    public MoveEquipmentToPositionMutationRequest(String alias) {
        this.alias = alias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void setParentEquipmentId(String parentEquipmentId) {
        this.input.put("parentEquipmentId", parentEquipmentId);
    }

    public void setPositionDefinitionId(String positionDefinitionId) {
        this.input.put("positionDefinitionId", positionDefinitionId);
    }

    public void setEquipmentId(String equipmentId) {
        this.input.put("equipmentId", equipmentId);
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
        private String parentEquipmentId;
        private String positionDefinitionId;
        private String equipmentId;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setParentEquipmentId(String parentEquipmentId) {
            this.parentEquipmentId = parentEquipmentId;
            return this;
        }

        public Builder setPositionDefinitionId(String positionDefinitionId) {
            this.positionDefinitionId = positionDefinitionId;
            return this;
        }

        public Builder setEquipmentId(String equipmentId) {
            this.equipmentId = equipmentId;
            return this;
        }


        public MoveEquipmentToPositionMutationRequest build() {
            MoveEquipmentToPositionMutationRequest obj = new MoveEquipmentToPositionMutationRequest($alias);
            obj.setParentEquipmentId(parentEquipmentId);
            obj.setPositionDefinitionId(positionDefinitionId);
            obj.setEquipmentId(equipmentId);
            return obj;
        }

    }
}
