package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which counterFamilies connections can be ordered.
 */

public enum CounterFamilyOrderFieldTO {

    /**
     * Order counterFamilies by name.
     */
    NAME("NAME"),
    /**
     * Order counterFamilies by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order counterFamilies by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    CounterFamilyOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
