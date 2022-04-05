package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddOrganizationMutationResponse extends GraphQLResult<Map<String, OrganizationTO>> {

    private static final String OPERATION_NAME = "addOrganization";

    public AddOrganizationMutationResponse() {
    }

    public OrganizationTO addOrganization() {
        Map<String, OrganizationTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
