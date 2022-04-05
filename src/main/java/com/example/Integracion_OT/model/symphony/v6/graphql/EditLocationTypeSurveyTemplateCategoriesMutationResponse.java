package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditLocationTypeSurveyTemplateCategoriesMutationResponse extends GraphQLResult<Map<String, java.util.List<SurveyTemplateCategoryTO>>> {

    private static final String OPERATION_NAME = "editLocationTypeSurveyTemplateCategories";

    public EditLocationTypeSurveyTemplateCategoriesMutationResponse() {
    }

    public java.util.List<SurveyTemplateCategoryTO> editLocationTypeSurveyTemplateCategories() {
        Map<String, java.util.List<SurveyTemplateCategoryTO>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
