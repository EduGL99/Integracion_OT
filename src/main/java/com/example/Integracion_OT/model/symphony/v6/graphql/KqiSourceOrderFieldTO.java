package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which kqi source connections can be ordered.
 */

public enum KqiSourceOrderFieldTO {

    /**
     * Order kqi source by name.
     */
    NAME("NAME"),
    /**
     * Order kqi source by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order kqi source by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    KqiSourceOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
