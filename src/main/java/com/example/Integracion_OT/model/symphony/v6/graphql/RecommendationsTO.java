package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RecommendationsTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String externalID;
    @javax.validation.constraints.NotNull
    private String resource;
    @javax.validation.constraints.NotNull
    private String alarmType;
    @javax.validation.constraints.NotNull
    private String shortDescription;
    @javax.validation.constraints.NotNull
    private String longDescription;
    private String command;
    private int priority;
    private boolean status;
    private String runbook;
    private Integer used;
    @javax.validation.constraints.NotNull
    private RecommendationsSourcesTO recommendationsSources;
    @javax.validation.constraints.NotNull
    private RecommendationsCategoryTO recommendationsCategory;
    private UserTO userApprobed;
    @javax.validation.constraints.NotNull
    private UserTO userCreate;
    @javax.validation.constraints.NotNull
    private VendorTO vendor;

    public RecommendationsTO() {
    }

    public RecommendationsTO(String id, String externalID, String resource, String alarmType, String shortDescription, String longDescription, String command, int priority, boolean status, String runbook, Integer used, RecommendationsSourcesTO recommendationsSources, RecommendationsCategoryTO recommendationsCategory, UserTO userApprobed, UserTO userCreate, VendorTO vendor) {
        this.id = id;
        this.externalID = externalID;
        this.resource = resource;
        this.alarmType = alarmType;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.command = command;
        this.priority = priority;
        this.status = status;
        this.runbook = runbook;
        this.used = used;
        this.recommendationsSources = recommendationsSources;
        this.recommendationsCategory = recommendationsCategory;
        this.userApprobed = userApprobed;
        this.userCreate = userCreate;
        this.vendor = vendor;
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

    public String getExternalID() {
        return externalID;
    }

    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getRunbook() {
        return runbook;
    }

    public void setRunbook(String runbook) {
        this.runbook = runbook;
    }

    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public RecommendationsSourcesTO getRecommendationsSources() {
        return recommendationsSources;
    }

    public void setRecommendationsSources(RecommendationsSourcesTO recommendationsSources) {
        this.recommendationsSources = recommendationsSources;
    }

    public RecommendationsCategoryTO getRecommendationsCategory() {
        return recommendationsCategory;
    }

    public void setRecommendationsCategory(RecommendationsCategoryTO recommendationsCategory) {
        this.recommendationsCategory = recommendationsCategory;
    }

    public UserTO getUserApprobed() {
        return userApprobed;
    }

    public void setUserApprobed(UserTO userApprobed) {
        this.userApprobed = userApprobed;
    }

    public UserTO getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(UserTO userCreate) {
        this.userCreate = userCreate;
    }

    public VendorTO getVendor() {
        return vendor;
    }

    public void setVendor(VendorTO vendor) {
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (externalID != null) {
            joiner.add("externalID: " + GraphQLRequestSerializer.getEntry(externalID));
        }
        if (resource != null) {
            joiner.add("resource: " + GraphQLRequestSerializer.getEntry(resource));
        }
        if (alarmType != null) {
            joiner.add("alarmType: " + GraphQLRequestSerializer.getEntry(alarmType));
        }
        if (shortDescription != null) {
            joiner.add("shortDescription: " + GraphQLRequestSerializer.getEntry(shortDescription));
        }
        if (longDescription != null) {
            joiner.add("longDescription: " + GraphQLRequestSerializer.getEntry(longDescription));
        }
        if (command != null) {
            joiner.add("command: " + GraphQLRequestSerializer.getEntry(command));
        }
        joiner.add("priority: " + GraphQLRequestSerializer.getEntry(priority));
        joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        if (runbook != null) {
            joiner.add("runbook: " + GraphQLRequestSerializer.getEntry(runbook));
        }
        if (used != null) {
            joiner.add("used: " + GraphQLRequestSerializer.getEntry(used));
        }
        if (recommendationsSources != null) {
            joiner.add("recommendationsSources: " + GraphQLRequestSerializer.getEntry(recommendationsSources));
        }
        if (recommendationsCategory != null) {
            joiner.add("recommendationsCategory: " + GraphQLRequestSerializer.getEntry(recommendationsCategory));
        }
        if (userApprobed != null) {
            joiner.add("userApprobed: " + GraphQLRequestSerializer.getEntry(userApprobed));
        }
        if (userCreate != null) {
            joiner.add("userCreate: " + GraphQLRequestSerializer.getEntry(userCreate));
        }
        if (vendor != null) {
            joiner.add("vendor: " + GraphQLRequestSerializer.getEntry(vendor));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String externalID;
        private String resource;
        private String alarmType;
        private String shortDescription;
        private String longDescription;
        private String command;
        private int priority;
        private boolean status;
        private String runbook;
        private Integer used;
        private RecommendationsSourcesTO recommendationsSources;
        private RecommendationsCategoryTO recommendationsCategory;
        private UserTO userApprobed;
        private UserTO userCreate;
        private VendorTO vendor;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setExternalID(String externalID) {
            this.externalID = externalID;
            return this;
        }

        public Builder setResource(String resource) {
            this.resource = resource;
            return this;
        }

        public Builder setAlarmType(String alarmType) {
            this.alarmType = alarmType;
            return this;
        }

        public Builder setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }

        public Builder setLongDescription(String longDescription) {
            this.longDescription = longDescription;
            return this;
        }

        public Builder setCommand(String command) {
            this.command = command;
            return this;
        }

        public Builder setPriority(int priority) {
            this.priority = priority;
            return this;
        }

        public Builder setStatus(boolean status) {
            this.status = status;
            return this;
        }

        public Builder setRunbook(String runbook) {
            this.runbook = runbook;
            return this;
        }

        public Builder setUsed(Integer used) {
            this.used = used;
            return this;
        }

        public Builder setRecommendationsSources(RecommendationsSourcesTO recommendationsSources) {
            this.recommendationsSources = recommendationsSources;
            return this;
        }

        public Builder setRecommendationsCategory(RecommendationsCategoryTO recommendationsCategory) {
            this.recommendationsCategory = recommendationsCategory;
            return this;
        }

        public Builder setUserApprobed(UserTO userApprobed) {
            this.userApprobed = userApprobed;
            return this;
        }

        public Builder setUserCreate(UserTO userCreate) {
            this.userCreate = userCreate;
            return this;
        }

        public Builder setVendor(VendorTO vendor) {
            this.vendor = vendor;
            return this;
        }


        public RecommendationsTO build() {
            return new RecommendationsTO(id, externalID, resource, alarmType, shortDescription, longDescription, command, priority, status, runbook, used, recommendationsSources, recommendationsCategory, userApprobed, userCreate, vendor);
        }

    }
}
