package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class RemoveRecommendationsMutationResponse extends GraphQLResult<Map<String, String>> {

    private static final String OPERATION_NAME = "removeRecommendations";

    public RemoveRecommendationsMutationResponse() {
    }

    public String removeRecommendations() {
        Map<String, String> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
