package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum SurveyQuestionTypeTO {

    BOOL("BOOL"),
    EMAIL("EMAIL"),
    COORDS("COORDS"),
    PHONE("PHONE"),
    TEXT("TEXT"),
    TEXTAREA("TEXTAREA"),
    PHOTO("PHOTO"),
    WIFI("WIFI"),
    CELLULAR("CELLULAR"),
    FLOAT("FLOAT"),
    INTEGER("INTEGER"),
    DATE("DATE");

    private final String graphqlName;

    SurveyQuestionTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
