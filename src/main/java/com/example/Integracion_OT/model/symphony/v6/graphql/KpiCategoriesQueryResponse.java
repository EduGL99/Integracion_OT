package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of kpiCategories.
 */

public class KpiCategoriesQueryResponse extends GraphQLResult<Map<String, KpiCategoryConnectionTO>> {

    private static final String OPERATION_NAME = "kpiCategories";

    public KpiCategoriesQueryResponse() {
    }

    /**
     * A list of kpiCategories.
     */
    public KpiCategoryConnectionTO kpiCategories() {
        Map<String, KpiCategoryConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
