package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddKpiCategoryMutationResponse extends GraphQLResult<Map<String, KpiCategoryTO>> {

    private static final String OPERATION_NAME = "addKpiCategory";

    public AddKpiCategoryMutationResponse() {
    }

    public KpiCategoryTO addKpiCategory() {
        Map<String, KpiCategoryTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
