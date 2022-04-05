package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditThresholdMutationResponse extends GraphQLResult<Map<String, ThresholdTO>> {

    private static final String OPERATION_NAME = "editThreshold";

    public EditThresholdMutationResponse() {
    }

    public ThresholdTO editThreshold() {
        Map<String, ThresholdTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
