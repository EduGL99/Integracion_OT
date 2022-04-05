package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

/**
 * Parametrized input for field activities in type WorkOrder
 */

public class WorkOrderActivitiesParametrizedInput implements GraphQLParametrizedInput {

    private ActivityFilterInputTO filter;

    public WorkOrderActivitiesParametrizedInput() {
    }

    public WorkOrderActivitiesParametrizedInput(ActivityFilterInputTO filter) {
        this.filter = filter;
    }

    public WorkOrderActivitiesParametrizedInput filter(ActivityFilterInputTO filter) {
        this.filter = filter;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (filter != null) {
            joiner.add("filter: " + GraphQLRequestSerializer.getEntry(filter));
        }
        return joiner.toString();
    }

}
