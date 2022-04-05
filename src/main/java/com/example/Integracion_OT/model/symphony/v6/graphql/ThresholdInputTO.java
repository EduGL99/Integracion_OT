package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ThresholdInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String description;
    private boolean status;
    @javax.validation.constraints.NotNull
    private java.util.List<RuleInputTO> rule;
    @javax.validation.constraints.NotNull
    private String kpi;

    public ThresholdInputTO() {
    }

    public ThresholdInputTO(String name, String description, boolean status, java.util.List<RuleInputTO> rule, String kpi) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.rule = rule;
        this.kpi = kpi;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public java.util.List<RuleInputTO> getRule() {
        return rule;
    }

    public void setRule(java.util.List<RuleInputTO> rule) {
        this.rule = rule;
    }

    public String getKpi() {
        return kpi;
    }

    public void setKpi(String kpi) {
        this.kpi = kpi;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        if (rule != null) {
            joiner.add("rule: " + GraphQLRequestSerializer.getEntry(rule));
        }
        if (kpi != null) {
            joiner.add("kpi: " + GraphQLRequestSerializer.getEntry(kpi));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String name;
        private String description;
        private boolean status;
        private java.util.List<RuleInputTO> rule;
        private String kpi;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setStatus(boolean status) {
            this.status = status;
            return this;
        }

        public Builder setRule(java.util.List<RuleInputTO> rule) {
            this.rule = rule;
            return this;
        }

        public Builder setKpi(String kpi) {
            this.kpi = kpi;
            return this;
        }


        public ThresholdInputTO build() {
            return new ThresholdInputTO(name, description, status, rule, kpi);
        }

    }
}
