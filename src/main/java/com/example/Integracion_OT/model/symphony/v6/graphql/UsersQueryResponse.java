package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class UsersQueryResponse extends GraphQLResult<Map<String, UserConnectionTO>> {

    private static final String OPERATION_NAME = "users";

    public UsersQueryResponse() {
    }

    public UserConnectionTO users() {
        Map<String, UserConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
