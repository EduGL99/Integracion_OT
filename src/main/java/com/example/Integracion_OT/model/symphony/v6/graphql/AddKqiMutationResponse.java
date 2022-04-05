package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddKqiMutationResponse extends GraphQLResult<Map<String, KqiTO>> {

    private static final String OPERATION_NAME = "addKqi";

    public AddKqiMutationResponse() {
    }

    public KqiTO addKqi() {
        Map<String, KqiTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
