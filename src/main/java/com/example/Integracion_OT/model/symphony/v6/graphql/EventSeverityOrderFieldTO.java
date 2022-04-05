package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which eventSeverities connections can be ordered.
 */

public enum EventSeverityOrderFieldTO {

    /**
     * Order eventSeverities by name.
     */
    NAME("NAME"),
    /**
     * Order eventSeverities by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order eventSeverities by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    EventSeverityOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
