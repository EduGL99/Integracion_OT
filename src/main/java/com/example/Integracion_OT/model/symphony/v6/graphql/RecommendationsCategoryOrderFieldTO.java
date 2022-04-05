package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which RecommendationsCategory connections can be ordered.
 */

public enum RecommendationsCategoryOrderFieldTO {

    /**
     * Order RecommendationsCategory by name.
     */
    NAME("NAME"),
    /**
     * Order RecommendationsCategory by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order RecommendationsCategory by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    RecommendationsCategoryOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
