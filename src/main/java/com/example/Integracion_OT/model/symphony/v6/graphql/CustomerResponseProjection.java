package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Customer
 */

public class CustomerResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CustomerResponseProjection() {
    }

    public CustomerResponseProjection all$() {
        return all$(3);
    }

    public CustomerResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.externalId();
        this.typename();
        return this;
    }

    public CustomerResponseProjection id() {
        return id(null);
    }

    public CustomerResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CustomerResponseProjection name() {
        return name(null);
    }

    public CustomerResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public CustomerResponseProjection externalId() {
        return externalId(null);
    }

    public CustomerResponseProjection externalId(String alias) {
        fields.add(new GraphQLResponseField("externalId").alias(alias));
        return this;
    }

    public CustomerResponseProjection typename() {
        return typename(null);
    }

    public CustomerResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
