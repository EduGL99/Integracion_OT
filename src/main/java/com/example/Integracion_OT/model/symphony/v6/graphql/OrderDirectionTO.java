package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Possible directions in which to order a list of items when provided an `orderBy` argument.
 */

public enum OrderDirectionTO {

    /**
     * Specifies an ascending order for a given `orderBy` argument.
     */
    ASC("ASC"),
    /**
     * Specifies a descending order for a given `orderBy` argument.
     */
    DESC("DESC");

    private final String graphqlName;

    OrderDirectionTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
