package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum ActivityFieldTO {

    STATUS("STATUS"),
    PRIORITY("PRIORITY"),
    ASSIGNEE("ASSIGNEE"),
    CREATION_DATE("CREATION_DATE"),
    OWNER("OWNER"),
    NAME("NAME"),
    DESCRIPTION("DESCRIPTION"),
    CLOCK_IN("CLOCK_IN"),
    CLOCK_OUT("CLOCK_OUT");

    private final String graphqlName;

    ActivityFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
