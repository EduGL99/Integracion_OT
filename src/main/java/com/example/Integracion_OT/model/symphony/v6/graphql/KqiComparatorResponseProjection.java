package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KqiComparator
 */

public class KqiComparatorResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KqiComparatorResponseProjection() {
    }

    public KqiComparatorResponseProjection all$() {
        return all$(3);
    }

    public KqiComparatorResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("KqiComparatorResponseProjection.KqiTargetResponseProjection.kqiTargetFk", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiComparatorResponseProjection.KqiTargetResponseProjection.kqiTargetFk", projectionDepthOnFields.getOrDefault("KqiComparatorResponseProjection.KqiTargetResponseProjection.kqiTargetFk", 0) + 1);
            this.kqiTargetFk(new KqiTargetResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiComparatorResponseProjection.KqiTargetResponseProjection.kqiTargetFk", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("KqiComparatorResponseProjection.ComparatorResponseProjection.comparatorFk", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiComparatorResponseProjection.ComparatorResponseProjection.comparatorFk", projectionDepthOnFields.getOrDefault("KqiComparatorResponseProjection.ComparatorResponseProjection.comparatorFk", 0) + 1);
            this.comparatorFk(new ComparatorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiComparatorResponseProjection.ComparatorResponseProjection.comparatorFk", 0)));
        }
        this.number();
        this.comparatorType();
        this.typename();
        return this;
    }

    public KqiComparatorResponseProjection id() {
        return id(null);
    }

    public KqiComparatorResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public KqiComparatorResponseProjection kqiTargetFk(KqiTargetResponseProjection subProjection) {
        return kqiTargetFk(null, subProjection);
    }

    public KqiComparatorResponseProjection kqiTargetFk(String alias, KqiTargetResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("kqiTargetFk").alias(alias).projection(subProjection));
        return this;
    }

    public KqiComparatorResponseProjection comparatorFk(ComparatorResponseProjection subProjection) {
        return comparatorFk(null, subProjection);
    }

    public KqiComparatorResponseProjection comparatorFk(String alias, ComparatorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comparatorFk").alias(alias).projection(subProjection));
        return this;
    }

    public KqiComparatorResponseProjection number() {
        return number(null);
    }

    public KqiComparatorResponseProjection number(String alias) {
        fields.add(new GraphQLResponseField("number").alias(alias));
        return this;
    }

    public KqiComparatorResponseProjection comparatorType() {
        return comparatorType(null);
    }

    public KqiComparatorResponseProjection comparatorType(String alias) {
        fields.add(new GraphQLResponseField("comparatorType").alias(alias));
        return this;
    }

    public KqiComparatorResponseProjection typename() {
        return typename(null);
    }

    public KqiComparatorResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
