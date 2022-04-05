package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EquipmentPortDefinitionEdge
 */

public class EquipmentPortDefinitionEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EquipmentPortDefinitionEdgeResponseProjection() {
    }

    public EquipmentPortDefinitionEdgeResponseProjection all$() {
        return all$(3);
    }

    public EquipmentPortDefinitionEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("EquipmentPortDefinitionEdgeResponseProjection.EquipmentPortDefinitionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPortDefinitionEdgeResponseProjection.EquipmentPortDefinitionResponseProjection.node", projectionDepthOnFields.getOrDefault("EquipmentPortDefinitionEdgeResponseProjection.EquipmentPortDefinitionResponseProjection.node", 0) + 1);
            this.node(new EquipmentPortDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPortDefinitionEdgeResponseProjection.EquipmentPortDefinitionResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public EquipmentPortDefinitionEdgeResponseProjection node(EquipmentPortDefinitionResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public EquipmentPortDefinitionEdgeResponseProjection node(String alias, EquipmentPortDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortDefinitionEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public EquipmentPortDefinitionEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public EquipmentPortDefinitionEdgeResponseProjection typename() {
        return typename(null);
    }

    public EquipmentPortDefinitionEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
