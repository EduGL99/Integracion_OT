package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class UsersAvailabilityQueryResponse extends GraphQLResult<Map<String, java.util.List<UserAvailabilityTO>>> {

    private static final String OPERATION_NAME = "usersAvailability";

    public UsersAvailabilityQueryResponse() {
    }

    public java.util.List<UserAvailabilityTO> usersAvailability() {
        Map<String, java.util.List<UserAvailabilityTO>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
