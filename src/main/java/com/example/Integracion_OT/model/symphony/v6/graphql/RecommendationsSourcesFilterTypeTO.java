package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum RecommendationsSourcesFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    RecommendationsSourcesFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
