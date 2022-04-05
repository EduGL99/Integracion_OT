package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of counterFamilies.
 */

public class CounterFamiliesQueryResponse extends GraphQLResult<Map<String, CounterFamilyConnectionTO>> {

    private static final String OPERATION_NAME = "counterFamilies";

    public CounterFamiliesQueryResponse() {
    }

    /**
     * A list of counterFamilies.
     */
    public CounterFamilyConnectionTO counterFamilies() {
        Map<String, CounterFamilyConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
