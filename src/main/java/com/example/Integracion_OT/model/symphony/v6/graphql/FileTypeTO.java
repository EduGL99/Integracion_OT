package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum FileTypeTO {

    IMAGE("IMAGE"),
    FILE("FILE");

    private final String graphqlName;

    FileTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
