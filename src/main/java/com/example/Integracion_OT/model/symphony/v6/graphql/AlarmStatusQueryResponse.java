package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of alarmStatus.
 */

public class AlarmStatusQueryResponse extends GraphQLResult<Map<String, AlarmStatusConnectionTO>> {

    private static final String OPERATION_NAME = "alarmStatus";

    public AlarmStatusQueryResponse() {
    }

    /**
     * A list of alarmStatus.
     */
    public AlarmStatusConnectionTO alarmStatus() {
        Map<String, AlarmStatusConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
