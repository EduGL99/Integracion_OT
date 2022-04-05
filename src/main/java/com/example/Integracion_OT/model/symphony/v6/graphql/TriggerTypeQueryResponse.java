package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class TriggerTypeQueryResponse extends GraphQLResult<Map<String, TriggerTypeTO>> {

    private static final String OPERATION_NAME = "triggerType";

    public TriggerTypeQueryResponse() {
    }

    public TriggerTypeTO triggerType() {
        Map<String, TriggerTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
