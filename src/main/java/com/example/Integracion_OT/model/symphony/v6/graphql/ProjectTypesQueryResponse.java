package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class ProjectTypesQueryResponse extends GraphQLResult<Map<String, ProjectTypeConnectionTO>> {

    private static final String OPERATION_NAME = "projectTypes";

    public ProjectTypesQueryResponse() {
    }

    public ProjectTypeConnectionTO projectTypes() {
        Map<String, ProjectTypeConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
