package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AppointmentsQueryResponse extends GraphQLResult<Map<String, AppointmentConnectionTO>> {

    private static final String OPERATION_NAME = "appointments";

    public AppointmentsQueryResponse() {
    }

    public AppointmentConnectionTO appointments() {
        Map<String, AppointmentConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
