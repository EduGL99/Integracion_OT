package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditUserMutationResponse extends GraphQLResult<Map<String, UserTO>> {

    private static final String OPERATION_NAME = "editUser";

    public EditUserMutationResponse() {
    }

    public UserTO editUser() {
        Map<String, UserTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
