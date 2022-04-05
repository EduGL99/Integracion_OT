package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

/**
 * Parametrized input for field ports in type Equipment
 */

public class EquipmentPortsParametrizedInput implements GraphQLParametrizedInput {

    private Boolean availableOnly = false;

    public EquipmentPortsParametrizedInput() {
    }

    public EquipmentPortsParametrizedInput(Boolean availableOnly) {
        this.availableOnly = availableOnly;
    }

    public EquipmentPortsParametrizedInput availableOnly(Boolean availableOnly) {
        this.availableOnly = availableOnly;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (availableOnly != null) {
            joiner.add("availableOnly: " + GraphQLRequestSerializer.getEntry(availableOnly));
        }
        return joiner.toString();
    }

}
