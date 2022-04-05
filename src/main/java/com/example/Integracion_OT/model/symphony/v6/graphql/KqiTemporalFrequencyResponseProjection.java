package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KqiTemporalFrequency
 */

public class KqiTemporalFrequencyResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KqiTemporalFrequencyResponseProjection() {
    }

    public KqiTemporalFrequencyResponseProjection all$() {
        return all$(3);
    }

    public KqiTemporalFrequencyResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("KqiTemporalFrequencyResponseProjection.KqiResponseProjection.kqi", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiTemporalFrequencyResponseProjection.KqiResponseProjection.kqi", projectionDepthOnFields.getOrDefault("KqiTemporalFrequencyResponseProjection.KqiResponseProjection.kqi", 0) + 1);
            this.kqi(new KqiResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiTemporalFrequencyResponseProjection.KqiResponseProjection.kqi", 0)));
        }
        this.typename();
        return this;
    }

    public KqiTemporalFrequencyResponseProjection id() {
        return id(null);
    }

    public KqiTemporalFrequencyResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public KqiTemporalFrequencyResponseProjection name() {
        return name(null);
    }

    public KqiTemporalFrequencyResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public KqiTemporalFrequencyResponseProjection kqi(KqiResponseProjection subProjection) {
        return kqi(null, subProjection);
    }

    public KqiTemporalFrequencyResponseProjection kqi(String alias, KqiResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("kqi").alias(alias).projection(subProjection));
        return this;
    }

    public KqiTemporalFrequencyResponseProjection typename() {
        return typename(null);
    }

    public KqiTemporalFrequencyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
