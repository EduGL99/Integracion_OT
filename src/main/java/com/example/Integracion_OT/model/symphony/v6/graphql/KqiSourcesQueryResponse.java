package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of kqiSource.
 */

public class KqiSourcesQueryResponse extends GraphQLResult<Map<String, KqiSourceConnectionTO>> {

    private static final String OPERATION_NAME = "kqiSources";

    public KqiSourcesQueryResponse() {
    }

    /**
     * A list of kqiSource.
     */
    public KqiSourceConnectionTO kqiSources() {
        Map<String, KqiSourceConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
