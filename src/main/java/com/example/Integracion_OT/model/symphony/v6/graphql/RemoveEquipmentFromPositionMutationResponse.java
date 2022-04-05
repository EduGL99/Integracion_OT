package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class RemoveEquipmentFromPositionMutationResponse extends GraphQLResult<Map<String, EquipmentPositionTO>> {

    private static final String OPERATION_NAME = "removeEquipmentFromPosition";

    public RemoveEquipmentFromPositionMutationResponse() {
    }

    public EquipmentPositionTO removeEquipmentFromPosition() {
        Map<String, EquipmentPositionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
