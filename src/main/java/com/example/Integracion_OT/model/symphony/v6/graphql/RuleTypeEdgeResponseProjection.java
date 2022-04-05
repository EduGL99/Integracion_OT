package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for RuleTypeEdge
 */

public class RuleTypeEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RuleTypeEdgeResponseProjection() {
    }

    public RuleTypeEdgeResponseProjection all$() {
        return all$(3);
    }

    public RuleTypeEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RuleTypeEdgeResponseProjection.RuleTypeResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RuleTypeEdgeResponseProjection.RuleTypeResponseProjection.node", projectionDepthOnFields.getOrDefault("RuleTypeEdgeResponseProjection.RuleTypeResponseProjection.node", 0) + 1);
            this.node(new RuleTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RuleTypeEdgeResponseProjection.RuleTypeResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public RuleTypeEdgeResponseProjection node(RuleTypeResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public RuleTypeEdgeResponseProjection node(String alias, RuleTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public RuleTypeEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public RuleTypeEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public RuleTypeEdgeResponseProjection typename() {
        return typename(null);
    }

    public RuleTypeEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
