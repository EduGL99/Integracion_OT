package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class RemoveRecommendationsSourcesMutationResponse extends GraphQLResult<Map<String, String>> {

    private static final String OPERATION_NAME = "removeRecommendationsSources";

    public RemoveRecommendationsSourcesMutationResponse() {
    }

    public String removeRecommendationsSources() {
        Map<String, String> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
