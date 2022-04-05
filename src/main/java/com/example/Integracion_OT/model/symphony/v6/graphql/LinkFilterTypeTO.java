package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * what filters should we apply on links
 */

public enum LinkFilterTypeTO {

    LINK_FUTURE_STATUS("LINK_FUTURE_STATUS"),
    EQUIPMENT_TYPE("EQUIPMENT_TYPE"),
    LOCATION_INST("LOCATION_INST"),
    LOCATION_INST_EXTERNAL_ID("LOCATION_INST_EXTERNAL_ID"),
    PROPERTY("PROPERTY"),
    SERVICE_INST("SERVICE_INST"),
    EQUIPMENT_INST("EQUIPMENT_INST");

    private final String graphqlName;

    LinkFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
