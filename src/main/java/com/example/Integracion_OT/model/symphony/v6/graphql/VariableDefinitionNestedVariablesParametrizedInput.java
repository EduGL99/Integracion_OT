package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

/**
 * Parametrized input for field nestedVariables in type VariableDefinition
 */

public class VariableDefinitionNestedVariablesParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String value;

    public VariableDefinitionNestedVariablesParametrizedInput() {
    }

    public VariableDefinitionNestedVariablesParametrizedInput(String value) {
        this.value = value;
    }

    public VariableDefinitionNestedVariablesParametrizedInput value(String value) {
        this.value = value;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (value != null) {
            joiner.add("value: " + GraphQLRequestSerializer.getEntry(value));
        }
        return joiner.toString();
    }

}
