package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum CommentEntityTO {

    WORK_ORDER("WORK_ORDER"),
    PROJECT("PROJECT");

    private final String graphqlName;

    CommentEntityTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
