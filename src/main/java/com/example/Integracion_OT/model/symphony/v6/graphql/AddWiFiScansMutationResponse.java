package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddWiFiScansMutationResponse extends GraphQLResult<Map<String, java.util.List<SurveyWiFiScanTO>>> {

    private static final String OPERATION_NAME = "addWiFiScans";

    public AddWiFiScansMutationResponse() {
    }

    public java.util.List<SurveyWiFiScanTO> addWiFiScans() {
        Map<String, java.util.List<SurveyWiFiScanTO>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
