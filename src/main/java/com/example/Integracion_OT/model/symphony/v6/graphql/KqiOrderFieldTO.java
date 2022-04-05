package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which Kqi connections can be ordered.
 */

public enum KqiOrderFieldTO {

    /**
     * Order Kqi by name.
     */
    NAME("NAME"),
    /**
     * Order Kqi by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order Kqi by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    KqiOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
