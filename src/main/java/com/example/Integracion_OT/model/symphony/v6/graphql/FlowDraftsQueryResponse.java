package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class FlowDraftsQueryResponse extends GraphQLResult<Map<String, FlowDraftConnectionTO>> {

    private static final String OPERATION_NAME = "flowDrafts";

    public FlowDraftsQueryResponse() {
    }

    public FlowDraftConnectionTO flowDrafts() {
        Map<String, FlowDraftConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
