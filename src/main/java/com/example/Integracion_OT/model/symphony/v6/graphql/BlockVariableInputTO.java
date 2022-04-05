package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockVariableInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String blockCid;
    @javax.validation.constraints.NotNull
    private VariableExpressionTypeTO type;
    private String variableDefinitionKey;
    private Integer propertyTypeId;
    private Integer checkListItemDefinitionId;

    public BlockVariableInputTO() {
    }

    public BlockVariableInputTO(String blockCid, VariableExpressionTypeTO type, String variableDefinitionKey, Integer propertyTypeId, Integer checkListItemDefinitionId) {
        this.blockCid = blockCid;
        this.type = type;
        this.variableDefinitionKey = variableDefinitionKey;
        this.propertyTypeId = propertyTypeId;
        this.checkListItemDefinitionId = checkListItemDefinitionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getBlockCid() {
        return blockCid;
    }

    public void setBlockCid(String blockCid) {
        this.blockCid = blockCid;
    }

    public VariableExpressionTypeTO getType() {
        return type;
    }

    public void setType(VariableExpressionTypeTO type) {
        this.type = type;
    }

    public String getVariableDefinitionKey() {
        return variableDefinitionKey;
    }

    public void setVariableDefinitionKey(String variableDefinitionKey) {
        this.variableDefinitionKey = variableDefinitionKey;
    }

    public Integer getPropertyTypeId() {
        return propertyTypeId;
    }

    public void setPropertyTypeId(Integer propertyTypeId) {
        this.propertyTypeId = propertyTypeId;
    }

    public Integer getCheckListItemDefinitionId() {
        return checkListItemDefinitionId;
    }

    public void setCheckListItemDefinitionId(Integer checkListItemDefinitionId) {
        this.checkListItemDefinitionId = checkListItemDefinitionId;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (blockCid != null) {
            joiner.add("blockCid: " + GraphQLRequestSerializer.getEntry(blockCid));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (variableDefinitionKey != null) {
            joiner.add("variableDefinitionKey: " + GraphQLRequestSerializer.getEntry(variableDefinitionKey));
        }
        if (propertyTypeId != null) {
            joiner.add("propertyTypeId: " + GraphQLRequestSerializer.getEntry(propertyTypeId));
        }
        if (checkListItemDefinitionId != null) {
            joiner.add("checkListItemDefinitionId: " + GraphQLRequestSerializer.getEntry(checkListItemDefinitionId));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String blockCid;
        private VariableExpressionTypeTO type;
        private String variableDefinitionKey;
        private Integer propertyTypeId;
        private Integer checkListItemDefinitionId;

        public Builder() {
        }

        public Builder setBlockCid(String blockCid) {
            this.blockCid = blockCid;
            return this;
        }

        public Builder setType(VariableExpressionTypeTO type) {
            this.type = type;
            return this;
        }

        public Builder setVariableDefinitionKey(String variableDefinitionKey) {
            this.variableDefinitionKey = variableDefinitionKey;
            return this;
        }

        public Builder setPropertyTypeId(Integer propertyTypeId) {
            this.propertyTypeId = propertyTypeId;
            return this;
        }

        public Builder setCheckListItemDefinitionId(Integer checkListItemDefinitionId) {
            this.checkListItemDefinitionId = checkListItemDefinitionId;
            return this;
        }


        public BlockVariableInputTO build() {
            return new BlockVariableInputTO(blockCid, type, variableDefinitionKey, propertyTypeId, checkListItemDefinitionId);
        }

    }
}
