package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KqiTemporalFrequencyConnection
 */

public class KqiTemporalFrequencyConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KqiTemporalFrequencyConnectionResponseProjection() {
    }

    public KqiTemporalFrequencyConnectionResponseProjection all$() {
        return all$(3);
    }

    public KqiTemporalFrequencyConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("KqiTemporalFrequencyConnectionResponseProjection.KqiTemporalFrequencyEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiTemporalFrequencyConnectionResponseProjection.KqiTemporalFrequencyEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("KqiTemporalFrequencyConnectionResponseProjection.KqiTemporalFrequencyEdgeResponseProjection.edges", 0) + 1);
            this.edges(new KqiTemporalFrequencyEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiTemporalFrequencyConnectionResponseProjection.KqiTemporalFrequencyEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("KqiTemporalFrequencyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiTemporalFrequencyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("KqiTemporalFrequencyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiTemporalFrequencyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public KqiTemporalFrequencyConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public KqiTemporalFrequencyConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public KqiTemporalFrequencyConnectionResponseProjection edges(KqiTemporalFrequencyEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public KqiTemporalFrequencyConnectionResponseProjection edges(String alias, KqiTemporalFrequencyEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public KqiTemporalFrequencyConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public KqiTemporalFrequencyConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public KqiTemporalFrequencyConnectionResponseProjection typename() {
        return typename(null);
    }

    public KqiTemporalFrequencyConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
