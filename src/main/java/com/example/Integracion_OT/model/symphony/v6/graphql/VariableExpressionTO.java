package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VariableExpressionTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private VariableExpressionTypeTO type;
    private VariableDefinitionTO variableDefinition;
    private PropertyTypeTO propertyTypeDefinition;
    @javax.validation.constraints.NotNull
    private String expression;
    @javax.validation.constraints.NotNull
    private java.util.List<BlockVariableTO> blockVariables;

    public VariableExpressionTO() {
    }

    public VariableExpressionTO(VariableExpressionTypeTO type, VariableDefinitionTO variableDefinition, PropertyTypeTO propertyTypeDefinition, String expression, java.util.List<BlockVariableTO> blockVariables) {
        this.type = type;
        this.variableDefinition = variableDefinition;
        this.propertyTypeDefinition = propertyTypeDefinition;
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

    public VariableDefinitionTO getVariableDefinition() {
        return variableDefinition;
    }

    public void setVariableDefinition(VariableDefinitionTO variableDefinition) {
        this.variableDefinition = variableDefinition;
    }

    public PropertyTypeTO getPropertyTypeDefinition() {
        return propertyTypeDefinition;
    }

    public void setPropertyTypeDefinition(PropertyTypeTO propertyTypeDefinition) {
        this.propertyTypeDefinition = propertyTypeDefinition;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public java.util.List<BlockVariableTO> getBlockVariables() {
        return blockVariables;
    }

    public void setBlockVariables(java.util.List<BlockVariableTO> blockVariables) {
        this.blockVariables = blockVariables;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (variableDefinition != null) {
            joiner.add("variableDefinition: " + GraphQLRequestSerializer.getEntry(variableDefinition));
        }
        if (propertyTypeDefinition != null) {
            joiner.add("propertyTypeDefinition: " + GraphQLRequestSerializer.getEntry(propertyTypeDefinition));
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
        private VariableDefinitionTO variableDefinition;
        private PropertyTypeTO propertyTypeDefinition;
        private String expression;
        private java.util.List<BlockVariableTO> blockVariables;

        public Builder() {
        }

        public Builder setType(VariableExpressionTypeTO type) {
            this.type = type;
            return this;
        }

        public Builder setVariableDefinition(VariableDefinitionTO variableDefinition) {
            this.variableDefinition = variableDefinition;
            return this;
        }

        public Builder setPropertyTypeDefinition(PropertyTypeTO propertyTypeDefinition) {
            this.propertyTypeDefinition = propertyTypeDefinition;
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = expression;
            return this;
        }

        public Builder setBlockVariables(java.util.List<BlockVariableTO> blockVariables) {
            this.blockVariables = blockVariables;
            return this;
        }


        public VariableExpressionTO build() {
            return new VariableExpressionTO(type, variableDefinition, propertyTypeDefinition, expression, blockVariables);
        }

    }
}
