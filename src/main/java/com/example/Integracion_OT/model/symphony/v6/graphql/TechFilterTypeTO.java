package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum TechFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    TechFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
