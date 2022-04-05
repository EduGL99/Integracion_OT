package com.example.Integracion_OT.model.symphony.v6.graphql;


import com.fasterxml.jackson.annotation.JsonProperty;

public enum CheckListItemTypeTO {


    @JsonProperty("simple")
    simple("simple"),
    @JsonProperty("string")
    string("string"),
    @JsonProperty("enum")
    Enum("enum"),
    @JsonProperty("files")
    files("files"),
    @JsonProperty("yes_no")
    yes_no("yes_no"),
    @JsonProperty("cell_scan")
    cell_scan("cell_scan"),
    @JsonProperty("wifi_scan")
    wifi_scan("wifi_scan");

    private final String graphqlName;

    CheckListItemTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

    public static CheckListItemTypeTO fromValue(String text) {
        for (CheckListItemTypeTO b : CheckListItemTypeTO.values()) {
            if (String.valueOf(b.graphqlName).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
