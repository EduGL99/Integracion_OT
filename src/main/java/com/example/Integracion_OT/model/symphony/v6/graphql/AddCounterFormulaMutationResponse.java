package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddCounterFormulaMutationResponse extends GraphQLResult<Map<String, CounterFormulaTO>> {

    private static final String OPERATION_NAME = "addCounterFormula";

    public AddCounterFormulaMutationResponse() {
    }

    public CounterFormulaTO addCounterFormula() {
        Map<String, CounterFormulaTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
