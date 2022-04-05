package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of kqiCategories.
 */

public class KqiCategoriesQueryResponse extends GraphQLResult<Map<String, KqiCategoryConnectionTO>> {

    private static final String OPERATION_NAME = "kqiCategories";

    public KqiCategoriesQueryResponse() {
    }

    /**
     * A list of kqiCategories.
     */
    public KqiCategoryConnectionTO kqiCategories() {
        Map<String, KqiCategoryConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
