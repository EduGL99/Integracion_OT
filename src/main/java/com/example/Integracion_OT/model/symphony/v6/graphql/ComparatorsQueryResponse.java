package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of comparator.
 */

public class ComparatorsQueryResponse extends GraphQLResult<Map<String, ComparatorConnectionTO>> {

    private static final String OPERATION_NAME = "comparators";

    public ComparatorsQueryResponse() {
    }

    /**
     * A list of comparator.
     */
    public ComparatorConnectionTO comparators() {
        Map<String, ComparatorConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
