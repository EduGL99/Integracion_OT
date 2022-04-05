package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionTypeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private ActionTypeIdTO id;
    @javax.validation.constraints.NotNull
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableDefinitionTO> variables;

    public ActionTypeTO() {
    }

    public ActionTypeTO(ActionTypeIdTO id, String description, java.util.List<VariableDefinitionTO> variables) {
        this.id = id;
        this.description = description;
        this.variables = variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ActionTypeIdTO getId() {
        return id;
    }

    public void setId(ActionTypeIdTO id) {
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

        private ActionTypeIdTO id;
        private String description;
        private java.util.List<VariableDefinitionTO> variables;

        public Builder() {
        }

        public Builder setId(ActionTypeIdTO id) {
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


        public ActionTypeTO build() {
            return new ActionTypeTO(id, description, variables);
        }

    }
}
