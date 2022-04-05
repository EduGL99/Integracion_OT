package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VariableDefinitionInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private VariableTypeTO type;
    private Boolean mandatory;
    private Boolean multipleValues;
    @javax.validation.constraints.NotNull
    private java.util.List<String> choices;
    private String defaultValue;

    public VariableDefinitionInputTO() {
    }

    public VariableDefinitionInputTO(String key, VariableTypeTO type, Boolean mandatory, Boolean multipleValues, java.util.List<String> choices, String defaultValue) {
        this.key = key;
        this.type = type;
        this.mandatory = mandatory;
        this.multipleValues = multipleValues;
        this.choices = choices;
        this.defaultValue = defaultValue;
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

    public VariableTypeTO getType() {
        return type;
    }

    public void setType(VariableTypeTO type) {
        this.type = type;
    }

    public Boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    public Boolean getMultipleValues() {
        return multipleValues;
    }

    public void setMultipleValues(Boolean multipleValues) {
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

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (mandatory != null) {
            joiner.add("mandatory: " + GraphQLRequestSerializer.getEntry(mandatory));
        }
        if (multipleValues != null) {
            joiner.add("multipleValues: " + GraphQLRequestSerializer.getEntry(multipleValues));
        }
        if (choices != null) {
            joiner.add("choices: " + GraphQLRequestSerializer.getEntry(choices));
        }
        if (defaultValue != null) {
            joiner.add("defaultValue: " + GraphQLRequestSerializer.getEntry(defaultValue));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String key;
        private VariableTypeTO type;
        private Boolean mandatory;
        private Boolean multipleValues;
        private java.util.List<String> choices;
        private String defaultValue;

        public Builder() {
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setType(VariableTypeTO type) {
            this.type = type;
            return this;
        }

        public Builder setMandatory(Boolean mandatory) {
            this.mandatory = mandatory;
            return this;
        }

        public Builder setMultipleValues(Boolean multipleValues) {
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


        public VariableDefinitionInputTO build() {
            return new VariableDefinitionInputTO(key, type, mandatory, multipleValues, choices, defaultValue);
        }

    }
}
