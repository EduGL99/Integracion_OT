package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for CounterFamily
 */

public class CounterFamilyResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CounterFamilyResponseProjection() {
    }

    public CounterFamilyResponseProjection all$() {
        return all$(3);
    }

    public CounterFamilyResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.typename();
        return this;
    }

    public CounterFamilyResponseProjection id() {
        return id(null);
    }

    public CounterFamilyResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CounterFamilyResponseProjection name() {
        return name(null);
    }

    public CounterFamilyResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public CounterFamilyResponseProjection typename() {
        return typename(null);
    }

    public CounterFamilyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
