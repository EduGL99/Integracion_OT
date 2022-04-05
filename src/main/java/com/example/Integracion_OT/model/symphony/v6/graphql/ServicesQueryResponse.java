package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class ServicesQueryResponse extends GraphQLResult<Map<String, ServiceConnectionTO>> {

    private static final String OPERATION_NAME = "services";

    public ServicesQueryResponse() {
    }

    public ServiceConnectionTO services() {
        Map<String, ServiceConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
