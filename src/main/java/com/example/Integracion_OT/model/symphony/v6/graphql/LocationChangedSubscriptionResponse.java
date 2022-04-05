package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class LocationChangedSubscriptionResponse extends GraphQLResult<Map<String, LocationTO>> {

    private static final String OPERATION_NAME = "locationChanged";

    public LocationChangedSubscriptionResponse() {
    }

    public LocationTO locationChanged() {
        Map<String, LocationTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
