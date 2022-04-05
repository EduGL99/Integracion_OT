package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which Organization connections can be ordered.
 */

public enum OrganizationOrderFieldTO {

    /**
     * Order Organization by name.
     */
    NAME("NAME"),
    /**
     * Order Organization by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order Organization by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    OrganizationOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
