package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditComparatorMutationResponse extends GraphQLResult<Map<String, ComparatorTO>> {

    private static final String OPERATION_NAME = "editComparator";

    public EditComparatorMutationResponse() {
    }

    public ComparatorTO editComparator() {
        Map<String, ComparatorTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
