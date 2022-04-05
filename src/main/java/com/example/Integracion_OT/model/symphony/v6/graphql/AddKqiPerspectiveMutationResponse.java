package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddKqiPerspectiveMutationResponse extends GraphQLResult<Map<String, KqiPerspectiveTO>> {

    private static final String OPERATION_NAME = "addKqiPerspective";

    public AddKqiPerspectiveMutationResponse() {
    }

    public KqiPerspectiveTO addKqiPerspective() {
        Map<String, KqiPerspectiveTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
