package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class MarkSiteSurveyNeededMutationResponse extends GraphQLResult<Map<String, LocationTO>> {

    private static final String OPERATION_NAME = "markSiteSurveyNeeded";

    public MarkSiteSurveyNeededMutationResponse() {
    }

    public LocationTO markSiteSurveyNeeded() {
        Map<String, LocationTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
