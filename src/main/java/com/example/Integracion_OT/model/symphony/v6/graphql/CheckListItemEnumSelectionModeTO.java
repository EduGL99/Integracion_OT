package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum CheckListItemEnumSelectionModeTO {

    single("single"),
    multiple("multiple");

    private final String graphqlName;

    CheckListItemEnumSelectionModeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
