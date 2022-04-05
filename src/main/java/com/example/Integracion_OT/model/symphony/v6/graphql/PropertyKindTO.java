package com.example.Integracion_OT.model.symphony.v6.graphql;


import com.fasterxml.jackson.annotation.JsonProperty;

public enum PropertyKindTO {
    @JsonProperty("string")
    string("string"),
    @JsonProperty("int")
    Int("int"),
    @JsonProperty("bool")
    bool("bool"),
    @JsonProperty("float")
    Float("float"),
    @JsonProperty("date")
    date("date"),
    @JsonProperty("enum")
    Enum("enum"),
    @JsonProperty("range")
    range("range"),
    @JsonProperty("email")
    email("email"),
    @JsonProperty("gps_location")
    gps_location("gps_location"),
    @JsonProperty("datetime_local")
    datetime_local("datetime_local"),
    @JsonProperty("node")
    node("node");

    private final String graphqlName;

    PropertyKindTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    public String getValue() {
        return graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

    public static PropertyKindTO fromValue(String text) {
        for (PropertyKindTO b : PropertyKindTO.values()) {
            if (String.valueOf(b.graphqlName).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
