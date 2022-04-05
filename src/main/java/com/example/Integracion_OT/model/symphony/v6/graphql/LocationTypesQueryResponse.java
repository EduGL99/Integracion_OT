package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class LocationTypesQueryResponse extends GraphQLResult<Map<String, LocationTypeConnectionTO>> {

    private static final String OPERATION_NAME = "locationTypes";

    public LocationTypesQueryResponse() {
    }

    public LocationTypeConnectionTO locationTypes() {
        Map<String, LocationTypeConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
