package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderFilterInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private WorkOrderFilterTypeTO filterType;
    @javax.validation.constraints.NotNull
    private FilterOperatorTO operator;
    private String stringValue;
    @javax.validation.constraints.NotNull
    private java.util.List<String> idSet;
    @javax.validation.constraints.NotNull
    private java.util.List<String> stringSet;
    private PropertyTypeInputTO propertyValue;
    private String timeValue;
    private Integer maxDepth = 5;

    public WorkOrderFilterInputTO() {
    }

    public WorkOrderFilterInputTO(WorkOrderFilterTypeTO filterType, FilterOperatorTO operator, String stringValue, java.util.List<String> idSet, java.util.List<String> stringSet, PropertyTypeInputTO propertyValue, String timeValue, Integer maxDepth) {
        this.filterType = filterType;
        this.operator = operator;
        this.stringValue = stringValue;
        this.idSet = idSet;
        this.stringSet = stringSet;
        this.propertyValue = propertyValue;
        this.timeValue = timeValue;
        this.maxDepth = maxDepth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public WorkOrderFilterTypeTO getFilterType() {
        return filterType;
    }

    public void setFilterType(WorkOrderFilterTypeTO filterType) {
        this.filterType = filterType;
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

    public PropertyTypeInputTO getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(PropertyTypeInputTO propertyValue) {
        this.propertyValue = propertyValue;
    }

    public String getTimeValue() {
        return timeValue;
    }

    public void setTimeValue(String timeValue) {
        this.timeValue = timeValue;
    }

    public Integer getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(Integer maxDepth) {
        this.maxDepth = maxDepth;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (filterType != null) {
            joiner.add("filterType: " + GraphQLRequestSerializer.getEntry(filterType));
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
        if (propertyValue != null) {
            joiner.add("propertyValue: " + GraphQLRequestSerializer.getEntry(propertyValue));
        }
        if (timeValue != null) {
            joiner.add("timeValue: " + GraphQLRequestSerializer.getEntry(timeValue));
        }
        if (maxDepth != null) {
            joiner.add("maxDepth: " + GraphQLRequestSerializer.getEntry(maxDepth));
        }
        return joiner.toString();
    }

    public static class Builder {

        private WorkOrderFilterTypeTO filterType;
        private FilterOperatorTO operator;
        private String stringValue;
        private java.util.List<String> idSet;
        private java.util.List<String> stringSet;
        private PropertyTypeInputTO propertyValue;
        private String timeValue;
        private Integer maxDepth = 5;

        public Builder() {
        }

        public Builder setFilterType(WorkOrderFilterTypeTO filterType) {
            this.filterType = filterType;
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

        public Builder setPropertyValue(PropertyTypeInputTO propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }

        public Builder setTimeValue(String timeValue) {
            this.timeValue = timeValue;
            return this;
        }

        public Builder setMaxDepth(Integer maxDepth) {
            this.maxDepth = maxDepth;
            return this;
        }


        public WorkOrderFilterInputTO build() {
            return new WorkOrderFilterInputTO(filterType, operator, stringValue, idSet, stringSet, propertyValue, timeValue, maxDepth);
        }

    }
}
