package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class FlowInstancesQueryResponse extends GraphQLResult<Map<String, FlowInstanceConnectionTO>> {

    private static final String OPERATION_NAME = "flowInstances";

    public FlowInstancesQueryResponse() {
    }

    public FlowInstanceConnectionTO flowInstances() {
        Map<String, FlowInstanceConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
