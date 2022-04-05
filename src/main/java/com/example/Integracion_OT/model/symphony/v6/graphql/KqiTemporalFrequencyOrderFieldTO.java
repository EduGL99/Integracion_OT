package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which kqi temporal frequency connections can be ordered.
 */

public enum KqiTemporalFrequencyOrderFieldTO {

    /**
     * Order kqi temporal frequency by name.
     */
    NAME("NAME"),
    /**
     * Order kqi temporal frequency by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order kqi temporal frequency by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    KqiTemporalFrequencyOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
