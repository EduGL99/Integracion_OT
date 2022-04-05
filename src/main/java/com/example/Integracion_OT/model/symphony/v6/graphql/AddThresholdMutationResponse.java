package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddThresholdMutationResponse extends GraphQLResult<Map<String, ThresholdTO>> {

    private static final String OPERATION_NAME = "addThreshold";

    public AddThresholdMutationResponse() {
    }

    public ThresholdTO addThreshold() {
        Map<String, ThresholdTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
