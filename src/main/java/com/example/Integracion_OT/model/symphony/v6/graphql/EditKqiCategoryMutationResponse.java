package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditKqiCategoryMutationResponse extends GraphQLResult<Map<String, KqiCategoryTO>> {

    private static final String OPERATION_NAME = "editKqiCategory";

    public EditKqiCategoryMutationResponse() {
    }

    public KqiCategoryTO editKqiCategory() {
        Map<String, KqiCategoryTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
