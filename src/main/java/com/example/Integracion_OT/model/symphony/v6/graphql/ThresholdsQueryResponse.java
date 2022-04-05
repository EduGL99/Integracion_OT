package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of thresholds.
 */

public class ThresholdsQueryResponse extends GraphQLResult<Map<String, ThresholdConnectionTO>> {

    private static final String OPERATION_NAME = "thresholds";

    public ThresholdsQueryResponse() {
    }

    /**
     * A list of thresholds.
     */
    public ThresholdConnectionTO thresholds() {
        Map<String, ThresholdConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
