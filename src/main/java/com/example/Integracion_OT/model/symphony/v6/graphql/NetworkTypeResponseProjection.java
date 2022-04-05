package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for NetworkType
 */

public class NetworkTypeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public NetworkTypeResponseProjection() {
    }

    public NetworkTypeResponseProjection all$() {
        return all$(3);
    }

    public NetworkTypeResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.typename();
        return this;
    }

    public NetworkTypeResponseProjection id() {
        return id(null);
    }

    public NetworkTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public NetworkTypeResponseProjection name() {
        return name(null);
    }

    public NetworkTypeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public NetworkTypeResponseProjection typename() {
        return typename(null);
    }

    public NetworkTypeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
