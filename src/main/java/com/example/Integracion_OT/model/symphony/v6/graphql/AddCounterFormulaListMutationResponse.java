package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddCounterFormulaListMutationResponse extends GraphQLResult<Map<String, java.util.List<CounterFormulaTO>>> {

    private static final String OPERATION_NAME = "addCounterFormulaList";

    public AddCounterFormulaListMutationResponse() {
    }

    public java.util.List<CounterFormulaTO> addCounterFormulaList() {
        Map<String, java.util.List<CounterFormulaTO>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
