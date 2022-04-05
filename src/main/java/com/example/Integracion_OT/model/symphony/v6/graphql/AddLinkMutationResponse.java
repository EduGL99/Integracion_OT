package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddLinkMutationResponse extends GraphQLResult<Map<String, LinkTO>> {

    private static final String OPERATION_NAME = "addLink";

    public AddLinkMutationResponse() {
    }

    public LinkTO addLink() {
        Map<String, LinkTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
