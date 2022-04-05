package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EquipmentPortTypesQueryResponse extends GraphQLResult<Map<String, EquipmentPortTypeConnectionTO>> {

    private static final String OPERATION_NAME = "equipmentPortTypes";

    public EquipmentPortTypesQueryResponse() {
    }

    public EquipmentPortTypeConnectionTO equipmentPortTypes() {
        Map<String, EquipmentPortTypeConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
