package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VariableExpressionInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private VariableExpressionTypeTO type;
    private String variableDefinitionKey;
    private Integer propertyTypeId;
    @javax.validation.constraints.NotNull
    private String expression;
    @javax.validation.constraints.NotNull
    private java.util.List<BlockVariableInputTO> blockVariables;

    public VariableExpressionInputTO() {
    }

    public VariableExpressionInputTO(VariableExpressionTypeTO type, String variableDefinitionKey, Integer propertyTypeId, String expression, java.util.List<BlockVariableInputTO> blockVariables) {
        this.type = type;
        this.variableDefinitionKey = variableDefinitionKey;
        this.propertyTypeId = propertyTypeId;
        this.expression = expression;
        this.blockVariables = blockVariables;
    }

    public static Builder builder() {
        return new Builder();
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

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public java.util.List<BlockVariableInputTO> getBlockVariables() {
        return blockVariables;
    }

    public void setBlockVariables(java.util.List<BlockVariableInputTO> blockVariables) {
        this.blockVariables = blockVariables;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (variableDefinitionKey != null) {
            joiner.add("variableDefinitionKey: " + GraphQLRequestSerializer.getEntry(variableDefinitionKey));
        }
        if (propertyTypeId != null) {
            joiner.add("propertyTypeId: " + GraphQLRequestSerializer.getEntry(propertyTypeId));
        }
        if (expression != null) {
            joiner.add("expression: " + GraphQLRequestSerializer.getEntry(expression));
        }
        if (blockVariables != null) {
            joiner.add("blockVariables: " + GraphQLRequestSerializer.getEntry(blockVariables));
        }
        return joiner.toString();
    }

    public static class Builder {

        private VariableExpressionTypeTO type;
        private String variableDefinitionKey;
        private Integer propertyTypeId;
        private String expression;
        private java.util.List<BlockVariableInputTO> blockVariables;

        public Builder() {
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

        public Builder setExpression(String expression) {
            this.expression = expression;
            return this;
        }

        public Builder setBlockVariables(java.util.List<BlockVariableInputTO> blockVariables) {
            this.blockVariables = blockVariables;
            return this;
        }


        public VariableExpressionInputTO build() {
            return new VariableExpressionInputTO(type, variableDefinitionKey, propertyTypeId, expression, blockVariables);
        }

    }
}
