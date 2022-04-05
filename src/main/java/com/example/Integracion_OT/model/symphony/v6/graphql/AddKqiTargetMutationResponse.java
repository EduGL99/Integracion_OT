package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddKqiTargetMutationResponse extends GraphQLResult<Map<String, KqiTargetTO>> {

    private static final String OPERATION_NAME = "addKqiTarget";

    public AddKqiTargetMutationResponse() {
    }

    public KqiTargetTO addKqiTarget() {
        Map<String, KqiTargetTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
