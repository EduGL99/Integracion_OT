package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class StartFlowMutationResponse extends GraphQLResult<Map<String, FlowInstanceTO>> {

    private static final String OPERATION_NAME = "startFlow";

    public StartFlowMutationResponse() {
    }

    public FlowInstanceTO startFlow() {
        Map<String, FlowInstanceTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
