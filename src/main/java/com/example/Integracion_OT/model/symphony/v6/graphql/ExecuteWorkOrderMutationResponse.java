package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class ExecuteWorkOrderMutationResponse extends GraphQLResult<Map<String, WorkOrderExecutionResultTO>> {

    private static final String OPERATION_NAME = "executeWorkOrder";

    public ExecuteWorkOrderMutationResponse() {
    }

    public WorkOrderExecutionResultTO executeWorkOrder() {
        Map<String, WorkOrderExecutionResultTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
