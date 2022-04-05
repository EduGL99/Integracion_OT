package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum FlowNewInstancesPolicyTO {

    ENABLED("ENABLED"),
    DISABLED("DISABLED");

    private final String graphqlName;

    FlowNewInstancesPolicyTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
