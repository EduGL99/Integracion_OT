package com.example.Integracion_OT.model.symphony;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

public class QueryResponse<T> extends GraphQLResult<Map<String, T>> {

    private static final String OPERATION_NAME = "node";

    public QueryResponse() {
    }

    public T node() {
        Map<String, T> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
