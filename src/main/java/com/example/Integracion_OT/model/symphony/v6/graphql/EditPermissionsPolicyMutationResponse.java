package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditPermissionsPolicyMutationResponse extends GraphQLResult<Map<String, PermissionsPolicyTO>> {

    private static final String OPERATION_NAME = "editPermissionsPolicy";

    public EditPermissionsPolicyMutationResponse() {
    }

    public PermissionsPolicyTO editPermissionsPolicy() {
        Map<String, PermissionsPolicyTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
