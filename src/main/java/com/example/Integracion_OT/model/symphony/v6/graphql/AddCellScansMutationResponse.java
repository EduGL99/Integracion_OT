package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddCellScansMutationResponse extends GraphQLResult<Map<String, java.util.List<SurveyCellScanTO>>> {

    private static final String OPERATION_NAME = "addCellScans";

    public AddCellScansMutationResponse() {
    }

    public java.util.List<SurveyCellScanTO> addCellScans() {
        Map<String, java.util.List<SurveyCellScanTO>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
