package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddRuleLimitMutationResponse extends GraphQLResult<Map<String, RuleLimitTO>> {

    private static final String OPERATION_NAME = "addRuleLimit";

    public AddRuleLimitMutationResponse() {
    }

    public RuleLimitTO addRuleLimit() {
        Map<String, RuleLimitTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
