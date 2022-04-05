package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddCounterFamilyMutationResponse extends GraphQLResult<Map<String, CounterFamilyTO>> {

    private static final String OPERATION_NAME = "addCounterFamily";

    public AddCounterFamilyMutationResponse() {
    }

    public CounterFamilyTO addCounterFamily() {
        Map<String, CounterFamilyTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
