package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddRuleTypeMutationResponse extends GraphQLResult<Map<String, RuleTypeTO>> {

    private static final String OPERATION_NAME = "addRuleType";

    public AddRuleTypeMutationResponse() {
    }

    public RuleTypeTO addRuleType() {
        Map<String, RuleTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
