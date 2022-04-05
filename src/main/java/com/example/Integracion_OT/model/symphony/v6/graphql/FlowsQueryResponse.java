package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class FlowsQueryResponse extends GraphQLResult<Map<String, FlowConnectionTO>> {

    private static final String OPERATION_NAME = "flows";

    public FlowsQueryResponse() {
    }

    public FlowConnectionTO flows() {
        Map<String, FlowConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
