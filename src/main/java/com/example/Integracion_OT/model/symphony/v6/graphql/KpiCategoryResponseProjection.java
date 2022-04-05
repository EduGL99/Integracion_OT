package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KpiCategory
 */

public class KpiCategoryResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KpiCategoryResponseProjection() {
    }

    public KpiCategoryResponseProjection all$() {
        return all$(3);
    }

    public KpiCategoryResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.typename();
        return this;
    }

    public KpiCategoryResponseProjection id() {
        return id(null);
    }

    public KpiCategoryResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public KpiCategoryResponseProjection name() {
        return name(null);
    }

    public KpiCategoryResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public KpiCategoryResponseProjection typename() {
        return typename(null);
    }

    public KpiCategoryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
