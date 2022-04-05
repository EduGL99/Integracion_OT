package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VariableDefinitionTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private VariableTypeTO type;
    private boolean mandatory;
    private boolean multipleValues;
    @javax.validation.constraints.NotNull
    private java.util.List<String> choices;
    private String defaultValue;
    @javax.validation.constraints.NotNull
    private VariableUsageTO usage;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableDefinitionTO> nestedVariables;

    public VariableDefinitionTO() {
    }

    public VariableDefinitionTO(String key, String name, VariableTypeTO type, boolean mandatory, boolean multipleValues, java.util.List<String> choices, String defaultValue, VariableUsageTO usage, java.util.List<VariableDefinitionTO> nestedVariables) {
        this.key = key;
        this.name = name;
        this.type = type;
        this.mandatory = mandatory;
        this.multipleValues = multipleValues;
        this.choices = choices;
        this.defaultValue = defaultValue;
        this.usage = usage;
        this.nestedVariables = nestedVariables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VariableTypeTO getType() {
        return type;
    }

    public void setType(VariableTypeTO type) {
        this.type = type;
    }

    public boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    public boolean getMultipleValues() {
        return multipleValues;
    }

    public void setMultipleValues(boolean multipleValues) {
        this.multipleValues = multipleValues;
    }

    public java.util.List<String> getChoices() {
        return choices;
    }

    public void setChoices(java.util.List<String> choices) {
        this.choices = choices;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public VariableUsageTO getUsage() {
        return usage;
    }

    public void setUsage(VariableUsageTO usage) {
        this.usage = usage;
    }

    public java.util.List<VariableDefinitionTO> getNestedVariables() {
        return nestedVariables;
    }

    public void setNestedVariables(java.util.List<VariableDefinitionTO> nestedVariables) {
        this.nestedVariables = nestedVariables;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        joiner.add("mandatory: " + GraphQLRequestSerializer.getEntry(mandatory));
        joiner.add("multipleValues: " + GraphQLRequestSerializer.getEntry(multipleValues));
        if (choices != null) {
            joiner.add("choices: " + GraphQLRequestSerializer.getEntry(choices));
        }
        if (defaultValue != null) {
            joiner.add("defaultValue: " + GraphQLRequestSerializer.getEntry(defaultValue));
        }
        if (usage != null) {
            joiner.add("usage: " + GraphQLRequestSerializer.getEntry(usage));
        }
        if (nestedVariables != null) {
            joiner.add("nestedVariables: " + GraphQLRequestSerializer.getEntry(nestedVariables));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String key;
        private String name;
        private VariableTypeTO type;
        private boolean mandatory;
        private boolean multipleValues;
        private java.util.List<String> choices;
        private String defaultValue;
        private VariableUsageTO usage;
        private java.util.List<VariableDefinitionTO> nestedVariables;

        public Builder() {
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(VariableTypeTO type) {
            this.type = type;
            return this;
        }

        public Builder setMandatory(boolean mandatory) {
            this.mandatory = mandatory;
            return this;
        }

        public Builder setMultipleValues(boolean multipleValues) {
            this.multipleValues = multipleValues;
            return this;
        }

        public Builder setChoices(java.util.List<String> choices) {
            this.choices = choices;
            return this;
        }

        public Builder setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setUsage(VariableUsageTO usage) {
            this.usage = usage;
            return this;
        }

        public Builder setNestedVariables(java.util.List<VariableDefinitionTO> nestedVariables) {
            this.nestedVariables = nestedVariables;
            return this;
        }


        public VariableDefinitionTO build() {
            return new VariableDefinitionTO(key, name, type, mandatory, multipleValues, choices, defaultValue, usage, nestedVariables);
        }

    }
}
