package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of RecommendationsCategories.
 */

public class RecommendationsCategoriesQueryResponse extends GraphQLResult<Map<String, RecommendationsCategoryConnectionTO>> {

    private static final String OPERATION_NAME = "RecommendationsCategories";

    public RecommendationsCategoriesQueryResponse() {
    }

    /**
     * A list of RecommendationsCategories.
     */
    public RecommendationsCategoryConnectionTO RecommendationsCategories() {
        Map<String, RecommendationsCategoryConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
