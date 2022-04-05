package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditWorkOrderTypeMutationResponse extends GraphQLResult<Map<String, WorkOrderTypeTO>> {

    private static final String OPERATION_NAME = "editWorkOrderType";

    public EditWorkOrderTypeMutationResponse() {
    }

    public WorkOrderTypeTO editWorkOrderType() {
        Map<String, WorkOrderTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
