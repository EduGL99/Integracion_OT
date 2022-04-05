package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VariableValueTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String variableDefinitionKey;
    @javax.validation.constraints.NotNull
    private String value;

    public VariableValueTO() {
    }

    public VariableValueTO(String variableDefinitionKey, String value) {
        this.variableDefinitionKey = variableDefinitionKey;
        this.value = value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getVariableDefinitionKey() {
        return variableDefinitionKey;
    }

    public void setVariableDefinitionKey(String variableDefinitionKey) {
        this.variableDefinitionKey = variableDefinitionKey;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (variableDefinitionKey != null) {
            joiner.add("variableDefinitionKey: " + GraphQLRequestSerializer.getEntry(variableDefinitionKey));
        }
        if (value != null) {
            joiner.add("value: " + GraphQLRequestSerializer.getEntry(value));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String variableDefinitionKey;
        private String value;

        public Builder() {
        }

        public Builder setVariableDefinitionKey(String variableDefinitionKey) {
            this.variableDefinitionKey = variableDefinitionKey;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public VariableValueTO build() {
            return new VariableValueTO(variableDefinitionKey, value);
        }

    }
}
