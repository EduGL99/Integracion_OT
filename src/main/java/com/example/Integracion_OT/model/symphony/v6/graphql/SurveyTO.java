package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String ownerName;
    private Integer creationTimestamp;
    private int completionTimestamp;
    @javax.validation.constraints.NotNull
    private String locationID;
    private FileTO sourceFile;
    @javax.validation.constraints.NotNull
    private java.util.List<SurveyQuestionTO> surveyResponses;

    public SurveyTO() {
    }

    public SurveyTO(String id, String name, String ownerName, Integer creationTimestamp, int completionTimestamp, String locationID, FileTO sourceFile, java.util.List<SurveyQuestionTO> surveyResponses) {
        this.id = id;
        this.name = name;
        this.ownerName = ownerName;
        this.creationTimestamp = creationTimestamp;
        this.completionTimestamp = completionTimestamp;
        this.locationID = locationID;
        this.sourceFile = sourceFile;
        this.surveyResponses = surveyResponses;
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

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public FileTO getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(FileTO sourceFile) {
        this.sourceFile = sourceFile;
    }

    public java.util.List<SurveyQuestionTO> getSurveyResponses() {
        return surveyResponses;
    }

    public void setSurveyResponses(java.util.List<SurveyQuestionTO> surveyResponses) {
        this.surveyResponses = surveyResponses;
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
        if (ownerName != null) {
            joiner.add("ownerName: " + GraphQLRequestSerializer.getEntry(ownerName));
        }
        if (creationTimestamp != null) {
            joiner.add("creationTimestamp: " + GraphQLRequestSerializer.getEntry(creationTimestamp));
        }
        joiner.add("completionTimestamp: " + GraphQLRequestSerializer.getEntry(completionTimestamp));
        if (locationID != null) {
            joiner.add("locationID: " + GraphQLRequestSerializer.getEntry(locationID));
        }
        if (sourceFile != null) {
            joiner.add("sourceFile: " + GraphQLRequestSerializer.getEntry(sourceFile));
        }
        if (surveyResponses != null) {
            joiner.add("surveyResponses: " + GraphQLRequestSerializer.getEntry(surveyResponses));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String ownerName;
        private Integer creationTimestamp;
        private int completionTimestamp;
        private String locationID;
        private FileTO sourceFile;
        private java.util.List<SurveyQuestionTO> surveyResponses;

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

        public Builder setLocationID(String locationID) {
            this.locationID = locationID;
            return this;
        }

        public Builder setSourceFile(FileTO sourceFile) {
            this.sourceFile = sourceFile;
            return this;
        }

        public Builder setSurveyResponses(java.util.List<SurveyQuestionTO> surveyResponses) {
            this.surveyResponses = surveyResponses;
            return this;
        }


        public SurveyTO build() {
            return new SurveyTO(id, name, ownerName, creationTimestamp, completionTimestamp, locationID, sourceFile, surveyResponses);
        }

    }
}
