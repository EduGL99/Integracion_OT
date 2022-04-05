package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditIsListableMutationResponse extends GraphQLResult<Map<String, PropertyTypeTO>> {

    private static final String OPERATION_NAME = "editIsListable";

    public EditIsListableMutationResponse() {
    }

    public PropertyTypeTO editIsListable() {
        Map<String, PropertyTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
