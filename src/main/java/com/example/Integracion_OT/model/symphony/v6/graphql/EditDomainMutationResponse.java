package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditDomainMutationResponse extends GraphQLResult<Map<String, DomainTO>> {

    private static final String OPERATION_NAME = "editDomain";

    public EditDomainMutationResponse() {
    }

    public DomainTO editDomain() {
        Map<String, DomainTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
