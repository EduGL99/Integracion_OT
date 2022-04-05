package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KqiPerspective
 */

public class KqiPerspectiveResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KqiPerspectiveResponseProjection() {
    }

    public KqiPerspectiveResponseProjection all$() {
        return all$(3);
    }

    public KqiPerspectiveResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("KqiPerspectiveResponseProjection.KqiResponseProjection.kqi", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiPerspectiveResponseProjection.KqiResponseProjection.kqi", projectionDepthOnFields.getOrDefault("KqiPerspectiveResponseProjection.KqiResponseProjection.kqi", 0) + 1);
            this.kqi(new KqiResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiPerspectiveResponseProjection.KqiResponseProjection.kqi", 0)));
        }
        this.typename();
        return this;
    }

    public KqiPerspectiveResponseProjection id() {
        return id(null);
    }

    public KqiPerspectiveResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public KqiPerspectiveResponseProjection name() {
        return name(null);
    }

    public KqiPerspectiveResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public KqiPerspectiveResponseProjection kqi(KqiResponseProjection subProjection) {
        return kqi(null, subProjection);
    }

    public KqiPerspectiveResponseProjection kqi(String alias, KqiResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("kqi").alias(alias).projection(subProjection));
        return this;
    }

    public KqiPerspectiveResponseProjection typename() {
        return typename(null);
    }

    public KqiPerspectiveResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
