package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class TechnicianWorkOrderCheckOutMutationResponse extends GraphQLResult<Map<String, WorkOrderTO>> {

    private static final String OPERATION_NAME = "technicianWorkOrderCheckOut";

    public TechnicianWorkOrderCheckOutMutationResponse() {
    }

    public WorkOrderTO technicianWorkOrderCheckOut() {
        Map<String, WorkOrderTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
