package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EquipmentEdge
 */

public class EquipmentEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EquipmentEdgeResponseProjection() {
    }

    public EquipmentEdgeResponseProjection all$() {
        return all$(3);
    }

    public EquipmentEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("EquipmentEdgeResponseProjection.EquipmentResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentEdgeResponseProjection.EquipmentResponseProjection.node", projectionDepthOnFields.getOrDefault("EquipmentEdgeResponseProjection.EquipmentResponseProjection.node", 0) + 1);
            this.node(new EquipmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentEdgeResponseProjection.EquipmentResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public EquipmentEdgeResponseProjection node(EquipmentResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public EquipmentEdgeResponseProjection node(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public EquipmentEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public EquipmentEdgeResponseProjection typename() {
        return typename(null);
    }

    public EquipmentEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
