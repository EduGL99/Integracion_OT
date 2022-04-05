package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddFloorPlanMutationResponse extends GraphQLResult<Map<String, FloorPlanTO>> {

    private static final String OPERATION_NAME = "addFloorPlan";

    public AddFloorPlanMutationResponse() {
    }

    public FloorPlanTO addFloorPlan() {
        Map<String, FloorPlanTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
