package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum EntryPointRoleTO {

    DEFAULT("DEFAULT");

    private final String graphqlName;

    EntryPointRoleTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
