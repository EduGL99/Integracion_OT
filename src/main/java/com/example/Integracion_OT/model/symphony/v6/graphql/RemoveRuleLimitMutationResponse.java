package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class RemoveRuleLimitMutationResponse extends GraphQLResult<Map<String, String>> {

    private static final String OPERATION_NAME = "removeRuleLimit";

    public RemoveRuleLimitMutationResponse() {
    }

    public String removeRuleLimit() {
        Map<String, String> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
