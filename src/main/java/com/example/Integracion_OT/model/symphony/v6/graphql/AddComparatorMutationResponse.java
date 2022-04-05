package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddComparatorMutationResponse extends GraphQLResult<Map<String, ComparatorTO>> {

    private static final String OPERATION_NAME = "addComparator";

    public AddComparatorMutationResponse() {
    }

    public ComparatorTO addComparator() {
        Map<String, ComparatorTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
