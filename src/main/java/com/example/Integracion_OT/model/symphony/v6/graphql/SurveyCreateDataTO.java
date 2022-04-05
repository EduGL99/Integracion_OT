package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyCreateDataTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String ownerName;
    private Integer creationTimestamp;
    private int completionTimestamp;
    private SurveyStatusTO status;
    @javax.validation.constraints.NotNull
    private String locationID;
    @javax.validation.constraints.NotNull
    private java.util.List<SurveyQuestionResponseTO> surveyResponses;

    public SurveyCreateDataTO() {
    }

    public SurveyCreateDataTO(String name, String ownerName, Integer creationTimestamp, int completionTimestamp, SurveyStatusTO status, String locationID, java.util.List<SurveyQuestionResponseTO> surveyResponses) {
        this.name = name;
        this.ownerName = ownerName;
        this.creationTimestamp = creationTimestamp;
        this.completionTimestamp = completionTimestamp;
        this.status = status;
        this.locationID = locationID;
        this.surveyResponses = surveyResponses;
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

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Integer getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Integer creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public int getCompletionTimestamp() {
        return completionTimestamp;
    }

    public void setCompletionTimestamp(int completionTimestamp) {
        this.completionTimestamp = completionTimestamp;
    }

    public SurveyStatusTO getStatus() {
        return status;
    }

    public void setStatus(SurveyStatusTO status) {
        this.status = status;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public java.util.List<SurveyQuestionResponseTO> getSurveyResponses() {
        return surveyResponses;
    }

    public void setSurveyResponses(java.util.List<SurveyQuestionResponseTO> surveyResponses) {
        this.surveyResponses = surveyResponses;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (ownerName != null) {
            joiner.add("ownerName: " + GraphQLRequestSerializer.getEntry(ownerName));
        }
        if (creationTimestamp != null) {
            joiner.add("creationTimestamp: " + GraphQLRequestSerializer.getEntry(creationTimestamp));
        }
        joiner.add("completionTimestamp: " + GraphQLRequestSerializer.getEntry(completionTimestamp));
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (locationID != null) {
            joiner.add("locationID: " + GraphQLRequestSerializer.getEntry(locationID));
        }
        if (surveyResponses != null) {
            joiner.add("surveyResponses: " + GraphQLRequestSerializer.getEntry(surveyResponses));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String name;
        private String ownerName;
        private Integer creationTimestamp;
        private int completionTimestamp;
        private SurveyStatusTO status;
        private String locationID;
        private java.util.List<SurveyQuestionResponseTO> surveyResponses;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        public Builder setCreationTimestamp(Integer creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder setCompletionTimestamp(int completionTimestamp) {
            this.completionTimestamp = completionTimestamp;
            return this;
        }

        public Builder setStatus(SurveyStatusTO status) {
            this.status = status;
            return this;
        }

        public Builder setLocationID(String locationID) {
            this.locationID = locationID;
            return this;
        }

        public Builder setSurveyResponses(java.util.List<SurveyQuestionResponseTO> surveyResponses) {
            this.surveyResponses = surveyResponses;
            return this;
        }


        public SurveyCreateDataTO build() {
            return new SurveyCreateDataTO(name, ownerName, creationTimestamp, completionTimestamp, status, locationID, surveyResponses);
        }

    }
}
