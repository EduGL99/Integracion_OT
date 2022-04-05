package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyTemplateCategoryInputTO implements java.io.Serializable {

    private String id;
    @javax.validation.constraints.NotNull
    private String categoryTitle;
    @javax.validation.constraints.NotNull
    private String categoryDescription;
    private java.util.List<SurveyTemplateQuestionInputTO> surveyTemplateQuestions;

    public SurveyTemplateCategoryInputTO() {
    }

    public SurveyTemplateCategoryInputTO(String id, String categoryTitle, String categoryDescription, java.util.List<SurveyTemplateQuestionInputTO> surveyTemplateQuestions) {
        this.id = id;
        this.categoryTitle = categoryTitle;
        this.categoryDescription = categoryDescription;
        this.surveyTemplateQuestions = surveyTemplateQuestions;
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

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public java.util.List<SurveyTemplateQuestionInputTO> getSurveyTemplateQuestions() {
        return surveyTemplateQuestions;
    }

    public void setSurveyTemplateQuestions(java.util.List<SurveyTemplateQuestionInputTO> surveyTemplateQuestions) {
        this.surveyTemplateQuestions = surveyTemplateQuestions;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (categoryTitle != null) {
            joiner.add("categoryTitle: " + GraphQLRequestSerializer.getEntry(categoryTitle));
        }
        if (categoryDescription != null) {
            joiner.add("categoryDescription: " + GraphQLRequestSerializer.getEntry(categoryDescription));
        }
        if (surveyTemplateQuestions != null) {
            joiner.add("surveyTemplateQuestions: " + GraphQLRequestSerializer.getEntry(surveyTemplateQuestions));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String categoryTitle;
        private String categoryDescription;
        private java.util.List<SurveyTemplateQuestionInputTO> surveyTemplateQuestions;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setCategoryTitle(String categoryTitle) {
            this.categoryTitle = categoryTitle;
            return this;
        }

        public Builder setCategoryDescription(String categoryDescription) {
            this.categoryDescription = categoryDescription;
            return this;
        }

        public Builder setSurveyTemplateQuestions(java.util.List<SurveyTemplateQuestionInputTO> surveyTemplateQuestions) {
            this.surveyTemplateQuestions = surveyTemplateQuestions;
            return this;
        }


        public SurveyTemplateCategoryInputTO build() {
            return new SurveyTemplateCategoryInputTO(id, categoryTitle, categoryDescription, surveyTemplateQuestions);
        }

    }
}
