package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of kqiPerspectives.
 */

public class KqiPerspectivesQueryResponse extends GraphQLResult<Map<String, KqiPerspectiveConnectionTO>> {

    private static final String OPERATION_NAME = "kqiPerspectives";

    public KqiPerspectivesQueryResponse() {
    }

    /**
     * A list of kqiPerspectives.
     */
    public KqiPerspectiveConnectionTO kqiPerspectives() {
        Map<String, KqiPerspectiveConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
