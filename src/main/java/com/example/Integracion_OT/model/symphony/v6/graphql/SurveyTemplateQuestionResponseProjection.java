package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for SurveyTemplateQuestion
 */

public class SurveyTemplateQuestionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SurveyTemplateQuestionResponseProjection() {
    }

    public SurveyTemplateQuestionResponseProjection all$() {
        return all$(3);
    }

    public SurveyTemplateQuestionResponseProjection all$(int maxDepth) {
        this.id();
        this.questionTitle();
        this.questionDescription();
        this.questionType();
        this.index();
        this.typename();
        return this;
    }

    public SurveyTemplateQuestionResponseProjection id() {
        return id(null);
    }

    public SurveyTemplateQuestionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SurveyTemplateQuestionResponseProjection questionTitle() {
        return questionTitle(null);
    }

    public SurveyTemplateQuestionResponseProjection questionTitle(String alias) {
        fields.add(new GraphQLResponseField("questionTitle").alias(alias));
        return this;
    }

    public SurveyTemplateQuestionResponseProjection questionDescription() {
        return questionDescription(null);
    }

    public SurveyTemplateQuestionResponseProjection questionDescription(String alias) {
        fields.add(new GraphQLResponseField("questionDescription").alias(alias));
        return this;
    }

    public SurveyTemplateQuestionResponseProjection questionType() {
        return questionType(null);
    }

    public SurveyTemplateQuestionResponseProjection questionType(String alias) {
        fields.add(new GraphQLResponseField("questionType").alias(alias));
        return this;
    }

    public SurveyTemplateQuestionResponseProjection index() {
        return index(null);
    }

    public SurveyTemplateQuestionResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public SurveyTemplateQuestionResponseProjection typename() {
        return typename(null);
    }

    public SurveyTemplateQuestionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
