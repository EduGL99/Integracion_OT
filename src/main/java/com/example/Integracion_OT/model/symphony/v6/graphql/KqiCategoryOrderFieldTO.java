package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which kqi category connections can be ordered.
 */

public enum KqiCategoryOrderFieldTO {

    /**
     * Order kqi category by name.
     */
    NAME("NAME"),
    /**
     * Order kqi category by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order kqi category by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    KqiCategoryOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
