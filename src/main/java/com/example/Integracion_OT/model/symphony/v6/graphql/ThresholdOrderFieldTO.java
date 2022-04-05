package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which Threshold connections can be ordered.
 */

public enum ThresholdOrderFieldTO {

    /**
     * Order Threshold by name.
     */
    NAME("NAME"),
    /**
     * Order Threshold by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order Threshold by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    ThresholdOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
