package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class ProjectAddedSubscriptionResponse extends GraphQLResult<Map<String, ProjectTO>> {

    private static final String OPERATION_NAME = "projectAdded";

    public ProjectAddedSubscriptionResponse() {
    }

    public ProjectTO projectAdded() {
        Map<String, ProjectTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
