package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for CounterFormula
 */

public class CounterFormulaResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CounterFormulaResponseProjection() {
    }

    public CounterFormulaResponseProjection all$() {
        return all$(3);
    }

    public CounterFormulaResponseProjection all$(int maxDepth) {
        this.id();
        this.mandatory();
        if (projectionDepthOnFields.getOrDefault("CounterFormulaResponseProjection.CounterResponseProjection.counterFk", 0) <= maxDepth) {
            projectionDepthOnFields.put("CounterFormulaResponseProjection.CounterResponseProjection.counterFk", projectionDepthOnFields.getOrDefault("CounterFormulaResponseProjection.CounterResponseProjection.counterFk", 0) + 1);
            this.counterFk(new CounterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CounterFormulaResponseProjection.CounterResponseProjection.counterFk", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CounterFormulaResponseProjection.FormulaResponseProjection.formulaFk", 0) <= maxDepth) {
            projectionDepthOnFields.put("CounterFormulaResponseProjection.FormulaResponseProjection.formulaFk", projectionDepthOnFields.getOrDefault("CounterFormulaResponseProjection.FormulaResponseProjection.formulaFk", 0) + 1);
            this.formulaFk(new FormulaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CounterFormulaResponseProjection.FormulaResponseProjection.formulaFk", 0)));
        }
        this.typename();
        return this;
    }

    public CounterFormulaResponseProjection id() {
        return id(null);
    }

    public CounterFormulaResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CounterFormulaResponseProjection mandatory() {
        return mandatory(null);
    }

    public CounterFormulaResponseProjection mandatory(String alias) {
        fields.add(new GraphQLResponseField("mandatory").alias(alias));
        return this;
    }

    public CounterFormulaResponseProjection counterFk(CounterResponseProjection subProjection) {
        return counterFk(null, subProjection);
    }

    public CounterFormulaResponseProjection counterFk(String alias, CounterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("counterFk").alias(alias).projection(subProjection));
        return this;
    }

    public CounterFormulaResponseProjection formulaFk(FormulaResponseProjection subProjection) {
        return formulaFk(null, subProjection);
    }

    public CounterFormulaResponseProjection formulaFk(String alias, FormulaResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("formulaFk").alias(alias).projection(subProjection));
        return this;
    }

    public CounterFormulaResponseProjection typename() {
        return typename(null);
    }

    public CounterFormulaResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
