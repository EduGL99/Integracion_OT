package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditAlarmStatusMutationResponse extends GraphQLResult<Map<String, AlarmStatusTO>> {

    private static final String OPERATION_NAME = "editAlarmStatus";

    public EditAlarmStatusMutationResponse() {
    }

    public AlarmStatusTO editAlarmStatus() {
        Map<String, AlarmStatusTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
