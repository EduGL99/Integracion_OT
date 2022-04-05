package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddHyperlinkMutationResponse extends GraphQLResult<Map<String, HyperlinkTO>> {

    private static final String OPERATION_NAME = "addHyperlink";

    public AddHyperlinkMutationResponse() {
    }

    public HyperlinkTO addHyperlink() {
        Map<String, HyperlinkTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
