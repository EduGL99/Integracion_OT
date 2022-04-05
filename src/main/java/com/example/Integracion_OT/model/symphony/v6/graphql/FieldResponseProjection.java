package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Field
 */

public class FieldResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FieldResponseProjection() {
    }

    public FieldResponseProjection all$() {
        return all$(3);
    }

    public FieldResponseProjection all$(int maxDepth) {
        this.name();
        this.value();
        this.type();
        this.typename();
        return this;
    }

    public FieldResponseProjection name() {
        return name(null);
    }

    public FieldResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public FieldResponseProjection value() {
        return value(null);
    }

    public FieldResponseProjection value(String alias) {
        fields.add(new GraphQLResponseField("value").alias(alias));
        return this;
    }

    public FieldResponseProjection type() {
        return type(null);
    }

    public FieldResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public FieldResponseProjection typename() {
        return typename(null);
    }

    public FieldResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
