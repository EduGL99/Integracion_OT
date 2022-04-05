package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which kqi target connections can be ordered.
 */

public enum KqiTargetOrderFieldTO {

    /**
     * Order kqi target by name.
     */
    NAME("NAME"),
    /**
     * Order kqi target by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order kqi target by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    KqiTargetOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
