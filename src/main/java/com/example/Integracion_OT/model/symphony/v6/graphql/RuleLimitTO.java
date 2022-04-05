package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RuleLimitTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    private int number;
    @javax.validation.constraints.NotNull
    private String limitType;
    @javax.validation.constraints.NotNull
    private ComparatorTO comparator;
    private RuleTO rule;

    public RuleLimitTO() {
    }

    public RuleLimitTO(String id, int number, String limitType, ComparatorTO comparator, RuleTO rule) {
        this.id = id;
        this.number = number;
        this.limitType = limitType;
        this.comparator = comparator;
        this.rule = rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The id of the object.
     */
    public String getId() {
        return id;
    }

    /**
     * The id of the object.
     */
    public void setId(String id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLimitType() {
        return limitType;
    }

    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    public ComparatorTO getComparator() {
        return comparator;
    }

    public void setComparator(ComparatorTO comparator) {
        this.comparator = comparator;
    }

    public RuleTO getRule() {
        return rule;
    }

    public void setRule(RuleTO rule) {
        this.rule = rule;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("number: " + GraphQLRequestSerializer.getEntry(number));
        if (limitType != null) {
            joiner.add("limitType: " + GraphQLRequestSerializer.getEntry(limitType));
        }
        if (comparator != null) {
            joiner.add("comparator: " + GraphQLRequestSerializer.getEntry(comparator));
        }
        if (rule != null) {
            joiner.add("rule: " + GraphQLRequestSerializer.getEntry(rule));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private int number;
        private String limitType;
        private ComparatorTO comparator;
        private RuleTO rule;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setNumber(int number) {
            this.number = number;
            return this;
        }

        public Builder setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }

        public Builder setComparator(ComparatorTO comparator) {
            this.comparator = comparator;
            return this;
        }

        public Builder setRule(RuleTO rule) {
            this.rule = rule;
            return this;
        }


        public RuleLimitTO build() {
            return new RuleLimitTO(id, number, limitType, comparator, rule);
        }

    }
}
