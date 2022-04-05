package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which comparator connections can be ordered.
 */

public enum ComparatorOrderFieldTO {

    /**
     * Order comparator by name.
     */
    NAME("NAME"),
    /**
     * Order comparator by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order comparator by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    ComparatorOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
