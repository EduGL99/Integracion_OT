package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class CreateSurveyMutationResponse extends GraphQLResult<Map<String, String>> {

    private static final String OPERATION_NAME = "createSurvey";

    public CreateSurveyMutationResponse() {
    }

    public String createSurvey() {
        Map<String, String> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
