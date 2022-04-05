package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class MoveLocationMutationResponse extends GraphQLResult<Map<String, LocationTO>> {

    private static final String OPERATION_NAME = "moveLocation";

    public MoveLocationMutationResponse() {
    }

    public LocationTO moveLocation() {
        Map<String, LocationTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
