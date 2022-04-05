package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComparatorTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private java.util.List<RuleLimitTO> ruleLimit;

    public ComparatorTO() {
    }

    public ComparatorTO(String id, String name, java.util.List<RuleLimitTO> ruleLimit) {
        this.id = id;
        this.name = name;
        this.ruleLimit = ruleLimit;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<RuleLimitTO> getRuleLimit() {
        return ruleLimit;
    }

    public void setRuleLimit(java.util.List<RuleLimitTO> ruleLimit) {
        this.ruleLimit = ruleLimit;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (ruleLimit != null) {
            joiner.add("ruleLimit: " + GraphQLRequestSerializer.getEntry(ruleLimit));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private java.util.List<RuleLimitTO> ruleLimit;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRuleLimit(java.util.List<RuleLimitTO> ruleLimit) {
            this.ruleLimit = ruleLimit;
            return this;
        }


        public ComparatorTO build() {
            return new ComparatorTO(id, name, ruleLimit);
        }

    }
}
