package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class DeleteHyperlinkMutationResponse extends GraphQLResult<Map<String, HyperlinkTO>> {

    private static final String OPERATION_NAME = "deleteHyperlink";

    public DeleteHyperlinkMutationResponse() {
    }

    public HyperlinkTO deleteHyperlink() {
        Map<String, HyperlinkTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
