package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditCounterFormulaMutationResponse extends GraphQLResult<Map<String, CounterFormulaTO>> {

    private static final String OPERATION_NAME = "editCounterFormula";

    public EditCounterFormulaMutationResponse() {
    }

    public CounterFormulaTO editCounterFormula() {
        Map<String, CounterFormulaTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
