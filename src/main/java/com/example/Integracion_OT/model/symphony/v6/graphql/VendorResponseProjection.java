package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Vendor
 */

public class VendorResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public VendorResponseProjection() {
    }

    public VendorResponseProjection all$() {
        return all$(3);
    }

    public VendorResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("VendorResponseProjection.RecommendationsResponseProjection.vendorRecommendations", 0) <= maxDepth) {
            projectionDepthOnFields.put("VendorResponseProjection.RecommendationsResponseProjection.vendorRecommendations", projectionDepthOnFields.getOrDefault("VendorResponseProjection.RecommendationsResponseProjection.vendorRecommendations", 0) + 1);
            this.vendorRecommendations(new RecommendationsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("VendorResponseProjection.RecommendationsResponseProjection.vendorRecommendations", 0)));
        }
        this.typename();
        return this;
    }

    public VendorResponseProjection id() {
        return id(null);
    }

    public VendorResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public VendorResponseProjection name() {
        return name(null);
    }

    public VendorResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public VendorResponseProjection vendorRecommendations(RecommendationsResponseProjection subProjection) {
        return vendorRecommendations(null, subProjection);
    }

    public VendorResponseProjection vendorRecommendations(String alias, RecommendationsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("vendorRecommendations").alias(alias).projection(subProjection));
        return this;
    }

    public VendorResponseProjection typename() {
        return typename(null);
    }

    public VendorResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
