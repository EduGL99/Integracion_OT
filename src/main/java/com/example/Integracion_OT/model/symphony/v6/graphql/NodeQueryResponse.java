package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * Fetches an object given its ID.
 */

public class NodeQueryResponse extends GraphQLResult<Map<String, NodeTO>> {

    private static final String OPERATION_NAME = "node";

    public NodeQueryResponse() {
    }

    /**
     * Fetches an object given its ID.
     */
    public NodeTO node() {
        Map<String, NodeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
