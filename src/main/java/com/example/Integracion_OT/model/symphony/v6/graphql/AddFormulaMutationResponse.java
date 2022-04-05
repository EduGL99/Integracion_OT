package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddFormulaMutationResponse extends GraphQLResult<Map<String, FormulaTO>> {

    private static final String OPERATION_NAME = "addFormula";

    public AddFormulaMutationResponse() {
    }

    public FormulaTO addFormula() {
        Map<String, FormulaTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
