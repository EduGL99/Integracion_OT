package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class ServiceTypesQueryResponse extends GraphQLResult<Map<String, ServiceTypeConnectionTO>> {

    private static final String OPERATION_NAME = "serviceTypes";

    public ServiceTypesQueryResponse() {
    }

    public ServiceTypeConnectionTO serviceTypes() {
        Map<String, ServiceTypeConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
