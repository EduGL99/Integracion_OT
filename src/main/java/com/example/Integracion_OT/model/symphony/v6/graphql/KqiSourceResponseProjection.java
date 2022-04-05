package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KqiSource
 */

public class KqiSourceResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KqiSourceResponseProjection() {
    }

    public KqiSourceResponseProjection all$() {
        return all$(3);
    }

    public KqiSourceResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("KqiSourceResponseProjection.KqiResponseProjection.kqi", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiSourceResponseProjection.KqiResponseProjection.kqi", projectionDepthOnFields.getOrDefault("KqiSourceResponseProjection.KqiResponseProjection.kqi", 0) + 1);
            this.kqi(new KqiResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiSourceResponseProjection.KqiResponseProjection.kqi", 0)));
        }
        this.typename();
        return this;
    }

    public KqiSourceResponseProjection id() {
        return id(null);
    }

    public KqiSourceResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public KqiSourceResponseProjection name() {
        return name(null);
    }

    public KqiSourceResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public KqiSourceResponseProjection kqi(KqiResponseProjection subProjection) {
        return kqi(null, subProjection);
    }

    public KqiSourceResponseProjection kqi(String alias, KqiResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("kqi").alias(alias).projection(subProjection));
        return this;
    }

    public KqiSourceResponseProjection typename() {
        return typename(null);
    }

    public KqiSourceResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
