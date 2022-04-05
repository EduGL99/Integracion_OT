package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class SearchForNodeQueryResponse extends GraphQLResult<Map<String, SearchNodesConnectionTO>> {

    private static final String OPERATION_NAME = "searchForNode";

    public SearchForNodeQueryResponse() {
    }

    public SearchNodesConnectionTO searchForNode() {
        Map<String, SearchNodesConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
