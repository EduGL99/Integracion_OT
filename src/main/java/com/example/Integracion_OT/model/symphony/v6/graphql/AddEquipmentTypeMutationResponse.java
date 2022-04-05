package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddEquipmentTypeMutationResponse extends GraphQLResult<Map<String, EquipmentTypeTO>> {

    private static final String OPERATION_NAME = "addEquipmentType";

    public AddEquipmentTypeMutationResponse() {
    }

    public EquipmentTypeTO addEquipmentType() {
        Map<String, EquipmentTypeTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
