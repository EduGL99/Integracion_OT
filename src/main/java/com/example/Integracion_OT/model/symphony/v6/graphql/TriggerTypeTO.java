package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TriggerTypeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private TriggerTypeIdTO id;
    @javax.validation.constraints.NotNull
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableDefinitionTO> variables;

    public TriggerTypeTO() {
    }

    public TriggerTypeTO(TriggerTypeIdTO id, String description, java.util.List<VariableDefinitionTO> variables) {
        this.id = id;
        this.description = description;
        this.variables = variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public TriggerTypeIdTO getId() {
        return id;
    }

    public void setId(TriggerTypeIdTO id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.List<VariableDefinitionTO> getVariables() {
        return variables;
    }

    public void setVariables(java.util.List<VariableDefinitionTO> variables) {
        this.variables = variables;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (variables != null) {
            joiner.add("variables: " + GraphQLRequestSerializer.getEntry(variables));
        }
        return joiner.toString();
    }

    public static class Builder {

        private TriggerTypeIdTO id;
        private String description;
        private java.util.List<VariableDefinitionTO> variables;

        public Builder() {
        }

        public Builder setId(TriggerTypeIdTO id) {
            this.id = id;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setVariables(java.util.List<VariableDefinitionTO> variables) {
            this.variables = variables;
            return this;
        }


        public TriggerTypeTO build() {
            return new TriggerTypeTO(id, description, variables);
        }

    }
}
