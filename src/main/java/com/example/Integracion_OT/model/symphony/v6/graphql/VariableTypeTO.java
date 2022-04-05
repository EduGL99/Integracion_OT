package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum VariableTypeTO {

    STRING("STRING"),
    INT("INT"),
    DATE("DATE"),
    WORK_ORDER("WORK_ORDER"),
    WORK_ORDER_TYPE("WORK_ORDER_TYPE"),
    LOCATION("LOCATION"),
    PROJECT("PROJECT"),
    USER("USER");

    private final String graphqlName;

    VariableTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
