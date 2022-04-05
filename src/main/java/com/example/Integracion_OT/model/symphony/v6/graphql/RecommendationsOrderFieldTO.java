package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which Recommendations connections can be ordered.
 */

public enum RecommendationsOrderFieldTO {

    /**
     * Order Recommendations by name.
     */
    NAME("NAME"),
    /**
     * Order Recommendations by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order Recommendations by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    RecommendationsOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
