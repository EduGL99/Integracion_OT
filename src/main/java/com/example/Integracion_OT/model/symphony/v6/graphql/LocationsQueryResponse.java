package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of locations.
 */

public class LocationsQueryResponse extends GraphQLResult<Map<String, LocationConnectionTO>> {

    private static final String OPERATION_NAME = "locations";

    public LocationsQueryResponse() {
    }

    /**
     * A list of locations.
     */
    public LocationConnectionTO locations() {
        Map<String, LocationConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
