package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddAppointmentMutationResponse extends GraphQLResult<Map<String, AppointmentTO>> {

    private static final String OPERATION_NAME = "addAppointment";

    public AddAppointmentMutationResponse() {
    }

    public AppointmentTO addAppointment() {
        Map<String, AppointmentTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
