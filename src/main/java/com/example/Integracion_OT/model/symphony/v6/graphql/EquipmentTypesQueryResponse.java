package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EquipmentTypesQueryResponse extends GraphQLResult<Map<String, EquipmentTypeConnectionTO>> {

    private static final String OPERATION_NAME = "equipmentTypes";

    public EquipmentTypesQueryResponse() {
    }

    public EquipmentTypeConnectionTO equipmentTypes() {
        Map<String, EquipmentTypeConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
