package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which network types connections can be ordered.
 */

public enum NetworkTypeOrderFieldTO {

    /**
     * Order network types by name.
     */
    NAME("NAME"),
    /**
     * Order network types by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order network types by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    NetworkTypeOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
