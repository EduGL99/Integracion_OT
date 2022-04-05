package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of ruleTypes.
 */

public class RuleTypesQueryResponse extends GraphQLResult<Map<String, RuleTypeConnectionTO>> {

    private static final String OPERATION_NAME = "ruleTypes";

    public RuleTypesQueryResponse() {
    }

    /**
     * A list of ruleTypes.
     */
    public RuleTypeConnectionTO ruleTypes() {
        Map<String, RuleTypeConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
