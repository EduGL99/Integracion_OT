package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditEquipmentPortMutationResponse extends GraphQLResult<Map<String, EquipmentPortTO>> {

    private static final String OPERATION_NAME = "editEquipmentPort";

    public EditEquipmentPortMutationResponse() {
    }

    public EquipmentPortTO editEquipmentPort() {
        Map<String, EquipmentPortTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
