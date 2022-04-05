package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of networkTypes.
 */

public class NetworkTypesQueryResponse extends GraphQLResult<Map<String, NetworkTypeConnectionTO>> {

    private static final String OPERATION_NAME = "networkTypes";

    public NetworkTypesQueryResponse() {
    }

    /**
     * A list of networkTypes.
     */
    public NetworkTypeConnectionTO networkTypes() {
        Map<String, NetworkTypeConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
