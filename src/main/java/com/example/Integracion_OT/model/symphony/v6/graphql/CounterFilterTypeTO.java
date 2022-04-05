package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum CounterFilterTypeTO {

    NAME("NAME"),
    EXTERNALID("EXTERNALID"),
    NETWORKMANAGERSYSTEM("NETWORKMANAGERSYSTEM"),
    COUNTERFAMILY("COUNTERFAMILY"),
    VENDORFK("VENDORFK");

    private final String graphqlName;

    CounterFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
