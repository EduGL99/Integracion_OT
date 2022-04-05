package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum KqiFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    KqiFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
