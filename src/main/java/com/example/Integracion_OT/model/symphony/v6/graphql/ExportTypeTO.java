package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum ExportTypeTO {

    EQUIPMENT("EQUIPMENT"),
    LOCATION("LOCATION"),
    PORT("PORT"),
    LINK("LINK"),
    SERVICE("SERVICE"),
    WORK_ORDER("WORK_ORDER");

    private final String graphqlName;

    ExportTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
