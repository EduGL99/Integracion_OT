package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditProjectTypeMutationResponse extends GraphQLResult<Map<String, ProjectTypeTO>> {

    private static final String OPERATION_NAME = "editProjectType";

    public EditProjectTypeMutationResponse() {
    }

    public ProjectTypeTO editProjectType() {
        Map<String, ProjectTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
