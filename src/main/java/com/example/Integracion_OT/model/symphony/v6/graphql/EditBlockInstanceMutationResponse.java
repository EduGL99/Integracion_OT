package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditBlockInstanceMutationResponse extends GraphQLResult<Map<String, BlockInstanceTO>> {

    private static final String OPERATION_NAME = "editBlockInstance";

    public EditBlockInstanceMutationResponse() {
    }

    public BlockInstanceTO editBlockInstance() {
        Map<String, BlockInstanceTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
