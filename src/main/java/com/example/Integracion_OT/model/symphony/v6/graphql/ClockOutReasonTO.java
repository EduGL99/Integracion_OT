package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum ClockOutReasonTO {

    PAUSE("PAUSE"),
    SUBMIT("SUBMIT"),
    SUBMIT_INCOMPLETE("SUBMIT_INCOMPLETE"),
    BLOCKED("BLOCKED");

    private final String graphqlName;

    ClockOutReasonTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
