package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which work order connections can be ordered.
 */

public enum WorkOrderOrderFieldTO {

    /**
     * Order work orders by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order work orders by update time.
     */
    UPDATED_AT("UPDATED_AT"),
    /**
     * Order work orders by closure time.
     */
    CLOSED_AT("CLOSED_AT"),
    /**
     * Order work orders by name.
     */
    NAME("NAME");

    private final String graphqlName;

    WorkOrderOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
