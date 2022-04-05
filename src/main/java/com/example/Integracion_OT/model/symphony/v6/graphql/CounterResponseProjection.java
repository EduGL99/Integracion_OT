package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Counter
 */

public class CounterResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CounterResponseProjection() {
    }

    public CounterResponseProjection all$() {
        return all$(3);
    }

    public CounterResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.externalID();
        this.networkManagerSystem();
        if (projectionDepthOnFields.getOrDefault("CounterResponseProjection.CounterFormulaResponseProjection.counterformula", 0) <= maxDepth) {
            projectionDepthOnFields.put("CounterResponseProjection.CounterFormulaResponseProjection.counterformula", projectionDepthOnFields.getOrDefault("CounterResponseProjection.CounterFormulaResponseProjection.counterformula", 0) + 1);
            this.counterformula(new CounterFormulaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CounterResponseProjection.CounterFormulaResponseProjection.counterformula", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CounterResponseProjection.CounterFamilyResponseProjection.counterFamily", 0) <= maxDepth) {
            projectionDepthOnFields.put("CounterResponseProjection.CounterFamilyResponseProjection.counterFamily", projectionDepthOnFields.getOrDefault("CounterResponseProjection.CounterFamilyResponseProjection.counterFamily", 0) + 1);
            this.counterFamily(new CounterFamilyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CounterResponseProjection.CounterFamilyResponseProjection.counterFamily", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CounterResponseProjection.VendorResponseProjection.vendorFk", 0) <= maxDepth) {
            projectionDepthOnFields.put("CounterResponseProjection.VendorResponseProjection.vendorFk", projectionDepthOnFields.getOrDefault("CounterResponseProjection.VendorResponseProjection.vendorFk", 0) + 1);
            this.vendorFk(new VendorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CounterResponseProjection.VendorResponseProjection.vendorFk", 0)));
        }
        this.typename();
        return this;
    }

    public CounterResponseProjection id() {
        return id(null);
    }

    public CounterResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CounterResponseProjection name() {
        return name(null);
    }

    public CounterResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public CounterResponseProjection externalID() {
        return externalID(null);
    }

    public CounterResponseProjection externalID(String alias) {
        fields.add(new GraphQLResponseField("externalID").alias(alias));
        return this;
    }

    public CounterResponseProjection networkManagerSystem() {
        return networkManagerSystem(null);
    }

    public CounterResponseProjection networkManagerSystem(String alias) {
        fields.add(new GraphQLResponseField("networkManagerSystem").alias(alias));
        return this;
    }

    public CounterResponseProjection counterformula(CounterFormulaResponseProjection subProjection) {
        return counterformula(null, subProjection);
    }

    public CounterResponseProjection counterformula(String alias, CounterFormulaResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("counterformula").alias(alias).projection(subProjection));
        return this;
    }

    public CounterResponseProjection counterFamily(CounterFamilyResponseProjection subProjection) {
        return counterFamily(null, subProjection);
    }

    public CounterResponseProjection counterFamily(String alias, CounterFamilyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("counterFamily").alias(alias).projection(subProjection));
        return this;
    }

    public CounterResponseProjection vendorFk(VendorResponseProjection subProjection) {
        return vendorFk(null, subProjection);
    }

    public CounterResponseProjection vendorFk(String alias, VendorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("vendorFk").alias(alias).projection(subProjection));
        return this;
    }

    public CounterResponseProjection typename() {
        return typename(null);
    }

    public CounterResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
