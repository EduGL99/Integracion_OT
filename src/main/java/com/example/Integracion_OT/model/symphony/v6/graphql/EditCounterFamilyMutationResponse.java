package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditCounterFamilyMutationResponse extends GraphQLResult<Map<String, CounterFamilyTO>> {

    private static final String OPERATION_NAME = "editCounterFamily";

    public EditCounterFamilyMutationResponse() {
    }

    public CounterFamilyTO editCounterFamily() {
        Map<String, CounterFamilyTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
