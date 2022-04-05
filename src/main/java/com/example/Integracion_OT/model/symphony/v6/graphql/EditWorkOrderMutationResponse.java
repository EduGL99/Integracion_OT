package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditWorkOrderMutationResponse extends GraphQLResult<Map<String, WorkOrderTO>> {

    private static final String OPERATION_NAME = "editWorkOrder";

    public EditWorkOrderMutationResponse() {
    }

    public WorkOrderTO editWorkOrder() {
        Map<String, WorkOrderTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
