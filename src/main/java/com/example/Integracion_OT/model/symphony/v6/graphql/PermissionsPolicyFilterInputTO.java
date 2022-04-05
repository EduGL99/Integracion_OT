package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PermissionsPolicyFilterInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private PermissionsPolicyFilterTypeTO filterType;
    @javax.validation.constraints.NotNull
    private FilterOperatorTO operator;
    private String stringValue;
    private Integer maxDepth = 5;

    public PermissionsPolicyFilterInputTO() {
    }

    public PermissionsPolicyFilterInputTO(PermissionsPolicyFilterTypeTO filterType, FilterOperatorTO operator, String stringValue, Integer maxDepth) {
        this.filterType = filterType;
        this.operator = operator;
        this.stringValue = stringValue;
        this.maxDepth = maxDepth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public PermissionsPolicyFilterTypeTO getFilterType() {
        return filterType;
    }

    public void setFilterType(PermissionsPolicyFilterTypeTO filterType) {
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
        if (maxDepth != null) {
            joiner.add("maxDepth: " + GraphQLRequestSerializer.getEntry(maxDepth));
        }
        return joiner.toString();
    }

    public static class Builder {

        private PermissionsPolicyFilterTypeTO filterType;
        private FilterOperatorTO operator;
        private String stringValue;
        private Integer maxDepth = 5;

        public Builder() {
        }

        public Builder setFilterType(PermissionsPolicyFilterTypeTO filterType) {
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

        public Builder setMaxDepth(Integer maxDepth) {
            this.maxDepth = maxDepth;
            return this;
        }


        public PermissionsPolicyFilterInputTO build() {
            return new PermissionsPolicyFilterInputTO(filterType, operator, stringValue, maxDepth);
        }

    }
}
