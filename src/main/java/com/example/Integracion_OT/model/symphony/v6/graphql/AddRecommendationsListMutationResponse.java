package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddRecommendationsListMutationResponse extends GraphQLResult<Map<String, java.util.List<RecommendationsTO>>> {

    private static final String OPERATION_NAME = "addRecommendationsList";

    public AddRecommendationsListMutationResponse() {
    }

    public java.util.List<RecommendationsTO> addRecommendationsList() {
        Map<String, java.util.List<RecommendationsTO>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
