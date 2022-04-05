package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddNetworkTypeMutationResponse extends GraphQLResult<Map<String, NetworkTypeTO>> {

    private static final String OPERATION_NAME = "addNetworkType";

    public AddNetworkTypeMutationResponse() {
    }

    public NetworkTypeTO addNetworkType() {
        Map<String, NetworkTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
