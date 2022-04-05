package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum DistanceUnitTO {

    KILOMETER("KILOMETER"),
    MILE("MILE");

    private final String graphqlName;

    DistanceUnitTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
