package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for FormulaEdge
 */

public class FormulaEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FormulaEdgeResponseProjection() {
    }

    public FormulaEdgeResponseProjection all$() {
        return all$(3);
    }

    public FormulaEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("FormulaEdgeResponseProjection.FormulaResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("FormulaEdgeResponseProjection.FormulaResponseProjection.node", projectionDepthOnFields.getOrDefault("FormulaEdgeResponseProjection.FormulaResponseProjection.node", 0) + 1);
            this.node(new FormulaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FormulaEdgeResponseProjection.FormulaResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public FormulaEdgeResponseProjection node(FormulaResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public FormulaEdgeResponseProjection node(String alias, FormulaResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public FormulaEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public FormulaEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public FormulaEdgeResponseProjection typename() {
        return typename(null);
    }

    public FormulaEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
