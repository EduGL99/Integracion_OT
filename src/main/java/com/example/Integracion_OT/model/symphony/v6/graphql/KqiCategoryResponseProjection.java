package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KqiCategory
 */

public class KqiCategoryResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KqiCategoryResponseProjection() {
    }

    public KqiCategoryResponseProjection all$() {
        return all$(3);
    }

    public KqiCategoryResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("KqiCategoryResponseProjection.KqiResponseProjection.kqi", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiCategoryResponseProjection.KqiResponseProjection.kqi", projectionDepthOnFields.getOrDefault("KqiCategoryResponseProjection.KqiResponseProjection.kqi", 0) + 1);
            this.kqi(new KqiResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiCategoryResponseProjection.KqiResponseProjection.kqi", 0)));
        }
        this.typename();
        return this;
    }

    public KqiCategoryResponseProjection id() {
        return id(null);
    }

    public KqiCategoryResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public KqiCategoryResponseProjection name() {
        return name(null);
    }

    public KqiCategoryResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public KqiCategoryResponseProjection kqi(KqiResponseProjection subProjection) {
        return kqi(null, subProjection);
    }

    public KqiCategoryResponseProjection kqi(String alias, KqiResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("kqi").alias(alias).projection(subProjection));
        return this;
    }

    public KqiCategoryResponseProjection typename() {
        return typename(null);
    }

    public KqiCategoryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
