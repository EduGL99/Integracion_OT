package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum KqiSourceFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    KqiSourceFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
