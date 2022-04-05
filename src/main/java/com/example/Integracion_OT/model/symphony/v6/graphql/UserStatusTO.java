package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum UserStatusTO {

    ACTIVE("ACTIVE"),
    DEACTIVATED("DEACTIVATED");

    private final String graphqlName;

    UserStatusTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
