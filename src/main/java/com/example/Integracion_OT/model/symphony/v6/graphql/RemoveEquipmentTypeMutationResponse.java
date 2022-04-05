package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class RemoveEquipmentTypeMutationResponse extends GraphQLResult<Map<String, String>> {

    private static final String OPERATION_NAME = "removeEquipmentType";

    public RemoveEquipmentTypeMutationResponse() {
    }

    public String removeEquipmentType() {
        Map<String, String> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
