package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class ReportFiltersQueryResponse extends GraphQLResult<Map<String, java.util.List<ReportFilterTO>>> {

    private static final String OPERATION_NAME = "reportFilters";

    public ReportFiltersQueryResponse() {
    }

    public java.util.List<ReportFilterTO> reportFilters() {
        Map<String, java.util.List<ReportFilterTO>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
