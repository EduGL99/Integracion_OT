package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditKqiTemporalFrequencyMutationResponse extends GraphQLResult<Map<String, KqiTemporalFrequencyTO>> {

    private static final String OPERATION_NAME = "editKqiTemporalFrequency";

    public EditKqiTemporalFrequencyMutationResponse() {
    }

    public KqiTemporalFrequencyTO editKqiTemporalFrequency() {
        Map<String, KqiTemporalFrequencyTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
