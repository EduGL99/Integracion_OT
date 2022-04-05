package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class ActionTypeQueryResponse extends GraphQLResult<Map<String, ActionTypeTO>> {

    private static final String OPERATION_NAME = "actionType";

    public ActionTypeQueryResponse() {
    }

    public ActionTypeTO actionType() {
        Map<String, ActionTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
