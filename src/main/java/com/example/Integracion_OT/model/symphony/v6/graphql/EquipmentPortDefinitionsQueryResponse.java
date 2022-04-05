package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EquipmentPortDefinitionsQueryResponse extends GraphQLResult<Map<String, EquipmentPortDefinitionConnectionTO>> {

    private static final String OPERATION_NAME = "equipmentPortDefinitions";

    public EquipmentPortDefinitionsQueryResponse() {
    }

    public EquipmentPortDefinitionConnectionTO equipmentPortDefinitions() {
        Map<String, EquipmentPortDefinitionConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
