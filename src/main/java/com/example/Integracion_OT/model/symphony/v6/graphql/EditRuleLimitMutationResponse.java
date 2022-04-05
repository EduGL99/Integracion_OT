package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditRuleLimitMutationResponse extends GraphQLResult<Map<String, RuleLimitTO>> {

    private static final String OPERATION_NAME = "editRuleLimit";

    public EditRuleLimitMutationResponse() {
    }

    public RuleLimitTO editRuleLimit() {
        Map<String, RuleLimitTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
