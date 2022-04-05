package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Survey
 */

public class SurveyResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SurveyResponseProjection() {
    }

    public SurveyResponseProjection all$() {
        return all$(3);
    }

    public SurveyResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.ownerName();
        this.creationTimestamp();
        this.completionTimestamp();
        this.locationID();
        if (projectionDepthOnFields.getOrDefault("SurveyResponseProjection.FileResponseProjection.sourceFile", 0) <= maxDepth) {
            projectionDepthOnFields.put("SurveyResponseProjection.FileResponseProjection.sourceFile", projectionDepthOnFields.getOrDefault("SurveyResponseProjection.FileResponseProjection.sourceFile", 0) + 1);
            this.sourceFile(new FileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SurveyResponseProjection.FileResponseProjection.sourceFile", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SurveyResponseProjection.SurveyQuestionResponseProjection.surveyResponses", 0) <= maxDepth) {
            projectionDepthOnFields.put("SurveyResponseProjection.SurveyQuestionResponseProjection.surveyResponses", projectionDepthOnFields.getOrDefault("SurveyResponseProjection.SurveyQuestionResponseProjection.surveyResponses", 0) + 1);
            this.surveyResponses(new SurveyQuestionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SurveyResponseProjection.SurveyQuestionResponseProjection.surveyResponses", 0)));
        }
        this.typename();
        return this;
    }

    public SurveyResponseProjection id() {
        return id(null);
    }

    public SurveyResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SurveyResponseProjection name() {
        return name(null);
    }

    public SurveyResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public SurveyResponseProjection ownerName() {
        return ownerName(null);
    }

    public SurveyResponseProjection ownerName(String alias) {
        fields.add(new GraphQLResponseField("ownerName").alias(alias));
        return this;
    }

    public SurveyResponseProjection creationTimestamp() {
        return creationTimestamp(null);
    }

    public SurveyResponseProjection creationTimestamp(String alias) {
        fields.add(new GraphQLResponseField("creationTimestamp").alias(alias));
        return this;
    }

    public SurveyResponseProjection completionTimestamp() {
        return completionTimestamp(null);
    }

    public SurveyResponseProjection completionTimestamp(String alias) {
        fields.add(new GraphQLResponseField("completionTimestamp").alias(alias));
        return this;
    }

    public SurveyResponseProjection locationID() {
        return locationID(null);
    }

    public SurveyResponseProjection locationID(String alias) {
        fields.add(new GraphQLResponseField("locationID").alias(alias));
        return this;
    }

    public SurveyResponseProjection sourceFile(FileResponseProjection subProjection) {
        return sourceFile(null, subProjection);
    }

    public SurveyResponseProjection sourceFile(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("sourceFile").alias(alias).projection(subProjection));
        return this;
    }

    public SurveyResponseProjection surveyResponses(SurveyQuestionResponseProjection subProjection) {
        return surveyResponses(null, subProjection);
    }

    public SurveyResponseProjection surveyResponses(String alias, SurveyQuestionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("surveyResponses").alias(alias).projection(subProjection));
        return this;
    }

    public SurveyResponseProjection typename() {
        return typename(null);
    }

    public SurveyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
