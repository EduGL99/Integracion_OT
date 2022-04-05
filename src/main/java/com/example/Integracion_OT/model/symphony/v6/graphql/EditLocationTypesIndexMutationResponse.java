package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditLocationTypesIndexMutationResponse extends GraphQLResult<Map<String, java.util.List<LocationTypeTO>>> {

    private static final String OPERATION_NAME = "editLocationTypesIndex";

    public EditLocationTypesIndexMutationResponse() {
    }

    public java.util.List<LocationTypeTO> editLocationTypesIndex() {
        Map<String, java.util.List<LocationTypeTO>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
