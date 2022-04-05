package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class PermissionsPoliciesQueryResponse extends GraphQLResult<Map<String, PermissionsPolicyConnectionTO>> {

    private static final String OPERATION_NAME = "permissionsPolicies";

    public PermissionsPoliciesQueryResponse() {
    }

    public PermissionsPolicyConnectionTO permissionsPolicies() {
        Map<String, PermissionsPolicyConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
