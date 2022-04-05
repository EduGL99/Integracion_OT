package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum RecommendationsFilterTypeTO {

    EXTERNALID("EXTERNALID"),
    RESOURCE("RESOURCE"),
    ALARMTYPE("ALARMTYPE"),
    SHORTDESCRIPTION("SHORTDESCRIPTION"),
    LONGDESCRIPTION("LONGDESCRIPTION"),
    COMMAND("COMMAND"),
    PRIORITY("PRIORITY"),
    STATUS("STATUS"),
    USED("USED"),
    RUNBOOK("RUNBOOK"),
    RECOMMENDATIONSSOURCE("RECOMMENDATIONSSOURCE"),
    RECOMMENDATIONSCATEGORY("RECOMMENDATIONSCATEGORY"),
    USERCREATE("USERCREATE"),
    USERAPPROVE("USERAPPROVE"),
    VENDORRECOMMENDATIONS("VENDORRECOMMENDATIONS");

    private final String graphqlName;

    RecommendationsFilterTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
