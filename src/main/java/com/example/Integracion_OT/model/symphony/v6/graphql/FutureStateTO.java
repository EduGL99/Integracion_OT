package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * FutureState of an equipment.
 */

public enum FutureStateTO {

    INSTALL("INSTALL"),
    REMOVE("REMOVE");

    private final String graphqlName;

    FutureStateTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
