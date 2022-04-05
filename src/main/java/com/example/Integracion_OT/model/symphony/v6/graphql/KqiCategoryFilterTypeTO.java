package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum KqiCategoryFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    KqiCategoryFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
