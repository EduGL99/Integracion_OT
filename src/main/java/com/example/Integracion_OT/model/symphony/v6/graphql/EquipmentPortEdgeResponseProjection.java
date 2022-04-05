package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EquipmentPortEdge
 */

public class EquipmentPortEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EquipmentPortEdgeResponseProjection() {
    }

    public EquipmentPortEdgeResponseProjection all$() {
        return all$(3);
    }

    public EquipmentPortEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("EquipmentPortEdgeResponseProjection.EquipmentPortResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPortEdgeResponseProjection.EquipmentPortResponseProjection.node", projectionDepthOnFields.getOrDefault("EquipmentPortEdgeResponseProjection.EquipmentPortResponseProjection.node", 0) + 1);
            this.node(new EquipmentPortResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPortEdgeResponseProjection.EquipmentPortResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public EquipmentPortEdgeResponseProjection node(EquipmentPortResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public EquipmentPortEdgeResponseProjection node(String alias, EquipmentPortResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public EquipmentPortEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public EquipmentPortEdgeResponseProjection typename() {
        return typename(null);
    }

    public EquipmentPortEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
