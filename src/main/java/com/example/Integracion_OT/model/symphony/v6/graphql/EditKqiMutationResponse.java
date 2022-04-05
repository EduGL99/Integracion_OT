package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditKqiMutationResponse extends GraphQLResult<Map<String, KqiTO>> {

    private static final String OPERATION_NAME = "editKqi";

    public EditKqiMutationResponse() {
    }

    public KqiTO editKqi() {
        Map<String, KqiTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
