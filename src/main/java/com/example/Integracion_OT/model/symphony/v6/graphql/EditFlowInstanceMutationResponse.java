package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditFlowInstanceMutationResponse extends GraphQLResult<Map<String, FlowInstanceTO>> {

    private static final String OPERATION_NAME = "editFlowInstance";

    public EditFlowInstanceMutationResponse() {
    }

    public FlowInstanceTO editFlowInstance() {
        Map<String, FlowInstanceTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
