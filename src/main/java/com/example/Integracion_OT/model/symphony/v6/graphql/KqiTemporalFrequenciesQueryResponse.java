package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of kqiTemporalFrequency.
 */

public class KqiTemporalFrequenciesQueryResponse extends GraphQLResult<Map<String, KqiTemporalFrequencyConnectionTO>> {

    private static final String OPERATION_NAME = "kqiTemporalFrequencies";

    public KqiTemporalFrequenciesQueryResponse() {
    }

    /**
     * A list of kqiTemporalFrequency.
     */
    public KqiTemporalFrequencyConnectionTO kqiTemporalFrequencies() {
        Map<String, KqiTemporalFrequencyConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
