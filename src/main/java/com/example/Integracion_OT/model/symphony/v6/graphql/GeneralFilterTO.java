package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeneralFilterTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String filterType;
    @javax.validation.constraints.NotNull
    private String key;
    @javax.validation.constraints.NotNull
    private FilterOperatorTO operator;
    private String stringValue;
    @javax.validation.constraints.NotNull
    private java.util.List<String> idSet;
    @javax.validation.constraints.NotNull
    private java.util.List<String> stringSet;
    private Boolean boolValue;
    private PropertyTypeTO propertyValue;

    public GeneralFilterTO() {
    }

    public GeneralFilterTO(String filterType, String key, FilterOperatorTO operator, String stringValue, java.util.List<String> idSet, java.util.List<String> stringSet, Boolean boolValue, PropertyTypeTO propertyValue) {
        this.filterType = filterType;
        this.key = key;
        this.operator = operator;
        this.stringValue = stringValue;
        this.idSet = idSet;
        this.stringSet = stringSet;
        this.boolValue = boolValue;
        this.propertyValue = propertyValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public FilterOperatorTO getOperator() {
        return operator;
    }

    public void setOperator(FilterOperatorTO operator) {
        this.operator = operator;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public java.util.List<String> getIdSet() {
        return idSet;
    }

    public void setIdSet(java.util.List<String> idSet) {
        this.idSet = idSet;
    }

    public java.util.List<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(java.util.List<String> stringSet) {
        this.stringSet = stringSet;
    }

    public Boolean getBoolValue() {
        return boolValue;
    }

    public void setBoolValue(Boolean boolValue) {
        this.boolValue = boolValue;
    }

    public PropertyTypeTO getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(PropertyTypeTO propertyValue) {
        this.propertyValue = propertyValue;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (filterType != null) {
            joiner.add("filterType: " + GraphQLRequestSerializer.getEntry(filterType));
        }
        if (key != null) {
            joiner.add("key: " + GraphQLRequestSerializer.getEntry(key));
        }
        if (operator != null) {
            joiner.add("operator: " + GraphQLRequestSerializer.getEntry(operator));
        }
        if (stringValue != null) {
            joiner.add("stringValue: " + GraphQLRequestSerializer.getEntry(stringValue));
        }
        if (idSet != null) {
            joiner.add("idSet: " + GraphQLRequestSerializer.getEntry(idSet));
        }
        if (stringSet != null) {
            joiner.add("stringSet: " + GraphQLRequestSerializer.getEntry(stringSet));
        }
        if (boolValue != null) {
            joiner.add("boolValue: " + GraphQLRequestSerializer.getEntry(boolValue));
        }
        if (propertyValue != null) {
            joiner.add("propertyValue: " + GraphQLRequestSerializer.getEntry(propertyValue));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String filterType;
        private String key;
        private FilterOperatorTO operator;
        private String stringValue;
        private java.util.List<String> idSet;
        private java.util.List<String> stringSet;
        private Boolean boolValue;
        private PropertyTypeTO propertyValue;

        public Builder() {
        }

        public Builder setFilterType(String filterType) {
            this.filterType = filterType;
            return this;
        }

        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        public Builder setOperator(FilterOperatorTO operator) {
            this.operator = operator;
            return this;
        }

        public Builder setStringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder setIdSet(java.util.List<String> idSet) {
            this.idSet = idSet;
            return this;
        }

        public Builder setStringSet(java.util.List<String> stringSet) {
            this.stringSet = stringSet;
            return this;
        }

        public Builder setBoolValue(Boolean boolValue) {
            this.boolValue = boolValue;
            return this;
        }

        public Builder setPropertyValue(PropertyTypeTO propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }


        public GeneralFilterTO build() {
            return new GeneralFilterTO(filterType, key, operator, stringValue, idSet, stringSet, boolValue, propertyValue);
        }

    }
}
