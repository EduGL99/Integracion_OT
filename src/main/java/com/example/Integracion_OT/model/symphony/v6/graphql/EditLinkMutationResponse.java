package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditLinkMutationResponse extends GraphQLResult<Map<String, LinkTO>> {

    private static final String OPERATION_NAME = "editLink";

    public EditLinkMutationResponse() {
    }

    public LinkTO editLink() {
        Map<String, LinkTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
