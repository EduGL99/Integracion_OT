package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class EditReportFilterMutationResponse extends GraphQLResult<Map<String, ReportFilterTO>> {

    private static final String OPERATION_NAME = "editReportFilter";

    public EditReportFilterMutationResponse() {
    }

    public ReportFilterTO editReportFilter() {
        Map<String, ReportFilterTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
