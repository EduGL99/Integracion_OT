package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which equipment connections can be ordered.
 */

public enum EquipmentOrderFieldTO {

    /**
     * Order equipment by name.
     */
    NAME("NAME"),
    /**
     * Order equipment by future state.
     */
    FUTURE_STATE("FUTURE_STATE");

    private final String graphqlName;

    EquipmentOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
