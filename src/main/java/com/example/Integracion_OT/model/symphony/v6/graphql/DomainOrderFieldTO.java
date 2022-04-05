package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which domains connections can be ordered.
 */

public enum DomainOrderFieldTO {

    /**
     * Order domains by name.
     */
    NAME("NAME"),
    /**
     * Order domains by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order domains by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    DomainOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
