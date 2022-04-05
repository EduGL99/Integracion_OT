package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditLocationTypeMutationResponse extends GraphQLResult<Map<String, LocationTypeTO>> {

    private static final String OPERATION_NAME = "editLocationType";

    public EditLocationTypeMutationResponse() {
    }

    public LocationTypeTO editLocationType() {
        Map<String, LocationTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
