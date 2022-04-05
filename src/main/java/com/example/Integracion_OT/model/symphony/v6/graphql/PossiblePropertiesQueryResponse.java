package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class PossiblePropertiesQueryResponse extends GraphQLResult<Map<String, java.util.List<PropertyTypeTO>>> {

    private static final String OPERATION_NAME = "possibleProperties";

    public PossiblePropertiesQueryResponse() {
    }

    public java.util.List<PropertyTypeTO> possibleProperties() {
        Map<String, java.util.List<PropertyTypeTO>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
