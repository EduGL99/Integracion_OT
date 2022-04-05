package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class VertexQueryResponse extends GraphQLResult<Map<String, VertexTO>> {

    private static final String OPERATION_NAME = "vertex";

    public VertexQueryResponse() {
    }

    public VertexTO vertex() {
        Map<String, VertexTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
