package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddConnectorMutationResponse extends GraphQLResult<Map<String, ConnectorTO>> {

    private static final String OPERATION_NAME = "addConnector";

    public AddConnectorMutationResponse() {
    }

    public ConnectorTO addConnector() {
        Map<String, ConnectorTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
