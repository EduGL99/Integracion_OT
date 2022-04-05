package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for SurveyTemplateCategory
 */

public class SurveyTemplateCategoryResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SurveyTemplateCategoryResponseProjection() {
    }

    public SurveyTemplateCategoryResponseProjection all$() {
        return all$(3);
    }

    public SurveyTemplateCategoryResponseProjection all$(int maxDepth) {
        this.id();
        this.categoryTitle();
        this.categoryDescription();
        if (projectionDepthOnFields.getOrDefault("SurveyTemplateCategoryResponseProjection.SurveyTemplateQuestionResponseProjection.surveyTemplateQuestions", 0) <= maxDepth) {
            projectionDepthOnFields.put("SurveyTemplateCategoryResponseProjection.SurveyTemplateQuestionResponseProjection.surveyTemplateQuestions", projectionDepthOnFields.getOrDefault("SurveyTemplateCategoryResponseProjection.SurveyTemplateQuestionResponseProjection.surveyTemplateQuestions", 0) + 1);
            this.surveyTemplateQuestions(new SurveyTemplateQuestionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SurveyTemplateCategoryResponseProjection.SurveyTemplateQuestionResponseProjection.surveyTemplateQuestions", 0)));
        }
        this.typename();
        return this;
    }

    public SurveyTemplateCategoryResponseProjection id() {
        return id(null);
    }

    public SurveyTemplateCategoryResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SurveyTemplateCategoryResponseProjection categoryTitle() {
        return categoryTitle(null);
    }

    public SurveyTemplateCategoryResponseProjection categoryTitle(String alias) {
        fields.add(new GraphQLResponseField("categoryTitle").alias(alias));
        return this;
    }

    public SurveyTemplateCategoryResponseProjection categoryDescription() {
        return categoryDescription(null);
    }

    public SurveyTemplateCategoryResponseProjection categoryDescription(String alias) {
        fields.add(new GraphQLResponseField("categoryDescription").alias(alias));
        return this;
    }

    public SurveyTemplateCategoryResponseProjection surveyTemplateQuestions(SurveyTemplateQuestionResponseProjection subProjection) {
        return surveyTemplateQuestions(null, subProjection);
    }

    public SurveyTemplateCategoryResponseProjection surveyTemplateQuestions(String alias, SurveyTemplateQuestionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("surveyTemplateQuestions").alias(alias).projection(subProjection));
        return this;
    }

    public SurveyTemplateCategoryResponseProjection typename() {
        return typename(null);
    }

    public SurveyTemplateCategoryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
