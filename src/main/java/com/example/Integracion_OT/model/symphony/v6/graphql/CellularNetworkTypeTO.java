package com.example.Integracion_OT.model.symphony.v6.graphql;


public enum CellularNetworkTypeTO {

    CDMA("CDMA"),
    GSM("GSM"),
    LTE("LTE"),
    WCDMA("WCDMA");

    private final String graphqlName;

    CellularNetworkTypeTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
