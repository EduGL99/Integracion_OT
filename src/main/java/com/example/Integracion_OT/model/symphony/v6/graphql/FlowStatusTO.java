package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum FlowStatusTO {

    PUBLISHED("PUBLISHED"),
    UNPUBLISHED("UNPUBLISHED"),
    ARCHIVED("ARCHIVED");

    private final String graphqlName;

    FlowStatusTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
