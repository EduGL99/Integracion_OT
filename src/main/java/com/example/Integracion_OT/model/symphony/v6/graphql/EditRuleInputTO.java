package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditRuleInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private Integer gracePeriod;
    private String startDateTime;
    private String endDateTime;
    @javax.validation.constraints.NotNull
    private String ruleType;
    private String eventTypeName;
    private String specificProblem;
    private String additionalInfo;
    private boolean status;
    @javax.validation.constraints.NotNull
    private String eventSeverity;
    @javax.validation.constraints.NotNull
    private String threshold;

    public EditRuleInputTO() {
    }

    public EditRuleInputTO(String id, String name, Integer gracePeriod, String startDateTime, String endDateTime, String ruleType, String eventTypeName, String specificProblem, String additionalInfo, boolean status, String eventSeverity, String threshold) {
        this.id = id;
        this.name = name;
        this.gracePeriod = gracePeriod;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.ruleType = ruleType;
        this.eventTypeName = eventTypeName;
        this.specificProblem = specificProblem;
        this.additionalInfo = additionalInfo;
        this.status = status;
        this.eventSeverity = eventSeverity;
        this.threshold = threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
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

    public String getEventSeverity() {
        return eventSeverity;
    }

    public void setEventSeverity(String eventSeverity) {
        this.eventSeverity = eventSeverity;
    }

    public String getThreshold() {
        return threshold;
    }

    public void setThreshold(String threshold) {
        this.threshold = threshold;
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
        if (gracePeriod != null) {
            joiner.add("gracePeriod: " + GraphQLRequestSerializer.getEntry(gracePeriod));
        }
        if (startDateTime != null) {
            joiner.add("startDateTime: " + GraphQLRequestSerializer.getEntry(startDateTime));
        }
        if (endDateTime != null) {
            joiner.add("endDateTime: " + GraphQLRequestSerializer.getEntry(endDateTime));
        }
        if (ruleType != null) {
            joiner.add("ruleType: " + GraphQLRequestSerializer.getEntry(ruleType));
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
        if (eventSeverity != null) {
            joiner.add("eventSeverity: " + GraphQLRequestSerializer.getEntry(eventSeverity));
        }
        if (threshold != null) {
            joiner.add("threshold: " + GraphQLRequestSerializer.getEntry(threshold));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private Integer gracePeriod;
        private String startDateTime;
        private String endDateTime;
        private String ruleType;
        private String eventTypeName;
        private String specificProblem;
        private String additionalInfo;
        private boolean status;
        private String eventSeverity;
        private String threshold;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
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

        public Builder setRuleType(String ruleType) {
            this.ruleType = ruleType;
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

        public Builder setEventSeverity(String eventSeverity) {
            this.eventSeverity = eventSeverity;
            return this;
        }

        public Builder setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }


        public EditRuleInputTO build() {
            return new EditRuleInputTO(id, name, gracePeriod, startDateTime, endDateTime, ruleType, eventTypeName, specificProblem, additionalInfo, status, eventSeverity, threshold);
        }

    }
}
