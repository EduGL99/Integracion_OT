package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of techs.
 */

public class TechsQueryResponse extends GraphQLResult<Map<String, TechConnectionTO>> {

    private static final String OPERATION_NAME = "techs";

    public TechsQueryResponse() {
    }

    /**
     * A list of techs.
     */
    public TechConnectionTO techs() {
        Map<String, TechConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
