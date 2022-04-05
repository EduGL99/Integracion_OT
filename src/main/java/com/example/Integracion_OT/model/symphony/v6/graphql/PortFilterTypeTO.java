package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * what filters should we apply on ports
 */

public enum PortFilterTypeTO {

    PORT_DEF("PORT_DEF"),
    PORT_INST_HAS_LINK("PORT_INST_HAS_LINK"),
    PORT_INST_EQUIPMENT("PORT_INST_EQUIPMENT"),
    LOCATION_INST("LOCATION_INST"),
    LOCATION_INST_EXTERNAL_ID("LOCATION_INST_EXTERNAL_ID"),
    PROPERTY("PROPERTY"),
    SERVICE_INST("SERVICE_INST");

    private final String graphqlName;

    PortFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
