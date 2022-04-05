package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of RecommendationsSources.
 */

public class RecommendationsSourcesQueryResponse extends GraphQLResult<Map<String, RecommendationsSourcesConnectionTO>> {

    private static final String OPERATION_NAME = "RecommendationsSources";

    public RecommendationsSourcesQueryResponse() {
    }

    /**
     * A list of RecommendationsSources.
     */
    public RecommendationsSourcesConnectionTO RecommendationsSources() {
        Map<String, RecommendationsSourcesConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
