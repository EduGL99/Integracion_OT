package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddUsersGroupMutationResponse extends GraphQLResult<Map<String, UsersGroupTO>> {

    private static final String OPERATION_NAME = "addUsersGroup";

    public AddUsersGroupMutationResponse() {
    }

    public UsersGroupTO addUsersGroup() {
        Map<String, UsersGroupTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
