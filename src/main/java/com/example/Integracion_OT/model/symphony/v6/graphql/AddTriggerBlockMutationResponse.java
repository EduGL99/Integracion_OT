package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddTriggerBlockMutationResponse extends GraphQLResult<Map<String, BlockTO>> {

    private static final String OPERATION_NAME = "addTriggerBlock";

    public AddTriggerBlockMutationResponse() {
    }

    public BlockTO addTriggerBlock() {
        Map<String, BlockTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
