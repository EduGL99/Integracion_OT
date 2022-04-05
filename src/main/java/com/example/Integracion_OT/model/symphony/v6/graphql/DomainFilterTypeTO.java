package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum DomainFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    DomainFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
