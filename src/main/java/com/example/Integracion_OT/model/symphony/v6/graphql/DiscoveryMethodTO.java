package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum DiscoveryMethodTO {

    MANUAL("MANUAL"),
    INVENTORY("INVENTORY");

    private final String graphqlName;

    DiscoveryMethodTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
