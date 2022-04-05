package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Domain
 */

public class DomainResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public DomainResponseProjection() {
    }

    public DomainResponseProjection all$() {
        return all$(3);
    }

    public DomainResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.typename();
        return this;
    }

    public DomainResponseProjection id() {
        return id(null);
    }

    public DomainResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public DomainResponseProjection name() {
        return name(null);
    }

    public DomainResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public DomainResponseProjection typename() {
        return typename(null);
    }

    public DomainResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
