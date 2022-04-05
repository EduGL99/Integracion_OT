package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * what filters should we apply on services
 */

public enum ServiceFilterTypeTO {

    SERVICE_INST_NAME("SERVICE_INST_NAME"),
    SERVICE_STATUS("SERVICE_STATUS"),
    SERVICE_DISCOVERY_METHOD("SERVICE_DISCOVERY_METHOD"),
    SERVICE_TYPE("SERVICE_TYPE"),
    SERVICE_INST_EXTERNAL_ID("SERVICE_INST_EXTERNAL_ID"),
    SERVICE_INST_CUSTOMER_NAME("SERVICE_INST_CUSTOMER_NAME"),
    PROPERTY("PROPERTY"),
    LOCATION_INST("LOCATION_INST"),
    LOCATION_INST_EXTERNAL_ID("LOCATION_INST_EXTERNAL_ID"),
    EQUIPMENT_IN_SERVICE("EQUIPMENT_IN_SERVICE");

    private final String graphqlName;

    ServiceFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
