package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which techs connections can be ordered.
 */

public enum TechOrderFieldTO {

    /**
     * Order techs by name.
     */
    NAME("NAME"),
    /**
     * Order techs by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order techs by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    TechOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
