package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KqiTarget
 */

public class KqiTargetResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KqiTargetResponseProjection() {
    }

    public KqiTargetResponseProjection all$() {
        return all$(3);
    }

    public KqiTargetResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.impact();
        this.period();
        this.allowedVariation();
        this.initTime();
        this.endTime();
        this.status();
        if (projectionDepthOnFields.getOrDefault("KqiTargetResponseProjection.KqiResponseProjection.kqi", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiTargetResponseProjection.KqiResponseProjection.kqi", projectionDepthOnFields.getOrDefault("KqiTargetResponseProjection.KqiResponseProjection.kqi", 0) + 1);
            this.kqi(new KqiResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiTargetResponseProjection.KqiResponseProjection.kqi", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("KqiTargetResponseProjection.KqiComparatorResponseProjection.kqiComparator", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiTargetResponseProjection.KqiComparatorResponseProjection.kqiComparator", projectionDepthOnFields.getOrDefault("KqiTargetResponseProjection.KqiComparatorResponseProjection.kqiComparator", 0) + 1);
            this.kqiComparator(new KqiComparatorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiTargetResponseProjection.KqiComparatorResponseProjection.kqiComparator", 0)));
        }
        this.typename();
        return this;
    }

    public KqiTargetResponseProjection id() {
        return id(null);
    }

    public KqiTargetResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public KqiTargetResponseProjection name() {
        return name(null);
    }

    public KqiTargetResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public KqiTargetResponseProjection impact() {
        return impact(null);
    }

    public KqiTargetResponseProjection impact(String alias) {
        fields.add(new GraphQLResponseField("impact").alias(alias));
        return this;
    }

    public KqiTargetResponseProjection period() {
        return period(null);
    }

    public KqiTargetResponseProjection period(String alias) {
        fields.add(new GraphQLResponseField("period").alias(alias));
        return this;
    }

    public KqiTargetResponseProjection allowedVariation() {
        return allowedVariation(null);
    }

    public KqiTargetResponseProjection allowedVariation(String alias) {
        fields.add(new GraphQLResponseField("allowedVariation").alias(alias));
        return this;
    }

    public KqiTargetResponseProjection initTime() {
        return initTime(null);
    }

    public KqiTargetResponseProjection initTime(String alias) {
        fields.add(new GraphQLResponseField("initTime").alias(alias));
        return this;
    }

    public KqiTargetResponseProjection endTime() {
        return endTime(null);
    }

    public KqiTargetResponseProjection endTime(String alias) {
        fields.add(new GraphQLResponseField("endTime").alias(alias));
        return this;
    }

    public KqiTargetResponseProjection status() {
        return status(null);
    }

    public KqiTargetResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public KqiTargetResponseProjection kqi(KqiResponseProjection subProjection) {
        return kqi(null, subProjection);
    }

    public KqiTargetResponseProjection kqi(String alias, KqiResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("kqi").alias(alias).projection(subProjection));
        return this;
    }

    public KqiTargetResponseProjection kqiComparator(KqiComparatorResponseProjection subProjection) {
        return kqiComparator(null, subProjection);
    }

    public KqiTargetResponseProjection kqiComparator(String alias, KqiComparatorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("kqiComparator").alias(alias).projection(subProjection));
        return this;
    }

    public KqiTargetResponseProjection typename() {
        return typename(null);
    }

    public KqiTargetResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
