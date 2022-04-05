package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum FlowInstanceStatusTO {

    IN_PROGRESS("IN_PROGRESS"),
    FAILED("FAILED"),
    COMPLETED("COMPLETED"),
    CANCELED("CANCELED");

    private final String graphqlName;

    FlowInstanceStatusTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
