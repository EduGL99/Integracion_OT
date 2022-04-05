package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class UserQueryResponse extends GraphQLResult<Map<String, UserTO>> {

    private static final String OPERATION_NAME = "user";

    public UserQueryResponse() {
    }

    public UserTO user() {
        Map<String, UserTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
