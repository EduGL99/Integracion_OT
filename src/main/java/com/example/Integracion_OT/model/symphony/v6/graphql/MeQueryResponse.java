package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * Fetches current viewer.
 */

public class MeQueryResponse extends GraphQLResult<Map<String, ViewerTO>> {

    private static final String OPERATION_NAME = "me";

    public MeQueryResponse() {
    }

    /**
     * Fetches current viewer.
     */
    public ViewerTO me() {
        Map<String, ViewerTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
