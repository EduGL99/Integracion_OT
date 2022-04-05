package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of counters.
 */

public class CountersQueryResponse extends GraphQLResult<Map<String, CounterConnectionTO>> {

    private static final String OPERATION_NAME = "counters";

    public CountersQueryResponse() {
    }

    /**
     * A list of counters.
     */
    public CounterConnectionTO counters() {
        Map<String, CounterConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
