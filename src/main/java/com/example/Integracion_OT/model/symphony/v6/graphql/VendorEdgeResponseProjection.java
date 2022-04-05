package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for VendorEdge
 */

public class VendorEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public VendorEdgeResponseProjection() {
    }

    public VendorEdgeResponseProjection all$() {
        return all$(3);
    }

    public VendorEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("VendorEdgeResponseProjection.VendorResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("VendorEdgeResponseProjection.VendorResponseProjection.node", projectionDepthOnFields.getOrDefault("VendorEdgeResponseProjection.VendorResponseProjection.node", 0) + 1);
            this.node(new VendorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("VendorEdgeResponseProjection.VendorResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public VendorEdgeResponseProjection node(VendorResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public VendorEdgeResponseProjection node(String alias, VendorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public VendorEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public VendorEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public VendorEdgeResponseProjection typename() {
        return typename(null);
    }

    public VendorEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
