package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class WorkOrderDoneSubscriptionResponse extends GraphQLResult<Map<String, WorkOrderTO>> {

    private static final String OPERATION_NAME = "workOrderDone";

    public WorkOrderDoneSubscriptionResponse() {
    }

    public WorkOrderTO workOrderDone() {
        Map<String, WorkOrderTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
