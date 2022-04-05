package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditWorkerTypeMutationResponse extends GraphQLResult<Map<String, WorkerTypeTO>> {

    private static final String OPERATION_NAME = "editWorkerType";

    public EditWorkerTypeMutationResponse() {
    }

    public WorkerTypeTO editWorkerType() {
        Map<String, WorkerTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
