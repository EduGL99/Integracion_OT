package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of kpis.
 */

public class KpisQueryResponse extends GraphQLResult<Map<String, KpiConnectionTO>> {

    private static final String OPERATION_NAME = "kpis";

    public KpisQueryResponse() {
    }

    /**
     * A list of kpis.
     */
    public KpiConnectionTO kpis() {
        Map<String, KpiConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
