package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class ImportFlowDraftMutationResponse extends GraphQLResult<Map<String, FlowDraftTO>> {

    private static final String OPERATION_NAME = "importFlowDraft";

    public ImportFlowDraftMutationResponse() {
    }

    public FlowDraftTO importFlowDraft() {
        Map<String, FlowDraftTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
