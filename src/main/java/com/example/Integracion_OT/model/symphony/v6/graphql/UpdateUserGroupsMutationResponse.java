package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class UpdateUserGroupsMutationResponse extends GraphQLResult<Map<String, UserTO>> {

    private static final String OPERATION_NAME = "updateUserGroups";

    public UpdateUserGroupsMutationResponse() {
    }

    public UserTO updateUserGroups() {
        Map<String, UserTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
