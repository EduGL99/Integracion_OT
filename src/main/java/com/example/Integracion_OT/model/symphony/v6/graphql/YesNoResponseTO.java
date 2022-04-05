package com.example.Integracion_OT.model.symphony.v6.graphql;


import com.fasterxml.jackson.annotation.JsonProperty;

public enum YesNoResponseTO {
    @JsonProperty("YES")
    YES("YES"),
    @JsonProperty("NO")
    NO("NO");

    private final String graphqlName;

    YesNoResponseTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

    public static YesNoResponseTO fromValue(String text) {
        for (YesNoResponseTO b : YesNoResponseTO.values()) {
            if (String.valueOf(b.graphqlName).equals(text)) {
                return b;
            }
        }
        return null;
    }

}
