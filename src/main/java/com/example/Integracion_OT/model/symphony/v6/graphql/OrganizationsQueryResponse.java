package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of organization.
 */

public class OrganizationsQueryResponse extends GraphQLResult<Map<String, OrganizationConnectionTO>> {

    private static final String OPERATION_NAME = "organizations";

    public OrganizationsQueryResponse() {
    }

    /**
     * A list of organization.
     */
    public OrganizationConnectionTO organizations() {
        Map<String, OrganizationConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
