package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which counters connections can be ordered.
 */

public enum CounterOrderFieldTO {

    /**
     * Order counters by name.
     */
    NAME("NAME"),
    /**
     * Order counters by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order counters by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    CounterOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
