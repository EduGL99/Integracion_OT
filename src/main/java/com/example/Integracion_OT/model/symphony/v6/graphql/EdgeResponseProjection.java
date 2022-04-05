package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Edge
 */

public class EdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EdgeResponseProjection() {
    }

    public EdgeResponseProjection all$() {
        return all$(3);
    }

    public EdgeResponseProjection all$(int maxDepth) {
        this.name();
        this.type();
        this.ids();
        this.typename();
        return this;
    }

    public EdgeResponseProjection name() {
        return name(null);
    }

    public EdgeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public EdgeResponseProjection type() {
        return type(null);
    }

    public EdgeResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public EdgeResponseProjection ids() {
        return ids(null);
    }

    public EdgeResponseProjection ids(String alias) {
        fields.add(new GraphQLResponseField("ids").alias(alias));
        return this;
    }

    public EdgeResponseProjection typename() {
        return typename(null);
    }

    public EdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
