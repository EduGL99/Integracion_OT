package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

/**
 * Parametrized input for field topology in type Location
 */

public class LocationTopologyParametrizedInput implements GraphQLParametrizedInput {

    private int depth = 3;

    public LocationTopologyParametrizedInput() {
    }

    public LocationTopologyParametrizedInput(int depth) {
        this.depth = depth;
    }

    public LocationTopologyParametrizedInput depth(int depth) {
        this.depth = depth;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        joiner.add("depth: " + GraphQLRequestSerializer.getEntry(depth));
        return joiner.toString();
    }

}
