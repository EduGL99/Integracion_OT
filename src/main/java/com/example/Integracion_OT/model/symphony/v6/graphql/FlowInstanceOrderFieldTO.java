package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which flow instances connections can be ordered.
 */

public enum FlowInstanceOrderFieldTO {

    /**
     * Order flow instances by start time.
     */
    START_AT("START_AT"),
    /**
     * Order flow instances by end time.
     */
    END_AT("END_AT"),
    /**
     * Order flow instances by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    FlowInstanceOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
