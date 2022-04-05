package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of eventSeverities.
 */

public class EventSeveritiesQueryResponse extends GraphQLResult<Map<String, EventSeverityConnectionTO>> {

    private static final String OPERATION_NAME = "eventSeverities";

    public EventSeveritiesQueryResponse() {
    }

    /**
     * A list of eventSeverities.
     */
    public EventSeverityConnectionTO eventSeverities() {
        Map<String, EventSeverityConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
