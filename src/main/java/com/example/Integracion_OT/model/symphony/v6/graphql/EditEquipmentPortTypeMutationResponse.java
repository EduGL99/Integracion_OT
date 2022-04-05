package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditEquipmentPortTypeMutationResponse extends GraphQLResult<Map<String, EquipmentPortTypeTO>> {

    private static final String OPERATION_NAME = "editEquipmentPortType";

    public EditEquipmentPortTypeMutationResponse() {
    }

    public EquipmentPortTypeTO editEquipmentPortType() {
        Map<String, EquipmentPortTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
