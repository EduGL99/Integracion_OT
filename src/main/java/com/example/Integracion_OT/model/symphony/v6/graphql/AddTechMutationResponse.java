package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddTechMutationResponse extends GraphQLResult<Map<String, TechTO>> {

    private static final String OPERATION_NAME = "addTech";

    public AddTechMutationResponse() {
    }

    public TechTO addTech() {
        Map<String, TechTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
