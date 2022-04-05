package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditServiceTypeMutationResponse extends GraphQLResult<Map<String, ServiceTypeTO>> {

    private static final String OPERATION_NAME = "editServiceType";

    public EditServiceTypeMutationResponse() {
    }

    public ServiceTypeTO editServiceType() {
        Map<String, ServiceTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
