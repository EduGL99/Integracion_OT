package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddAlarmFilterMutationResponse extends GraphQLResult<Map<String, AlarmFilterTO>> {

    private static final String OPERATION_NAME = "addAlarmFilter";

    public AddAlarmFilterMutationResponse() {
    }

    public AlarmFilterTO addAlarmFilter() {
        Map<String, AlarmFilterTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
