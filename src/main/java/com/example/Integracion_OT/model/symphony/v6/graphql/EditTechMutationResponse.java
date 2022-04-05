package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditTechMutationResponse extends GraphQLResult<Map<String, TechTO>> {

    private static final String OPERATION_NAME = "editTech";

    public EditTechMutationResponse() {
    }

    public TechTO editTech() {
        Map<String, TechTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
