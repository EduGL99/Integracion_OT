package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for AlarmFilterConnection
 */

public class AlarmFilterConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public AlarmFilterConnectionResponseProjection() {
    }

    public AlarmFilterConnectionResponseProjection all$() {
        return all$(3);
    }

    public AlarmFilterConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("AlarmFilterConnectionResponseProjection.AlarmFilterEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("AlarmFilterConnectionResponseProjection.AlarmFilterEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("AlarmFilterConnectionResponseProjection.AlarmFilterEdgeResponseProjection.edges", 0) + 1);
            this.edges(new AlarmFilterEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AlarmFilterConnectionResponseProjection.AlarmFilterEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("AlarmFilterConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("AlarmFilterConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("AlarmFilterConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AlarmFilterConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public AlarmFilterConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public AlarmFilterConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public AlarmFilterConnectionResponseProjection edges(AlarmFilterEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public AlarmFilterConnectionResponseProjection edges(String alias, AlarmFilterEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public AlarmFilterConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public AlarmFilterConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public AlarmFilterConnectionResponseProjection typename() {
        return typename(null);
    }

    public AlarmFilterConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
