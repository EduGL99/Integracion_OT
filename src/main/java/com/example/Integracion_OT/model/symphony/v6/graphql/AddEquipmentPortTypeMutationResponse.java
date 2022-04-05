package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddEquipmentPortTypeMutationResponse extends GraphQLResult<Map<String, EquipmentPortTypeTO>> {

    private static final String OPERATION_NAME = "addEquipmentPortType";

    public AddEquipmentPortTypeMutationResponse() {
    }

    public EquipmentPortTypeTO addEquipmentPortType() {
        Map<String, EquipmentPortTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
