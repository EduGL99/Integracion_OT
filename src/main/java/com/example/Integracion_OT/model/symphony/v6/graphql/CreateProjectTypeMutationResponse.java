package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class CreateProjectTypeMutationResponse extends GraphQLResult<Map<String, ProjectTypeTO>> {

    private static final String OPERATION_NAME = "createProjectType";

    public CreateProjectTypeMutationResponse() {
    }

    public ProjectTypeTO createProjectType() {
        Map<String, ProjectTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
