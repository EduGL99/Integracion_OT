package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which kpiCategoriess connections can be ordered.
 */

public enum KpiCategoryOrderFieldTO {

    /**
     * Order kpiCategoriess by name.
     */
    NAME("NAME"),
    /**
     * Order kpiCategoriess by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order kpiCategoriess by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    KpiCategoryOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
