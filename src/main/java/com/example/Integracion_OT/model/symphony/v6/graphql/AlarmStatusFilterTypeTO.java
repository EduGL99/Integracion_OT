package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum AlarmStatusFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    AlarmStatusFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
