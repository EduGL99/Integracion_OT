package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddImageSubscriptionResponse extends GraphQLResult<Map<String, FileTO>> {

    private static final String OPERATION_NAME = "AddImage";

    public AddImageSubscriptionResponse() {
    }

    public FileTO AddImage() {
        Map<String, FileTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
