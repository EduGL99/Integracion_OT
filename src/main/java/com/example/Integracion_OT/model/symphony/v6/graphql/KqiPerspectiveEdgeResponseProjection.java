package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for KqiPerspectiveEdge
 */

public class KqiPerspectiveEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KqiPerspectiveEdgeResponseProjection() {
    }

    public KqiPerspectiveEdgeResponseProjection all$() {
        return all$(3);
    }

    public KqiPerspectiveEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("KqiPerspectiveEdgeResponseProjection.KqiPerspectiveResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("KqiPerspectiveEdgeResponseProjection.KqiPerspectiveResponseProjection.node", projectionDepthOnFields.getOrDefault("KqiPerspectiveEdgeResponseProjection.KqiPerspectiveResponseProjection.node", 0) + 1);
            this.node(new KqiPerspectiveResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KqiPerspectiveEdgeResponseProjection.KqiPerspectiveResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public KqiPerspectiveEdgeResponseProjection node(KqiPerspectiveResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public KqiPerspectiveEdgeResponseProjection node(String alias, KqiPerspectiveResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public KqiPerspectiveEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public KqiPerspectiveEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public KqiPerspectiveEdgeResponseProjection typename() {
        return typename(null);
    }

    public KqiPerspectiveEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
