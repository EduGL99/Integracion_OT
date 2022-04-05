package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class LinksQueryResponse extends GraphQLResult<Map<String, LinkConnectionTO>> {

    private static final String OPERATION_NAME = "links";

    public LinksQueryResponse() {
    }

    public LinkConnectionTO links() {
        Map<String, LinkConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
