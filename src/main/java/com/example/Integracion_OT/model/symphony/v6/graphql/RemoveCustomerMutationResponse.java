package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class RemoveCustomerMutationResponse extends GraphQLResult<Map<String, String>> {

    private static final String OPERATION_NAME = "removeCustomer";

    public RemoveCustomerMutationResponse() {
    }

    public String removeCustomer() {
        Map<String, String> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
