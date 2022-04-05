package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KqiTemporalFrequencyEdge
 */

public class KqiTemporalFrequencyEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KqiTemporalFrequencyEdgeResponseProjection() {
    }

    public KqiTemporalFrequencyEdgeResponseProjection all$() {
        return all$(3);
    }

    public KqiTemporalFrequencyEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("KqiTemporalFrequencyEdgeResponseProjection.KqiTemporalFrequencyResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiTemporalFrequencyEdgeResponseProjection.KqiTemporalFrequencyResponseProjection.node", projectionDepthOnFields.getOrDefault("KqiTemporalFrequencyEdgeResponseProjection.KqiTemporalFrequencyResponseProjection.node", 0) + 1);
            this.node(new KqiTemporalFrequencyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiTemporalFrequencyEdgeResponseProjection.KqiTemporalFrequencyResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public KqiTemporalFrequencyEdgeResponseProjection node(KqiTemporalFrequencyResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public KqiTemporalFrequencyEdgeResponseProjection node(String alias, KqiTemporalFrequencyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public KqiTemporalFrequencyEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public KqiTemporalFrequencyEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public KqiTemporalFrequencyEdgeResponseProjection typename() {
        return typename(null);
    }

    public KqiTemporalFrequencyEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
