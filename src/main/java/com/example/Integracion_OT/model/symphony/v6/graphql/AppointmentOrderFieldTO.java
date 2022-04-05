package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which project connections can be ordered.
 */

public enum AppointmentOrderFieldTO {

    /**
     * Order appoinments by date.
     */
    DATE("DATE"),
    /**
     * Order appoinments by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order appoinments by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    AppointmentOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
