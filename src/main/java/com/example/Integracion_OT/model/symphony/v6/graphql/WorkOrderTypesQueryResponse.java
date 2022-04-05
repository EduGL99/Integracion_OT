package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class WorkOrderTypesQueryResponse extends GraphQLResult<Map<String, WorkOrderTypeConnectionTO>> {

    private static final String OPERATION_NAME = "workOrderTypes";

    public WorkOrderTypesQueryResponse() {
    }

    public WorkOrderTypeConnectionTO workOrderTypes() {
        Map<String, WorkOrderTypeConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
