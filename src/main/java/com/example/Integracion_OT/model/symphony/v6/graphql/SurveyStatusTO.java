package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum SurveyStatusTO {

    PLANNED("PLANNED"),
    INPROGRESS("INPROGRESS"),
    COMPLETED("COMPLETED");

    private final String graphqlName;

    SurveyStatusTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
