package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum RuleTypeFilterTypeTO {

    NAME("NAME");

    private final String graphqlName;

    RuleTypeFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
