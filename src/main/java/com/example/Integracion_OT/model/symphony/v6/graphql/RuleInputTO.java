package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RuleInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private Integer gracePeriod;
    private String startDateTime;
    private String endDateTime;
    @javax.validation.constraints.NotNull
    private String eventTypeName;
    @javax.validation.constraints.NotNull
    private String specificProblem;
    @javax.validation.constraints.NotNull
    private String additionalInfo;
    private boolean status;
    @javax.validation.constraints.NotNull
    private java.util.List<RuleLimitInputTO> ruleLimit;

    public RuleInputTO() {
    }

    public RuleInputTO(String name, Integer gracePeriod, String startDateTime, String endDateTime, String eventTypeName, String specificProblem, String additionalInfo, boolean status, java.util.List<RuleLimitInputTO> ruleLimit) {
        this.name = name;
        this.gracePeriod = gracePeriod;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.eventTypeName = eventTypeName;
        this.specificProblem = specificProblem;
        this.additionalInfo = additionalInfo;
        this.status = status;
        this.ruleLimit = ruleLimit;
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

    public Integer getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(Integer gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public String getSpecificProblem() {
        return specificProblem;
    }

    public void setSpecificProblem(String specificProblem) {
        this.specificProblem = specificProblem;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public java.util.List<RuleLimitInputTO> getRuleLimit() {
        return ruleLimit;
    }

    public void setRuleLimit(java.util.List<RuleLimitInputTO> ruleLimit) {
        this.ruleLimit = ruleLimit;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (gracePeriod != null) {
            joiner.add("gracePeriod: " + GraphQLRequestSerializer.getEntry(gracePeriod));
        }
        if (startDateTime != null) {
            joiner.add("startDateTime: " + GraphQLRequestSerializer.getEntry(startDateTime));
        }
        if (endDateTime != null) {
            joiner.add("endDateTime: " + GraphQLRequestSerializer.getEntry(endDateTime));
        }
        if (eventTypeName != null) {
            joiner.add("eventTypeName: " + GraphQLRequestSerializer.getEntry(eventTypeName));
        }
        if (specificProblem != null) {
            joiner.add("specificProblem: " + GraphQLRequestSerializer.getEntry(specificProblem));
        }
        if (additionalInfo != null) {
            joiner.add("additionalInfo: " + GraphQLRequestSerializer.getEntry(additionalInfo));
        }
        joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        if (ruleLimit != null) {
            joiner.add("ruleLimit: " + GraphQLRequestSerializer.getEntry(ruleLimit));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String name;
        private Integer gracePeriod;
        private String startDateTime;
        private String endDateTime;
        private String eventTypeName;
        private String specificProblem;
        private String additionalInfo;
        private boolean status;
        private java.util.List<RuleLimitInputTO> ruleLimit;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setGracePeriod(Integer gracePeriod) {
            this.gracePeriod = gracePeriod;
            return this;
        }

        public Builder setStartDateTime(String startDateTime) {
            this.startDateTime = startDateTime;
            return this;
        }

        public Builder setEndDateTime(String endDateTime) {
            this.endDateTime = endDateTime;
            return this;
        }

        public Builder setEventTypeName(String eventTypeName) {
            this.eventTypeName = eventTypeName;
            return this;
        }

        public Builder setSpecificProblem(String specificProblem) {
            this.specificProblem = specificProblem;
            return this;
        }

        public Builder setAdditionalInfo(String additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }

        public Builder setStatus(boolean status) {
            this.status = status;
            return this;
        }

        public Builder setRuleLimit(java.util.List<RuleLimitInputTO> ruleLimit) {
            this.ruleLimit = ruleLimit;
            return this;
        }


        public RuleInputTO build() {
            return new RuleInputTO(name, gracePeriod, startDateTime, endDateTime, eventTypeName, specificProblem, additionalInfo, status, ruleLimit);
        }

    }
}
