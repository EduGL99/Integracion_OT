package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which vendors connections can be ordered.
 */

public enum VendorOrderFieldTO {

    /**
     * Order vendors by name.
     */
    NAME("NAME"),
    /**
     * Order vendors by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order vendors by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    VendorOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
