package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which RecommendationsSources connections can be ordered.
 */

public enum RecommendationsSourcesOrderFieldTO {

    /**
     * Order RecommendationsSources by name.
     */
    NAME("NAME"),
    /**
     * Order RecommendationsSources by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order RecommendationsSources by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    RecommendationsSourcesOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
