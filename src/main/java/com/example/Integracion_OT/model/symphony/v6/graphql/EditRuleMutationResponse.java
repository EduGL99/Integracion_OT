package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditRuleMutationResponse extends GraphQLResult<Map<String, RuleTO>> {

    private static final String OPERATION_NAME = "editRule";

    public EditRuleMutationResponse() {
    }

    public RuleTO editRule() {
        Map<String, RuleTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
