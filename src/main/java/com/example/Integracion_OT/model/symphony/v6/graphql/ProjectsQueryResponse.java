package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of projects.
 */

public class ProjectsQueryResponse extends GraphQLResult<Map<String, ProjectConnectionTO>> {

    private static final String OPERATION_NAME = "projects";

    public ProjectsQueryResponse() {
    }

    /**
     * A list of projects.
     */
    public ProjectConnectionTO projects() {
        Map<String, ProjectConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
