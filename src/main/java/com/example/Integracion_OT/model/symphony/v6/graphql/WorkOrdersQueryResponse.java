package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of work orders.
 */

public class WorkOrdersQueryResponse extends GraphQLResult<Map<String, WorkOrderConnectionTO>> {

    private static final String OPERATION_NAME = "workOrders";

    public WorkOrdersQueryResponse() {
    }

    /**
     * A list of work orders.
     */
    public WorkOrderConnectionTO workOrders() {
        Map<String, WorkOrderConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
