package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class WorkerTypesQueryResponse extends GraphQLResult<Map<String, WorkerTypeConnectionTO>> {

    private static final String OPERATION_NAME = "workerTypes";

    public WorkerTypesQueryResponse() {
    }

    public WorkerTypeConnectionTO workerTypes() {
        Map<String, WorkerTypeConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
