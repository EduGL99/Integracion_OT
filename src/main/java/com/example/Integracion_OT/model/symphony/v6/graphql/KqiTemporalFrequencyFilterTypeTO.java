package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum KqiTemporalFrequencyFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    KqiTemporalFrequencyFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
