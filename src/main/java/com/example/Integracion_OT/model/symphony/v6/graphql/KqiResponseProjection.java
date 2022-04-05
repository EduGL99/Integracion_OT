package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Kqi
 */

public class KqiResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KqiResponseProjection() {
    }

    public KqiResponseProjection all$() {
        return all$(3);
    }

    public KqiResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        this.formula();
        this.startDateTime();
        this.endDateTime();
        if (projectionDepthOnFields.getOrDefault("KqiResponseProjection.KqiCategoryResponseProjection.kqiCategory", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiResponseProjection.KqiCategoryResponseProjection.kqiCategory", projectionDepthOnFields.getOrDefault("KqiResponseProjection.KqiCategoryResponseProjection.kqiCategory", 0) + 1);
            this.kqiCategory(new KqiCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiResponseProjection.KqiCategoryResponseProjection.kqiCategory", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("KqiResponseProjection.KqiPerspectiveResponseProjection.kqiPerspective", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiResponseProjection.KqiPerspectiveResponseProjection.kqiPerspective", projectionDepthOnFields.getOrDefault("KqiResponseProjection.KqiPerspectiveResponseProjection.kqiPerspective", 0) + 1);
            this.kqiPerspective(new KqiPerspectiveResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiResponseProjection.KqiPerspectiveResponseProjection.kqiPerspective", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("KqiResponseProjection.KqiSourceResponseProjection.kqiSource", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiResponseProjection.KqiSourceResponseProjection.kqiSource", projectionDepthOnFields.getOrDefault("KqiResponseProjection.KqiSourceResponseProjection.kqiSource", 0) + 1);
            this.kqiSource(new KqiSourceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiResponseProjection.KqiSourceResponseProjection.kqiSource", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("KqiResponseProjection.KqiTemporalFrequencyResponseProjection.kqiTemporalFrequency", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiResponseProjection.KqiTemporalFrequencyResponseProjection.kqiTemporalFrequency", projectionDepthOnFields.getOrDefault("KqiResponseProjection.KqiTemporalFrequencyResponseProjection.kqiTemporalFrequency", 0) + 1);
            this.kqiTemporalFrequency(new KqiTemporalFrequencyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiResponseProjection.KqiTemporalFrequencyResponseProjection.kqiTemporalFrequency", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("KqiResponseProjection.KqiTargetResponseProjection.kqiTarget", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiResponseProjection.KqiTargetResponseProjection.kqiTarget", projectionDepthOnFields.getOrDefault("KqiResponseProjection.KqiTargetResponseProjection.kqiTarget", 0) + 1);
            this.kqiTarget(new KqiTargetResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiResponseProjection.KqiTargetResponseProjection.kqiTarget", 0)));
        }
        this.typename();
        return this;
    }

    public KqiResponseProjection id() {
        return id(null);
    }

    public KqiResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public KqiResponseProjection name() {
        return name(null);
    }

    public KqiResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public KqiResponseProjection description() {
        return description(null);
    }

    public KqiResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public KqiResponseProjection formula() {
        return formula(null);
    }

    public KqiResponseProjection formula(String alias) {
        fields.add(new GraphQLResponseField("formula").alias(alias));
        return this;
    }

    public KqiResponseProjection startDateTime() {
        return startDateTime(null);
    }

    public KqiResponseProjection startDateTime(String alias) {
        fields.add(new GraphQLResponseField("startDateTime").alias(alias));
        return this;
    }

    public KqiResponseProjection endDateTime() {
        return endDateTime(null);
    }

    public KqiResponseProjection endDateTime(String alias) {
        fields.add(new GraphQLResponseField("endDateTime").alias(alias));
        return this;
    }

    public KqiResponseProjection kqiCategory(KqiCategoryResponseProjection subProjection) {
        return kqiCategory(null, subProjection);
    }

    public KqiResponseProjection kqiCategory(String alias, KqiCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("kqiCategory").alias(alias).projection(subProjection));
        return this;
    }

    public KqiResponseProjection kqiPerspective(KqiPerspectiveResponseProjection subProjection) {
        return kqiPerspective(null, subProjection);
    }

    public KqiResponseProjection kqiPerspective(String alias, KqiPerspectiveResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("kqiPerspective").alias(alias).projection(subProjection));
        return this;
    }

    public KqiResponseProjection kqiSource(KqiSourceResponseProjection subProjection) {
        return kqiSource(null, subProjection);
    }

    public KqiResponseProjection kqiSource(String alias, KqiSourceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("kqiSource").alias(alias).projection(subProjection));
        return this;
    }

    public KqiResponseProjection kqiTemporalFrequency(KqiTemporalFrequencyResponseProjection subProjection) {
        return kqiTemporalFrequency(null, subProjection);
    }

    public KqiResponseProjection kqiTemporalFrequency(String alias, KqiTemporalFrequencyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("kqiTemporalFrequency").alias(alias).projection(subProjection));
        return this;
    }

    public KqiResponseProjection kqiTarget(KqiTargetResponseProjection subProjection) {
        return kqiTarget(null, subProjection);
    }

    public KqiResponseProjection kqiTarget(String alias, KqiTargetResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("kqiTarget").alias(alias).projection(subProjection));
        return this;
    }

    public KqiResponseProjection typename() {
        return typename(null);
    }

    public KqiResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
