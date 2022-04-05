package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which kqi perspective connections can be ordered.
 */

public enum KqiPerspectiveOrderFieldTO {

    /**
     * Order kqi perspective by name.
     */
    NAME("NAME"),
    /**
     * Order kqi perspective by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order kqi perspective by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    KqiPerspectiveOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
