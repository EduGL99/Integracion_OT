package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of Kqi.
 */

public class KqisQueryResponse extends GraphQLResult<Map<String, KqiConnectionTO>> {

    private static final String OPERATION_NAME = "kqis";

    public KqisQueryResponse() {
    }

    /**
     * A list of Kqi.
     */
    public KqiConnectionTO kqis() {
        Map<String, KqiConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
