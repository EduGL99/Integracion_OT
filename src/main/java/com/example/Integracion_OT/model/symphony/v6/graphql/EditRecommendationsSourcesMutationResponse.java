package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditRecommendationsSourcesMutationResponse extends GraphQLResult<Map<String, RecommendationsSourcesTO>> {

    private static final String OPERATION_NAME = "editRecommendationsSources";

    public EditRecommendationsSourcesMutationResponse() {
    }

    public RecommendationsSourcesTO editRecommendationsSources() {
        Map<String, RecommendationsSourcesTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
