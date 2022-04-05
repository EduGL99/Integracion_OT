package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddEquipmentMutationResponse extends GraphQLResult<Map<String, EquipmentTO>> {

    private static final String OPERATION_NAME = "addEquipment";

    public AddEquipmentMutationResponse() {
    }

    public EquipmentTO addEquipment() {
        Map<String, EquipmentTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
