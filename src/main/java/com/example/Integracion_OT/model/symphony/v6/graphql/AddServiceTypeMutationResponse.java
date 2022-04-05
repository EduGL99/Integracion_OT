package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddServiceTypeMutationResponse extends GraphQLResult<Map<String, ServiceTypeTO>> {

    private static final String OPERATION_NAME = "addServiceType";

    public AddServiceTypeMutationResponse() {
    }

    public ServiceTypeTO addServiceType() {
        Map<String, ServiceTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
