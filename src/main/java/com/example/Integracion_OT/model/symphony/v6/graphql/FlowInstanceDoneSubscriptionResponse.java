package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class FlowInstanceDoneSubscriptionResponse extends GraphQLResult<Map<String, FlowInstanceTO>> {

    private static final String OPERATION_NAME = "flowInstanceDone";

    public FlowInstanceDoneSubscriptionResponse() {
    }

    public FlowInstanceTO flowInstanceDone() {
        Map<String, FlowInstanceTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
