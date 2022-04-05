package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of Recommendations.
 */

public class RecommendationsQueryResponse extends GraphQLResult<Map<String, RecommendationsConnectionTO>> {

    private static final String OPERATION_NAME = "Recommendations";

    public RecommendationsQueryResponse() {
    }

    /**
     * A list of Recommendations.
     */
    public RecommendationsConnectionTO Recommendations() {
        Map<String, RecommendationsConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
