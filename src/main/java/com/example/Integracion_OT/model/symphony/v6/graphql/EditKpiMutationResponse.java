package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditKpiMutationResponse extends GraphQLResult<Map<String, KpiTO>> {

    private static final String OPERATION_NAME = "editKpi";

    public EditKpiMutationResponse() {
    }

    public KpiTO editKpi() {
        Map<String, KpiTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
