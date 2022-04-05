package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddAlarmStatusMutationResponse extends GraphQLResult<Map<String, AlarmStatusTO>> {

    private static final String OPERATION_NAME = "addAlarmStatus";

    public AddAlarmStatusMutationResponse() {
    }

    public AlarmStatusTO addAlarmStatus() {
        Map<String, AlarmStatusTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
