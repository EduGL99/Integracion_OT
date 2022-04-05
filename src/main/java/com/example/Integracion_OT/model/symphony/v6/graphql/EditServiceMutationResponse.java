package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditServiceMutationResponse extends GraphQLResult<Map<String, ServiceTO>> {

    private static final String OPERATION_NAME = "editService";

    public EditServiceMutationResponse() {
    }

    public ServiceTO editService() {
        Map<String, ServiceTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
