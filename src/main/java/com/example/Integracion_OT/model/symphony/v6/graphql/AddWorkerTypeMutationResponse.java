package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddWorkerTypeMutationResponse extends GraphQLResult<Map<String, WorkerTypeTO>> {

    private static final String OPERATION_NAME = "addWorkerType";

    public AddWorkerTypeMutationResponse() {
    }

    public WorkerTypeTO addWorkerType() {
        Map<String, WorkerTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
