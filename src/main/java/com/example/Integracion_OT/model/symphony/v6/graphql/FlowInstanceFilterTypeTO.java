package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * what filters should we apply on flow instances
 */

public enum FlowInstanceFilterTypeTO {

    FLOW_INSTANCE_STATUS("FLOW_INSTANCE_STATUS"),
    FLOW_INSTANCE_TYPE("FLOW_INSTANCE_TYPE"),
    FLOW_INSTANCE_BSS_CODE("FLOW_INSTANCE_BSS_CODE"),
    FLOW_INSTANCE_SERVICE_INSTANCE_CODE("FLOW_INSTANCE_SERVICE_INSTANCE_CODE");

    private final String graphqlName;

    FlowInstanceFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
