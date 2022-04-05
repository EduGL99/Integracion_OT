package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which kpi's connections can be ordered.
 */

public enum KpiOrderFieldTO {

    /**
     * Order kpi's by name.
     */
    NAME("NAME"),
    /**
     * Order kpi's by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order kpi's by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    KpiOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
