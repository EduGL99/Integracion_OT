package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

/**
 * Parametrized input for field locations in type LocationType
 */

public class LocationTypeLocationsParametrizedInput implements GraphQLParametrizedInput {

    private Boolean enforceHasLatLong = false;

    public LocationTypeLocationsParametrizedInput() {
    }

    public LocationTypeLocationsParametrizedInput(Boolean enforceHasLatLong) {
        this.enforceHasLatLong = enforceHasLatLong;
    }

    public LocationTypeLocationsParametrizedInput enforceHasLatLong(Boolean enforceHasLatLong) {
        this.enforceHasLatLong = enforceHasLatLong;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (enforceHasLatLong != null) {
            joiner.add("enforceHasLatLong: " + GraphQLRequestSerializer.getEntry(enforceHasLatLong));
        }
        return joiner.toString();
    }

}
