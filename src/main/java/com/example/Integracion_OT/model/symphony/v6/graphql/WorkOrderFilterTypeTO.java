package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * what type of work order we filter about
 */

public enum WorkOrderFilterTypeTO {

    WORK_ORDER_NAME("WORK_ORDER_NAME"),
    WORK_ORDER_STATUS("WORK_ORDER_STATUS"),
    WORK_ORDER_OWNED_BY("WORK_ORDER_OWNED_BY"),
    WORK_ORDER_TYPE("WORK_ORDER_TYPE"),
    WORK_ORDER_CREATION_DATE("WORK_ORDER_CREATION_DATE"),
    WORK_ORDER_CLOSE_DATE("WORK_ORDER_CLOSE_DATE"),
    WORK_ORDER_ASSIGNED_TO("WORK_ORDER_ASSIGNED_TO"),
    WORK_ORDER_LOCATION_INST("WORK_ORDER_LOCATION_INST"),
    WORK_ORDER_PRIORITY("WORK_ORDER_PRIORITY"),
    LOCATION_INST("LOCATION_INST"),
    LOCATION_INST_EXTERNAL_ID("LOCATION_INST_EXTERNAL_ID"),
    WORK_ORDER_ORGANIZATION("WORK_ORDER_ORGANIZATION");

    private final String graphqlName;

    WorkOrderFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
