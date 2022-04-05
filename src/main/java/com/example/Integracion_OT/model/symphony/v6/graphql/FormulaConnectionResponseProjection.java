package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for FormulaConnection
 */

public class FormulaConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FormulaConnectionResponseProjection() {
    }

    public FormulaConnectionResponseProjection all$() {
        return all$(3);
    }

    public FormulaConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("FormulaConnectionResponseProjection.FormulaEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("FormulaConnectionResponseProjection.FormulaEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("FormulaConnectionResponseProjection.FormulaEdgeResponseProjection.edges", 0) + 1);
            this.edges(new FormulaEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FormulaConnectionResponseProjection.FormulaEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FormulaConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("FormulaConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("FormulaConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FormulaConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public FormulaConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public FormulaConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public FormulaConnectionResponseProjection edges(FormulaEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public FormulaConnectionResponseProjection edges(String alias, FormulaEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public FormulaConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public FormulaConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public FormulaConnectionResponseProjection typename() {
        return typename(null);
    }

    public FormulaConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
