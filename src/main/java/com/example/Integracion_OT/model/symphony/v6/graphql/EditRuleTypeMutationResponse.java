package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditRuleTypeMutationResponse extends GraphQLResult<Map<String, RuleTypeTO>> {

    private static final String OPERATION_NAME = "editRuleType";

    public EditRuleTypeMutationResponse() {
    }

    public RuleTypeTO editRuleType() {
        Map<String, RuleTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
