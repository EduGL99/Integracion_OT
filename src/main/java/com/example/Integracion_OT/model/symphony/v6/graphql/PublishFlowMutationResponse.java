package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class PublishFlowMutationResponse extends GraphQLResult<Map<String, FlowTO>> {

    private static final String OPERATION_NAME = "publishFlow";

    public PublishFlowMutationResponse() {
    }

    public FlowTO publishFlow() {
        Map<String, FlowTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
