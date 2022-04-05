package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum FormulaFilterTypeTO {

    TEXTFORMULA("TEXTFORMULA"),
    STATUS("STATUS");

    private final String graphqlName;

    FormulaFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
