package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class SurveysQueryResponse extends GraphQLResult<Map<String, java.util.List<SurveyTO>>> {

    private static final String OPERATION_NAME = "surveys";

    public SurveysQueryResponse() {
    }

    public java.util.List<SurveyTO> surveys() {
        Map<String, java.util.List<SurveyTO>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
