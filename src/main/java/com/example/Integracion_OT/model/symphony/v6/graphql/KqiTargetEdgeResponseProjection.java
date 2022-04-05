package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KqiTargetEdge
 */

public class KqiTargetEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KqiTargetEdgeResponseProjection() {
    }

    public KqiTargetEdgeResponseProjection all$() {
        return all$(3);
    }

    public KqiTargetEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("KqiTargetEdgeResponseProjection.KqiTargetResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiTargetEdgeResponseProjection.KqiTargetResponseProjection.node", projectionDepthOnFields.getOrDefault("KqiTargetEdgeResponseProjection.KqiTargetResponseProjection.node", 0) + 1);
            this.node(new KqiTargetResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiTargetEdgeResponseProjection.KqiTargetResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public KqiTargetEdgeResponseProjection node(KqiTargetResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public KqiTargetEdgeResponseProjection node(String alias, KqiTargetResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public KqiTargetEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public KqiTargetEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public KqiTargetEdgeResponseProjection typename() {
        return typename(null);
    }

    public KqiTargetEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
