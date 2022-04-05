package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for AlarmStatusConnection
 */

public class AlarmStatusConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public AlarmStatusConnectionResponseProjection() {
    }

    public AlarmStatusConnectionResponseProjection all$() {
        return all$(3);
    }

    public AlarmStatusConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("AlarmStatusConnectionResponseProjection.AlarmStatusEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("AlarmStatusConnectionResponseProjection.AlarmStatusEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("AlarmStatusConnectionResponseProjection.AlarmStatusEdgeResponseProjection.edges", 0) + 1);
            this.edges(new AlarmStatusEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AlarmStatusConnectionResponseProjection.AlarmStatusEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("AlarmStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("AlarmStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("AlarmStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AlarmStatusConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public AlarmStatusConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public AlarmStatusConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public AlarmStatusConnectionResponseProjection edges(AlarmStatusEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public AlarmStatusConnectionResponseProjection edges(String alias, AlarmStatusEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public AlarmStatusConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public AlarmStatusConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public AlarmStatusConnectionResponseProjection typename() {
        return typename(null);
    }

    public AlarmStatusConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
