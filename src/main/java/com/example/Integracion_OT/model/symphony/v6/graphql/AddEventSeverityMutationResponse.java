package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddEventSeverityMutationResponse extends GraphQLResult<Map<String, EventSeverityTO>> {

    private static final String OPERATION_NAME = "addEventSeverity";

    public AddEventSeverityMutationResponse() {
    }

    public EventSeverityTO addEventSeverity() {
        Map<String, EventSeverityTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
