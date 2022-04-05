package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Kpi
 */

public class KpiResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public KpiResponseProjection() {
    }

    public KpiResponseProjection all$() {
        return all$(3);
    }

    public KpiResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("KpiResponseProjection.ThresholdResponseProjection.threshold", 0) <= maxDepth) {
            projectionDepthOnFields.put("KpiResponseProjection.ThresholdResponseProjection.threshold", projectionDepthOnFields.getOrDefault("KpiResponseProjection.ThresholdResponseProjection.threshold", 0) + 1);
            this.threshold(new ThresholdResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KpiResponseProjection.ThresholdResponseProjection.threshold", 0)));
        }
        this.status();
        if (projectionDepthOnFields.getOrDefault("KpiResponseProjection.DomainResponseProjection.domainFk", 0) <= maxDepth) {
            projectionDepthOnFields.put("KpiResponseProjection.DomainResponseProjection.domainFk", projectionDepthOnFields.getOrDefault("KpiResponseProjection.DomainResponseProjection.domainFk", 0) + 1);
            this.domainFk(new DomainResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KpiResponseProjection.DomainResponseProjection.domainFk", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("KpiResponseProjection.FormulaResponseProjection.formulaFk", 0) <= maxDepth) {
            projectionDepthOnFields.put("KpiResponseProjection.FormulaResponseProjection.formulaFk", projectionDepthOnFields.getOrDefault("KpiResponseProjection.FormulaResponseProjection.formulaFk", 0) + 1);
            this.formulaFk(new FormulaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KpiResponseProjection.FormulaResponseProjection.formulaFk", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("KpiResponseProjection.KpiCategoryResponseProjection.kpiCategoryFK", 0) <= maxDepth) {
            projectionDepthOnFields.put("KpiResponseProjection.KpiCategoryResponseProjection.kpiCategoryFK", projectionDepthOnFields.getOrDefault("KpiResponseProjection.KpiCategoryResponseProjection.kpiCategoryFK", 0) + 1);
            this.kpiCategoryFK(new KpiCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("KpiResponseProjection.KpiCategoryResponseProjection.kpiCategoryFK", 0)));
        }
        this.typename();
        return this;
    }

    public KpiResponseProjection id() {
        return id(null);
    }

    public KpiResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public KpiResponseProjection name() {
        return name(null);
    }

    public KpiResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public KpiResponseProjection description() {
        return description(null);
    }

    public KpiResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public KpiResponseProjection threshold(ThresholdResponseProjection subProjection) {
        return threshold(null, subProjection);
    }

    public KpiResponseProjection threshold(String alias, ThresholdResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("threshold").alias(alias).projection(subProjection));
        return this;
    }

    public KpiResponseProjection status() {
        return status(null);
    }

    public KpiResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public KpiResponseProjection domainFk(DomainResponseProjection subProjection) {
        return domainFk(null, subProjection);
    }

    public KpiResponseProjection domainFk(String alias, DomainResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("domainFk").alias(alias).projection(subProjection));
        return this;
    }

    public KpiResponseProjection formulaFk(FormulaResponseProjection subProjection) {
        return formulaFk(null, subProjection);
    }

    public KpiResponseProjection formulaFk(String alias, FormulaResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("formulaFk").alias(alias).projection(subProjection));
        return this;
    }

    public KpiResponseProjection kpiCategoryFK(KpiCategoryResponseProjection subProjection) {
        return kpiCategoryFK(null, subProjection);
    }

    public KpiResponseProjection kpiCategoryFK(String alias, KpiCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("kpiCategoryFK").alias(alias).projection(subProjection));
        return this;
    }

    public KpiResponseProjection typename() {
        return typename(null);
    }

    public KpiResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
