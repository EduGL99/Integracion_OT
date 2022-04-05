package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which AlarmFilter connections can be ordered.
 */

public enum AlarmFilterOrderFieldTO {

    /**
     * Order AlarmFilter by name.
     */
    NAME("NAME"),
    /**
     * Order AlarmFilter by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order AlarmFilter by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    AlarmFilterOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
