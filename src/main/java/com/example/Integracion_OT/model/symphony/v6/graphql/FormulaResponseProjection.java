package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Formula
 */

public class FormulaResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FormulaResponseProjection() {
    }

    public FormulaResponseProjection all$() {
        return all$(3);
    }

    public FormulaResponseProjection all$(int maxDepth) {
        this.id();
        this.textFormula();
        this.status();
        if (projectionDepthOnFields.getOrDefault("FormulaResponseProjection.TechResponseProjection.techFk", 0) <= maxDepth) {
            projectionDepthOnFields.put("FormulaResponseProjection.TechResponseProjection.techFk", projectionDepthOnFields.getOrDefault("FormulaResponseProjection.TechResponseProjection.techFk", 0) + 1);
            this.techFk(new TechResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FormulaResponseProjection.TechResponseProjection.techFk", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FormulaResponseProjection.NetworkTypeResponseProjection.networkTypeFk", 0) <= maxDepth) {
            projectionDepthOnFields.put("FormulaResponseProjection.NetworkTypeResponseProjection.networkTypeFk", projectionDepthOnFields.getOrDefault("FormulaResponseProjection.NetworkTypeResponseProjection.networkTypeFk", 0) + 1);
            this.networkTypeFk(new NetworkTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FormulaResponseProjection.NetworkTypeResponseProjection.networkTypeFk", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FormulaResponseProjection.KpiResponseProjection.kpiFk", 0) <= maxDepth) {
            projectionDepthOnFields.put("FormulaResponseProjection.KpiResponseProjection.kpiFk", projectionDepthOnFields.getOrDefault("FormulaResponseProjection.KpiResponseProjection.kpiFk", 0) + 1);
            this.kpiFk(new KpiResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FormulaResponseProjection.KpiResponseProjection.kpiFk", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FormulaResponseProjection.CounterFormulaResponseProjection.counterformulaFk", 0) <= maxDepth) {
            projectionDepthOnFields.put("FormulaResponseProjection.CounterFormulaResponseProjection.counterformulaFk", projectionDepthOnFields.getOrDefault("FormulaResponseProjection.CounterFormulaResponseProjection.counterformulaFk", 0) + 1);
            this.counterformulaFk(new CounterFormulaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FormulaResponseProjection.CounterFormulaResponseProjection.counterformulaFk", 0)));
        }
        this.typename();
        return this;
    }

    public FormulaResponseProjection id() {
        return id(null);
    }

    public FormulaResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public FormulaResponseProjection textFormula() {
        return textFormula(null);
    }

    public FormulaResponseProjection textFormula(String alias) {
        fields.add(new GraphQLResponseField("textFormula").alias(alias));
        return this;
    }

    public FormulaResponseProjection status() {
        return status(null);
    }

    public FormulaResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public FormulaResponseProjection techFk(TechResponseProjection subProjection) {
        return techFk(null, subProjection);
    }

    public FormulaResponseProjection techFk(String alias, TechResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("techFk").alias(alias).projection(subProjection));
        return this;
    }

    public FormulaResponseProjection networkTypeFk(NetworkTypeResponseProjection subProjection) {
        return networkTypeFk(null, subProjection);
    }

    public FormulaResponseProjection networkTypeFk(String alias, NetworkTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("networkTypeFk").alias(alias).projection(subProjection));
        return this;
    }

    public FormulaResponseProjection kpiFk(KpiResponseProjection subProjection) {
        return kpiFk(null, subProjection);
    }

    public FormulaResponseProjection kpiFk(String alias, KpiResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("kpiFk").alias(alias).projection(subProjection));
        return this;
    }

    public FormulaResponseProjection counterformulaFk(CounterFormulaResponseProjection subProjection) {
        return counterformulaFk(null, subProjection);
    }

    public FormulaResponseProjection counterformulaFk(String alias, CounterFormulaResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("counterformulaFk").alias(alias).projection(subProjection));
        return this;
    }

    public FormulaResponseProjection typename() {
        return typename(null);
    }

    public FormulaResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
