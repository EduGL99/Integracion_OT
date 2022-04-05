package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddLocationMutationResponse extends GraphQLResult<Map<String, LocationTO>> {

    private static final String OPERATION_NAME = "addLocation";

    public AddLocationMutationResponse() {
    }

    public LocationTO addLocation() {
        Map<String, LocationTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
