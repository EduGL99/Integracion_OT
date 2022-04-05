package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which alarmStatus connections can be ordered.
 */

public enum AlarmStatusOrderFieldTO {

    /**
     * Order alarmStatus by name.
     */
    NAME("NAME"),
    /**
     * Order alarmStatus by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order alarmStatus by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    AlarmStatusOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
