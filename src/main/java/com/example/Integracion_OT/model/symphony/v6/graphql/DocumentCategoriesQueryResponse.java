package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class DocumentCategoriesQueryResponse extends GraphQLResult<Map<String, DocumentCategoryConnectionTO>> {

    private static final String OPERATION_NAME = "documentCategories";

    public DocumentCategoriesQueryResponse() {
    }

    public DocumentCategoryConnectionTO documentCategories() {
        Map<String, DocumentCategoryConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
