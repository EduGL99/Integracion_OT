package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class RemoveCounterFormulaMutationResponse extends GraphQLResult<Map<String, String>> {

    private static final String OPERATION_NAME = "removeCounterFormula";

    public RemoveCounterFormulaMutationResponse() {
    }

    public String removeCounterFormula() {
        Map<String, String> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
