package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddRecommendationsSourcesMutationResponse extends GraphQLResult<Map<String, RecommendationsSourcesTO>> {

    private static final String OPERATION_NAME = "addRecommendationsSources";

    public AddRecommendationsSourcesMutationResponse() {
    }

    public RecommendationsSourcesTO addRecommendationsSources() {
        Map<String, RecommendationsSourcesTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
