package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum UserRoleTO {

    USER("USER"),
    ADMIN("ADMIN"),
    OWNER("OWNER");

    private final String graphqlName;

    UserRoleTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
