package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddCounterMutationResponse extends GraphQLResult<Map<String, CounterTO>> {

    private static final String OPERATION_NAME = "addCounter";

    public AddCounterMutationResponse() {
    }

    public CounterTO addCounter() {
        Map<String, CounterTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
