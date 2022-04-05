package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of kqiTarget.
 */

public class KqiTargetsQueryResponse extends GraphQLResult<Map<String, KqiTargetConnectionTO>> {

    private static final String OPERATION_NAME = "kqiTargets";

    public KqiTargetsQueryResponse() {
    }

    /**
     * A list of kqiTarget.
     */
    public KqiTargetConnectionTO kqiTargets() {
        Map<String, KqiTargetConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
