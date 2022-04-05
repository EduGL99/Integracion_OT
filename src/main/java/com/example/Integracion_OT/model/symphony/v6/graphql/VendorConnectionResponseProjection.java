package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for VendorConnection
 */

public class VendorConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public VendorConnectionResponseProjection() {
    }

    public VendorConnectionResponseProjection all$() {
        return all$(3);
    }

    public VendorConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("VendorConnectionResponseProjection.VendorEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("VendorConnectionResponseProjection.VendorEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("VendorConnectionResponseProjection.VendorEdgeResponseProjection.edges", 0) + 1);
            this.edges(new VendorEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("VendorConnectionResponseProjection.VendorEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("VendorConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("VendorConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("VendorConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("VendorConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public VendorConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public VendorConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public VendorConnectionResponseProjection edges(VendorEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public VendorConnectionResponseProjection edges(String alias, VendorEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public VendorConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public VendorConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public VendorConnectionResponseProjection typename() {
        return typename(null);
    }

    public VendorConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
