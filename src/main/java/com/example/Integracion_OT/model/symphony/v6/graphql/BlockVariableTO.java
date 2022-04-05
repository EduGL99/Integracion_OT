package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockVariableTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private BlockTO block;
    @javax.validation.constraints.NotNull
    private VariableExpressionTypeTO type;
    private VariableDefinitionTO inputVariableDefinition;
    private PropertyTypeTO inputPropertyTypeDefinition;
    private CheckListItemDefinitionTO checkListItemDefinition;

    public BlockVariableTO() {
    }

    public BlockVariableTO(BlockTO block, VariableExpressionTypeTO type, VariableDefinitionTO inputVariableDefinition, PropertyTypeTO inputPropertyTypeDefinition, CheckListItemDefinitionTO checkListItemDefinition) {
        this.block = block;
        this.type = type;
        this.inputVariableDefinition = inputVariableDefinition;
        this.inputPropertyTypeDefinition = inputPropertyTypeDefinition;
        this.checkListItemDefinition = checkListItemDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public BlockTO getBlock() {
        return block;
    }

    public void setBlock(BlockTO block) {
        this.block = block;
    }

    public VariableExpressionTypeTO getType() {
        return type;
    }

    public void setType(VariableExpressionTypeTO type) {
        this.type = type;
    }

    public VariableDefinitionTO getInputVariableDefinition() {
        return inputVariableDefinition;
    }

    public void setInputVariableDefinition(VariableDefinitionTO inputVariableDefinition) {
        this.inputVariableDefinition = inputVariableDefinition;
    }

    public PropertyTypeTO getInputPropertyTypeDefinition() {
        return inputPropertyTypeDefinition;
    }

    public void setInputPropertyTypeDefinition(PropertyTypeTO inputPropertyTypeDefinition) {
        this.inputPropertyTypeDefinition = inputPropertyTypeDefinition;
    }

    public CheckListItemDefinitionTO getCheckListItemDefinition() {
        return checkListItemDefinition;
    }

    public void setCheckListItemDefinition(CheckListItemDefinitionTO checkListItemDefinition) {
        this.checkListItemDefinition = checkListItemDefinition;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (block != null) {
            joiner.add("block: " + GraphQLRequestSerializer.getEntry(block));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (inputVariableDefinition != null) {
            joiner.add("inputVariableDefinition: " + GraphQLRequestSerializer.getEntry(inputVariableDefinition));
        }
        if (inputPropertyTypeDefinition != null) {
            joiner.add("inputPropertyTypeDefinition: " + GraphQLRequestSerializer.getEntry(inputPropertyTypeDefinition));
        }
        if (checkListItemDefinition != null) {
            joiner.add("checkListItemDefinition: " + GraphQLRequestSerializer.getEntry(checkListItemDefinition));
        }
        return joiner.toString();
    }

    public static class Builder {

        private BlockTO block;
        private VariableExpressionTypeTO type;
        private VariableDefinitionTO inputVariableDefinition;
        private PropertyTypeTO inputPropertyTypeDefinition;
        private CheckListItemDefinitionTO checkListItemDefinition;

        public Builder() {
        }

        public Builder setBlock(BlockTO block) {
            this.block = block;
            return this;
        }

        public Builder setType(VariableExpressionTypeTO type) {
            this.type = type;
            return this;
        }

        public Builder setInputVariableDefinition(VariableDefinitionTO inputVariableDefinition) {
            this.inputVariableDefinition = inputVariableDefinition;
            return this;
        }

        public Builder setInputPropertyTypeDefinition(PropertyTypeTO inputPropertyTypeDefinition) {
            this.inputPropertyTypeDefinition = inputPropertyTypeDefinition;
            return this;
        }

        public Builder setCheckListItemDefinition(CheckListItemDefinitionTO checkListItemDefinition) {
            this.checkListItemDefinition = checkListItemDefinition;
            return this;
        }


        public BlockVariableTO build() {
            return new BlockVariableTO(block, type, inputVariableDefinition, inputPropertyTypeDefinition, checkListItemDefinition);
        }

    }
}
