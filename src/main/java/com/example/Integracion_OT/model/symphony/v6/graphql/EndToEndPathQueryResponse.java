package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * Fetches end to end path of links
 */

public class EndToEndPathQueryResponse extends GraphQLResult<Map<String, EndToEndPathTO>> {

    private static final String OPERATION_NAME = "endToEndPath";

    public EndToEndPathQueryResponse() {
    }

    /**
     * Fetches end to end path of links
     */
    public EndToEndPathTO endToEndPath() {
        Map<String, EndToEndPathTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
