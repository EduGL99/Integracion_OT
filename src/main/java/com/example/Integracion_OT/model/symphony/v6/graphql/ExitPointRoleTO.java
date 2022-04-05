package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum ExitPointRoleTO {

    DEFAULT("DEFAULT"),
    DECISION("DECISION");

    private final String graphqlName;

    ExitPointRoleTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
