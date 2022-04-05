package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * what filters should we apply on users
 */

public enum UserFilterTypeTO {

    USER_NAME("USER_NAME"),
    USER_STATUS("USER_STATUS"),
    USER_ORGANIZATION("USER_ORGANIZATION");

    private final String graphqlName;

    UserFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
