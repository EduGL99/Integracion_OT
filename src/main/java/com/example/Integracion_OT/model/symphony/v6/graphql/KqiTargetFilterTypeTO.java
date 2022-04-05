package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum KqiTargetFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    KqiTargetFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
