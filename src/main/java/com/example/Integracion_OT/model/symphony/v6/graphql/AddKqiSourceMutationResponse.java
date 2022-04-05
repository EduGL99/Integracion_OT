package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddKqiSourceMutationResponse extends GraphQLResult<Map<String, KqiSourceTO>> {

    private static final String OPERATION_NAME = "addKqiSource";

    public AddKqiSourceMutationResponse() {
    }

    public KqiSourceTO addKqiSource() {
        Map<String, KqiSourceTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
